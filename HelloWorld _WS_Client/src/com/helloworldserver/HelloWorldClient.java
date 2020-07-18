package com.helloworldserver;

import java.net.URL;  
import javax.xml.namespace.QName;  
import javax.xml.ws.Service;  

public class HelloWorldClient {

	  public static void main(String[] args) throws Exception {  
		    URL url = new URL("http://localhost:7779/ws/hw?wsdl");  
		   
		        QName qname = new QName("http://helloworldserver.com/", "HelloWorldServerImplService");  
		        Service service = Service.create(url, qname);  
		        HelloWorldServer hello = service.getPort(HelloWorldServer.class);   
		        System.out.println(hello.greatingHello("Welcome All...."));  
		     } 
}
