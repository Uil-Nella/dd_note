package org.dd.note.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHello(@WebParam(name="text") String text) {
		System.out.println("say Hello called");
		return "Hello" + text + ",this is a world";
	}

}
