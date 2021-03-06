package io.grpc.smartkitchen.kettle;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class KettleRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "kettle", 8002, "path=index.html");
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
