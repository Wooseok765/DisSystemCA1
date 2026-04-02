/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.server;

import Generated_Stock_Management_Service.ItemName;
import Generated_Stock_Monitor_Service.Empty;
import Generated_Stock_Monitor_Service.ItemStatus;
import Generated_Stock_Monitor_Service.SoldItem;
import Generated_Stock_Monitor_Service.StockMonitorGrpc.StockMonitorImplBase;
import io.grpc.stub.StreamObserver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StockMonitorService extends StockMonitorImplBase {

    private static final Logger logger = Logger.getLogger(StockMonitorService.class.getName());

    private StockMap stockMap;

    public StockMonitorService(StockMap stockMap) {
        this.stockMap = stockMap;
    }

    @Override
    // Bidirectional streaming
    // It will be executed when user press the button and sent ItemStatus type data to GUI
    public StreamObserver<SoldItem> autoStockCheck(StreamObserver<ItemStatus> responseObserver) {
        return new StreamObserver<SoldItem>() {

            @Override
            public void onNext(SoldItem item) {
                String requestedItem = item.getItemName();
                if (stockMap.containsKey(requestedItem)) { // If there are required item in stock
                    StockMap.Item itemInfo = stockMap.getItemStatus(requestedItem);
                    int numItem = itemInfo.getQuantity();
                    if (numItem <= 0) { // If the item was out of stock
                        ItemStatus response = ItemStatus.newBuilder()
                                .setItemName(requestedItem)
                                .setQuantity(0)
                                .setExpiryDate("Not Found")
                                .setLocation("Not in stock").build();
                        responseObserver.onNext(response);
                        
                    } else { // Decrease the item quantity
                        itemInfo.setQuantity(numItem - 1);
                        ItemStatus response = ItemStatus.newBuilder()
                                .setQuantity(itemInfo.getQuantity())
                                .setItemName(itemInfo.getName())
                                .setExpiryDate(itemInfo.getExpiry_date())
                                .setLocation(itemInfo.getLocation())
                                .build();
                        responseObserver.onNext(response);
                        // The changed value is sent to client(itemStatus)
                        // and The value is displyed on StatusOfSoldItemTextArea

                    }

                } else {
                    ItemStatus response = ItemStatus.newBuilder()
                            .setItemName(requestedItem)
                            .setQuantity(0)
                            .setExpiryDate("Not Found")
                            .setLocation("Not in stock").build();
                    responseObserver.onNext(response);
                    
                }
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error occurred: " + t.getMessage());
                logger.log(Level.SEVERE, "Error occurred: " + t);

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    // Server streaming
    public void expiryDate(Empty request, StreamObserver<ItemStatus> responseObserver) {
        try {

            for (Object obj : stockMap.getExpiredItem()) { // got ExpiredItemList from StockMap
                StockMap.Item expiredItem = (StockMap.Item) obj;
                ItemStatus response = ItemStatus.newBuilder()
                        .setItemName(expiredItem.getName())
                        .setQuantity(expiredItem.getQuantity())
                        .setExpiryDate(expiredItem.getExpiry_date())
                        .setLocation(expiredItem.getLocation())
                        .build();
                responseObserver.onNext(response); // Sent expired item to GUI one by one
                Thread.sleep(1000);
            }
            responseObserver.onCompleted();
        }
        catch(InterruptedException e){
            logger.log(Level.SEVERE, "Error occurs with Thread.sleap() ");
            responseObserver.onError(e);
        }

    }

}
