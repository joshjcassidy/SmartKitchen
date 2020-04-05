package io.grpc.smartkitchen.fridge;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import io.grpc.smartkitchen.testfridge.TemperatureRequest;
import io.grpc.smartkitchen.testfridge.TemperatureResponse;
import io.grpc.stub.StreamObserver;

public class HTTPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HttpServer server = HttpServer.create(new InetSocketAddress(8001), 0);
        
        server.createContext("/index.html", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
	}
	
	static class MyHandler implements HttpHandler {
    	
	       
        public void handle(HttpExchange t) throws IOException {
            
        	String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
            
        }
    }
	
	public void temperature(TemperatureRequest request, StreamObserver<TemperatureResponse> responseObserver) {
		
		String temperature = "14 degrees";
		
		TemperatureResponse reply = TemperatureResponse.newBuilder().setMessage(temperature).build();
		
		responseObserver.onNext(reply);
		
		responseObserver.onCompleted();
	}

}
