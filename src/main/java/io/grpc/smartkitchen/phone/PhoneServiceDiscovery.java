package io.grpc.smartkitchen.phone;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import io.grpc.smartkitchen.testphone.GetRequest;

public class PhoneServiceDiscovery {
	
private static class PhoneServiceListener implements ServiceListener {
		
		
		public void serviceAdded(ServiceEvent event) {
			System.out.println("Service added: " + event.getInfo());
		}

		
		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}

		
		public void serviceResolved(ServiceEvent event) {
					System.out.println("Service resolved: " + event.getInfo());
			
                    ServiceInfo info = event.getInfo();
                    int port = info.getPort();
                    String path = info.getNiceTextString().split("=")[1];
                   
                    String url =  "http://localhost:"+port+"/"+path;
                    System.out.println(" --- sending request to " + url);
                    
                    GetRequest.request(url);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
