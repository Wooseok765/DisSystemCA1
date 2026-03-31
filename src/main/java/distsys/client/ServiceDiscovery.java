/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.client;

/**
 *
 * @author trion
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.JOptionPane;

// This code is adapted from https://github.com/jmdns/jmdns
public class ServiceDiscovery {

    private String requiredServiceType;
    private String requiredServiceName;
    private JmDNS jmdns;
    private String host;
    private int port;

    public ServiceDiscovery(String inServiceType, String inServiceName) {
        requiredServiceType = inServiceType;
        requiredServiceName = inServiceName;
    }

    public void discoverService(long timeoutMilliseconds) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        try {

            // Create a JmDNS instance
            jmdns = JmDNS.create(InetAddress.getLocalHost()); // Create jmdns object with local pc's IP address
            System.out.println("Client: InetAddress.getLocalHost():" + InetAddress.getLocalHost());

            // Add a service listener that listens for the required service type on localhost
            jmdns.addServiceListener(requiredServiceType, new ServiceListener() {
                // If required service type is found(such as "_http._tcp.local."), create ServiceListener object
                // When it found the required service, it will execute the codes below

                @Override
                public void serviceAdded(ServiceEvent event) {
                    ServiceInfo info = event.getInfo();
                    System.out.println("Service added: " + event.getInfo());
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("Service removed: " + event.getInfo());
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println("Service resolved: " + event.getInfo()); // event has port number, service name, ip address, metadata
                    ServiceInfo info = event.getInfo();
                    port = info.getPort();
                    String resolvedServiceName = info.getName();

                    System.out.println("####service " + resolvedServiceName + " resolved at: " + port);

                    // check if the name of the service is the one we are looking for - if not we
                    // just ignore it.
                    if (resolvedServiceName.contains(requiredServiceName)) {
                        // the URL information that was discovered is passed onto the HttpClient
                        host = info.getHostAddresses()[0]; 
                        port = info.getPort();

                        System.out.println("Discovered service named: " + resolvedServiceName);
                        System.out.println("Port: " + port);
                        System.out.println("Host: " + host);
                        // the event we were waiting for has happened. Release the latch.  
                        latch.countDown();
                    }

                }
            });

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // if there was no service resolved of the required type latch will timeoout
        latch.await(timeoutMilliseconds, TimeUnit.MILLISECONDS);// If the service is found in the timeout, the latch will be relesed

    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public void close() throws IOException {
        if (jmdns != null) {
            jmdns.close();
        }
    }

}
