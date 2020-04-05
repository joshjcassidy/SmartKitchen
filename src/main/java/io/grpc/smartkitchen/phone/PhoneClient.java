package io.grpc.smartkitchen.phone;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.grpc.stub.StreamObservers;
import java.util.Iterator;

public class PhoneClient {
	
	private static  Logger logger = Logger.getLogger(Phone.class.getName());
	
	private static SmartPhoneGrpc.SmartPhoneBlockingStub blockingStub;
	private static SmartPhoneGrpc.SmartPhoneStub asyncStub;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).usePlaintext().build();
		
		blockingStub = SmartPhoneGrpc.newBlockingStub(channel);
		asyncStub = SmartPhoneGrpc.newStub(channel);
		
	}
	
	public static void temperature() {
		TemperatureRequest request = TemperatureRequest.newBuilder().setMessage("Temp").build();
		
		TemperatureResponse response;
		
		
		try {
			response = blockingStub.temperature(request);
			System.out.println(response.getMessage());
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}

	
	}
	
	public static void boil() {
		BoilRequest request = BoilRequest.newBuilder().setMessage("Boil").build();
		
		BoilResponse response;
		
		//Iterator<Phone> messages;
		
		try {
			response = blockingStub.boil(request);
			System.out.println(response.getBoilStarted());
			
			
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}

	
	}
	
	
	public static void preheat() {
		PreheatRequest request1 = PreheatRequest.newBuilder().setSetting("Fan").build();
		
		PreheatRequest request2 = PreheatRequest.newBuilder().setHeat(220).build();
		
		PreheatResponse response1;
		PreheatResponse response2;
		
		
		try {
			
			response1 = blockingStub.preheat(request1);
			System.out.println(response1.getOvenSettingSelected());
			
			response2 = blockingStub.preheat(request2);
			System.out.println(response2.getHeatSelected());
			
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}

	
	}
	
	public static void turnOff() {
		TurnOffRequest request1 = TurnOffRequest.newBuilder().setTurnOffHeat("Temp").build();
		
		TurnOffRequest request2 = TurnOffRequest.newBuilder().setTurnOffOven("Setting").build();
		
		TurnOffResponse response;
		
		
		try {
			//response = blockingStub.temperature(request);
			response = blockingStub = turnOff();
			System.out.println(response.getMessage());
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}

	
	}
	
	public static void lightsOn() {
		LightsOnRequest request = LightsOnRequest.newBuilder().setMessage("On").build();
		
		LightsOnResponse response;
		
		
		try {
			response = blockingStub.lightsOn(request);
			System.out.println(response.getMessage());
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}

	
	}
	
	public static void lightsOff() {
		LightsOffRequest request = LightsOffRequest.newBuilder().setMessage("Off").build();
		
		LightsOffResponse response;
		
		
		try {
			response = blockingStub.lightsOff(request);
			System.out.println(response.getMessage());
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}

	
	}
	

}
