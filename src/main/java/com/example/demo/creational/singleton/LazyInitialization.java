package com.example.demo.creational.singleton;

public class LazyInitialization {
private static  LazyInitialization INITIALIZATION;
private LazyInitialization() {
	
}

public static LazyInitialization getInstance() {
	if(INITIALIZATION==null) {
		INITIALIZATION=new LazyInitialization();
	}
	return INITIALIZATION;
}
}
