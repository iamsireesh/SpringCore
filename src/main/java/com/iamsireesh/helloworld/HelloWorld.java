package com.iamsireesh.helloworld;

public class HelloWorld {
private String message;

public HelloWorld(){
	System.out.println("Constructor Executed");
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String wish(String uname){
	return message+" "+uname+ " "+"Have a nice day!";
	
}
}
