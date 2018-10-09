package com.example.demo.creational.singleton;

public class BillPughSingleton {
private static class BillPughSingletonHelper{
	private static  BillPughSingleton INSTANCE=new BillPughSingleton();
}
public static BillPughSingleton getInstance() {
	return BillPughSingletonHelper.INSTANCE;
} 
}
