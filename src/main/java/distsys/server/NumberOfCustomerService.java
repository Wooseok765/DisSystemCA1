/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.server;

import Generated_NumberOfCustomer_Service.CurrentCustomer;
import Generated_NumberOfCustomer_Service.Location;
import Generated_NumberOfCustomer_Service.NumberOfCustomerGrpc.NumberOfCustomerImplBase;
import io.grpc.stub.StreamObserver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class NumberOfCustomerService extends NumberOfCustomerImplBase {

    

    private static final Logger logger = Logger.getLogger(NumberOfCustomerService.class.getName());

    public NumberOfCustomerService() {

    }

    @Override
    public StreamObserver<Location> checkNumOfCustomer(StreamObserver<CurrentCustomer> responseObserver) {
        return new StreamObserver<Location>() {
            @Override
            public void onNext(Location c) {
                int numC = (int) (Math.random() * 100);
                CurrentCustomer response = CurrentCustomer.newBuilder()
                        .setLocation(c.getLocation())
                        .setCurrentNum(numC)
                        .build();
                responseObserver.onNext(response);

            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.SEVERE, "Error occurs at checkNumOfCustomer", t);

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }

        };
    }

}
