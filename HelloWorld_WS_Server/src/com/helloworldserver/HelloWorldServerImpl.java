package com.helloworldserver;

import javax.jws.WebService; 

@WebService(endpointInterface = "com.helloworldserver.HelloWorldServer")  
public class HelloWorldServerImpl implements HelloWorldServer {

	@Override
	public String greatingHello(String strName) {
		return "Greetings from Hello World Web Service Server : Hello " + strName;
	}

}
