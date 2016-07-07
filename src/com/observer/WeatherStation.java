package com.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 气象站 可以发布消息
 * @author youx
 *
 */
public class WeatherStation implements Subject{
	
	private List<Observer> observers=new ArrayList<Observer>();

	@Override
	public void addObServer(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObServer(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver(){
		for (Observer observer : observers) {
			observer.onChange(this);
		}
	}
	
	public int getTemperature(){
		return 25;
	}
	
}
