package com.example.demo.creational.singleton;

public class StaticBlockInitialization {
private static  StaticBlockInitialization BLOCK_INITIALIZATION;
private StaticBlockInitialization() {
	
}
static {
	try {
		BLOCK_INITIALIZATION=new StaticBlockInitialization();	
	} catch (Exception e) {
	}
	
}
public static StaticBlockInitialization getInstance() {
	return BLOCK_INITIALIZATION;
}
}
