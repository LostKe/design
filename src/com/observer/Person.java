package com.observer;

public class Person implements Observer{

	@Override
	public void onChange(Subject sub) {
			if(sub instanceof WeatherStation){
				WeatherStation weatherStation=(WeatherStation) sub;
				System.out.println("当前温度为："+weatherStation.getTemperature());
			}
	}

}
