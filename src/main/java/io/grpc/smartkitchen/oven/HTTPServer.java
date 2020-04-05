package io.grpc.smartkitchen.oven;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import io.grpc.stub.StreamObserver;

public class HTTPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HttpServer server = HttpServer.create(new InetSocketAddress(8003), 0);
        
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
	
	//When called, returns responses to the client informing it of the oven setting (eg. fan) and heat that have been selected and are turned on.
	public void preheat(PreheatRequest request1, PreheatRequest request2, StreamObserver<PreheatResponse> responseObserver) {
		
		String setting = "Setting " + request1 + "has been selected.";
		
		String heat = "Heat " + request2.toString() + "has been selected.";
		
		PreheatResponse reply1 = PreheatResponse.newBuilder().setOvenSettingSelected(setting).build();
		
		PreheatResponse reply2 = PreheatResponse.newBuilder().setOvenSettingSelected(heat).build();
		
		responseObserver.onNext(reply1);
		
		responseObserver.onNext(reply2);
		
		responseObserver.onCompleted();
	}
	

	//When called, returns message to client informing it that the oven has been turned off
	public void turnOff(TurnOffRequest request, StreamObserver<TurnOffResponse> responseObserver) {
		
		String finished = "Oven has been turned off.";
	
		TurnOffResponse reply = TurnOffResponse.newBuilder().setMessage(finished).build();
		
		responseObserver.onNext(reply);
		
		responseObserver.onCompleted();
	}
}
