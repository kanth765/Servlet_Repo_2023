package com.ciq.singleton;

public class Singleton {
	// create an instance at time of class loading
	// make your private
	private static Singleton SINGLETON = new Singleton();

	private Singleton() {

	}

	public static Singleton getSingleton() {
		return SINGLETON;
	}

	public static void main(String[] args) {
		Singleton singleton = getSingleton();/// getServletContext();
		Singleton singleton2 = getSingleton();
		Singleton singleton3 = getSingleton();
		Singleton singleton4= getSingleton();
//		Singleton singleton=new Singleton();
//		Singleton singleton2=new Singleton();
//		Singleton singleton3=new Singleton();
//		Singleton singleton4=new Singleton();
		
		System.out.println(singleton);
		System.out.println(singleton2);
		System.out.println(singleton3);
		System.out.println(singleton4);
	}

}
