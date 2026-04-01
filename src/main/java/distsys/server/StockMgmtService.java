/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.server;

import Generated_Stock_Management_Service.ItemName;
import Generated_Stock_Management_Service.ItemStatus;
import Generated_Stock_Management_Service.StockMgmtGrpc.StockMgmtImplBase;
import Generated_Stock_Management_Service.TotalPrice;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StockMgmtService extends StockMgmtImplBase {

    private static final Logger logger = Logger.getLogger(StockMgmtService.class.getName());

    private StockMap stockMap;

    public StockMgmtService(StockMap stockMap) {
        this.stockMap = stockMap;
    }

    @Override
    // Client streaming 
    public StreamObserver<ItemName> basketPrice(StreamObserver<TotalPrice> responseObserver) {
        return new StreamObserver<ItemName>() {
            ArrayList<Double> list = new ArrayList<>();

            int quantityOfItems = 0;

            public void onNext(ItemName request) {

                String requestedItem = request.getItemName();
                if (stockMap.containsKey(requestedItem)) {
                    double priceOfItem = stockMap.getItemStatus(requestedItem).getPrice();
                    list.add(priceOfItem);
                    quantityOfItems = quantityOfItems + 1;
                    System.out.println("Price information registered: " + requestedItem + "(" + priceOfItem + ")");
                } else {
                    return;
                }

            }

            public void onError(Throwable t) {
                logger.log(Level.SEVERE, "Issue occurs in basketPrice()", t);
                System.out.println("Issue occurs in basketPrice()");

            }

            public void onCompleted() {
                double tempPrice = 0.0;
                for (double p : list) {

                    tempPrice = tempPrice + p;

                }
                TotalPrice result = TotalPrice.newBuilder()
                        .setQuantityOfItems(quantityOfItems)
                        .setTotalPrice(tempPrice)
                        .build();

                responseObserver.onNext(result);
                // Send back a response to client

                responseObserver.onCompleted();

            }

        };
    }

    @Override
    // Unary
    public void stockCheck(ItemName request, StreamObserver<ItemStatus> responseObserver) {
        String requestedItemName = request.getItemName();
        System.out.println("Server received request: " + requestedItemName + "\n");

        if (stockMap.containsKey(requestedItemName)) {
            StockMap.Item item = stockMap.getItemStatus(requestedItemName); // looks up item by stockMap object and assign it
            ItemStatus statusOfRequestedItem = ItemStatus.newBuilder()
                    .setItemName(item.getName())
                    .setQuantity(item.getQuantity())
                    .setExpiryDate(item.getExpiry_date())
                    .setLocation(item.getLocation()).build();
            responseObserver.onNext(statusOfRequestedItem);
            System.out.println("Server sent response to client");
            responseObserver.onCompleted();
            System.out.println("Server executed onCompleted");
        } else {
            ItemStatus statusOfRequestedItem = ItemStatus.newBuilder()
                    .setItemName(requestedItemName)
                    .setQuantity(0)
                    .setExpiryDate("Not Found")
                    .setLocation("Not in stock").build();
            responseObserver.onNext(statusOfRequestedItem);
            responseObserver.onCompleted();

        }
    }
}
