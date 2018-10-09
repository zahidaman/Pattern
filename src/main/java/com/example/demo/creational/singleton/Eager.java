package com.example.demo.creational.singleton;

public class Eager {
private static final Eager EAGER=new Eager();
private Eager() {
	
}
public static Eager getInstance() {
	return EAGER;
}

}
