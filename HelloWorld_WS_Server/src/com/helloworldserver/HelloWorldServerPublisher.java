package com.helloworldserver;

import javax.xml.ws.Endpoint;

public class HelloWorldServerPublisher {

	public static void main(String[] args) {
		 
		System.out.println("*****Publication Starting*****");
		Endpoint.publish("http://localhost:7779/ws/hw", new HelloWorldServerImpl());
		System.out.println("*****Publication Success*****");
	}
}
