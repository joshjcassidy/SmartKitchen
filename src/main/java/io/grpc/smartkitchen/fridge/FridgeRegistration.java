package io.grpc.smartkitchen.fridge;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class FridgeRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "fridge", 8001, "path=index.html");
            jmdns.registerService(serviceInfo);
            
            // Wait a bit
            Thread.sleep(20000);

            // Unregister all services
            //jmdns.unregisterAllServices();
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}

}
