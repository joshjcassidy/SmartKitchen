package io.grpc.smartkitchen.kettle;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import io.grpc.stub.StreamObserver;

public class HTTPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HttpServer server = HttpServer.create(new InetSocketAddress(8002), 0);
        
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
	
	//Kettle returns string that it has started boiling when called, and after 30 seconds informs the client that the kettle has finished boiling
	public void boil(BoilRequest request, StreamObserver<BoilResponse> responseObserver) throws InterruptedException {
		
		String acknowledgement = "Kettle boiling...";
		
		String finish = "Kettle has finished boiling";
		
		BoilResponse reply1 = BoilResponse.newBuilder().setBoilStarted(acknowledgement).build();
		
		BoilResponse reply2 = BoilResponse.newBuilder().setBoilStarted(finish).build();
		
		responseObserver.onNext(reply1);
		
		TimeUnit.SECONDS.sleep(30);
		
		responseObserver.onNext(reply2);
		
		responseObserver.onCompleted();
	}
}
