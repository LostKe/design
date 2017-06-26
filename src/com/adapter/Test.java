package com.adapter;

public class Test {
	public static void main(String[] args) {
		Car car=new Car();
		CarAdapter adapter=new CarAdapter();
		car.setAdapter(adapter);
		car.assemble();
	}
}
