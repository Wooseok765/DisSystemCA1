/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package distsys.client;

import Generated_Stock_Management_Service.ItemName;
import Generated_Stock_Management_Service.ItemStatus;
import Generated_Stock_Management_Service.StockMgmtGrpc;
import Generated_Stock_Management_Service.StockMgmtGrpc.StockMgmtBlockingStub;
import static Generated_Stock_Management_Service.StockMgmtGrpc.newBlockingStub;
import static Generated_Stock_Management_Service.StockMgmtGrpc.newStub;
import Generated_Stock_Management_Service.TotalPrice;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Client {

    private static final Logger clientLogger = Logger.getLogger(Client.class.getName());
    private static StockMgmtBlockingStub blockingStub; // For using several time from diverse method
    private static StockMgmtGrpc.StockMgmtStub non_blockingStub;

    public static void main(String[] args) {
        int port = 1234;
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", port)
                .usePlaintext()
                .build();

        blockingStub = newBlockingStub(channel);
        getStatusOfItem("apple");

        non_blockingStub = newStub(channel);
        getTotalBasketPrice();
        

    }

    // Unary
    public static void getStatusOfItem(String itemName) {
        ItemName request = ItemName.newBuilder().setItemName(itemName).build();
        ItemStatus itemStatus = blockingStub.stockCheck(request);
        System.out.println("Status of " + itemName + ":\n" + itemStatus);
    }

    // Client streaming
    public static void getTotalBasketPrice() {
        StreamObserver<TotalPrice> totalPrice = new StreamObserver<TotalPrice>() {

            // Ready to get response from basketPrice() in StockMgmtService
            public void onNext(TotalPrice p) {
                System.out.println("Response arrived: " + "\nCost: " + p.getTotalPrice()
                        + "\nQuantity of items: " + p.getQuantityOfItems());

            }

            public void onError(Throwable t) {
                clientLogger.log(Level.SEVERE, "Issue occurs in getTotalBasketPrkce()", t);
                System.out.println("Issue occurs in getTotalBasketPrkce()");
            }

            public void onCompleted() {
                System.out.println("Stream is completed");

            }
        };

        StreamObserver<ItemName> itemName = non_blockingStub.basketPrice(totalPrice);
        // Execute basketPrice() with arguement(totalPrice)
        // then it gets back return value from basketPrice() which is total price
        // StreamObserver<ItemName> type
        

        try {
            itemName.onNext(ItemName.newBuilder().setItemName("Apple").build());
            // Price of apple: 0.99(Defined in StockMap class)
            Thread.sleep(500);
            // Send itemName to basketPrice() in StockMgmtService and pause for 500 millisecond

            itemName.onNext(ItemName.newBuilder().setItemName("Apple").build());
            Thread.sleep(500);

            itemName.onNext(ItemName.newBuilder().setItemName("watermelon").build());
            // It the requested item isn't in StockMap, it doesn't add price
            Thread.sleep(500);
            // Price of apple: 2.30(Defined in StockMap class)
            itemName.onCompleted();
            Thread.sleep(1000);
            // Wait until get response from server
            // and disconnect non_blocking stub

        } catch (InterruptedException e) {
            clientLogger.log(Level.SEVERE, "There is issue with .Thread.sleep()", e);
        }

    }
}
