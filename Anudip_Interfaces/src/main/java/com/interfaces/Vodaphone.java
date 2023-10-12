package com.interfaces;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("You are using Vodaphone");
		
	}

	@Override
	public void data() {
		System.out.println("Call made using Vodaphone");
		
	}

}
