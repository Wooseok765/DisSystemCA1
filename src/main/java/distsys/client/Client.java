/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package distsys.client;

import Generated_Stock_Management_Service.ItemName;
import Generated_Stock_Management_Service.ItemStatus;
import Generated_Stock_Management_Service.StockMgmtGrpc;
import Generated_Stock_Management_Service.StockMgmtGrpc.StockMgmtBlockingStub;
import static Generated_Stock_Management_Service.StockMgmtGrpc.newBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 *
 * @author User
 */
public class Client {
    
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
        
    }
    // Unary
    public static void getStatusOfItem(String itemName){
        ItemName request = ItemName.newBuilder().setItemName(itemName).build();
        ItemStatus itemStatus = blockingStub.stockCheck(request);
        System.out.println("Status of " + itemName + ":\n" + itemStatus);
    }
}
