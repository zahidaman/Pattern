package com.example.demo.behavioural;

import com.example.demo.behavioural.TemplateMethod.BuildVehicle;
import com.example.demo.behavioural.TemplateMethod.Car;
import com.example.demo.behavioural.TemplateMethod.MotorCycle;

public class VehicleClient {

	public static void main(String[] args) {
		BuildVehicle buildVehicle=new Car();
		buildVehicle.buildVehicle();
		System.out.println("************");
		buildVehicle=new MotorCycle();
		buildVehicle.buildVehicle();

	}

}
