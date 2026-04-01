/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ServerMain {

    private static final Logger logger = Logger.getLogger(ServerMain.class.getName());

    public static void main(String[] args) {
        StockMap stockMap = new StockMap();
        int port = 1234;
        
        StockMgmtService stockMgm = new StockMgmtService(stockMap);
        StockMonitorService stockMonitor = new StockMonitorService(stockMap);
        
        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(stockMgm)
                    .addService(stockMonitor)
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);
            System.out.println("***** Server started, listening on" + port);
            
            ServiceRegistration register = ServiceRegistration.getInstance(); // Create ServiceRegistration object so that the methods in it can be used
            register.registerService("_grpc._tcp.local.", "Server main", port, "service=StockMgmtService, StockMonitorService"); // Register an location information of the service on the network
            
            server.awaitTermination();

        } catch (InterruptedException e) {
            e.printStackTrace(); // Shows where the issue is
            logger.log(Level.SEVERE, "There is issue with .awaitTermination()", e);

        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Ther is issue with serverBuilder", e);

        }

    }

}
