/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.server;

import Generated_Stock_Management_Service.ItemName;
import Generated_Stock_Management_Service.ItemStatus;
import Generated_Stock_Management_Service.Items;
import Generated_Stock_Management_Service.StockMgmtGrpc.StockMgmtImplBase;
import Generated_Stock_Management_Service.TotalPrice;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StockMgmtService extends StockMgmtImplBase {

    private static final Logger logger = Logger.getLogger(StockMgmtService.class.getName());

    private static StockMap stockMap;

    public static void main(String[] args) {
        stockMap = new StockMap();

        StockMgmtService stockMgm = new StockMgmtService();

        int port = 1234;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(stockMgm)
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);
            System.out.println("***** Server started, listening on" + port);
            server.awaitTermination();

        } catch (InterruptedException e) {
            e.printStackTrace(); // Shows where the issue is
            logger.log(Level.SEVERE, "There is issue with .awaitTermination()");

        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Ther is issue with serverBuilder");

        }

    }

    @Override
    // Client streaming
    public StreamObserver<Items> basketPrice(StreamObserver<TotalPrice> responseObserver) {
        return super.basketPrice(responseObserver); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
            StockMap.Item item = stockMap.getItemStatus(requestedItemName); // looks up item by stockMap object and assign it
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
