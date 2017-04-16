package com.factory;

public class Main {
	public static void main(String[] args){
		
		abstracto abi = abstracto.factory(1);
		factory factory = abi.getAreas(); 
		factory.factoryMethod();
	}
}
