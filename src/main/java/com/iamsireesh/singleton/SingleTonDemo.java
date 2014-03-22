package com.iamsireesh.singleton;

public class SingleTonDemo {

	public static void main(String[] args) {
		SingleTon o1=SingleTon.getInstance();
		System.out.println(o1.hashCode());
		
		SingleTon o2=SingleTon.getInstance();
		System.out.println(o2.hashCode());

	}

}
