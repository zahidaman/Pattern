package com.example.demo.behavioural.TemplateMethod;

public abstract class BuildVehicle {
public final void buildVehicle() {
	buildFoundation();
	buildEngine();
	installAssemble();
	
}

private void installAssemble() {
	System.out.println("assembling");
	
}

private  void buildFoundation() {
	System.out.println("build foundation");
}
public abstract void buildEngine();

}
