package com.iamsireesh.singleton;

public class SingleTon {
	//Create an object of single ton class
	private static SingleTon singleTon = new SingleTon();
    
	//create private constructor so that no chance instantiating an object 
	//from outside the class
	private SingleTon() {
	}
    //create static method to access the single ton object obejct
	public static SingleTon getInstance() {
		return singleTon;
	}
}