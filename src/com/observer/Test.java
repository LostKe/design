package com.observer;

public class Test {
	public static void main(String[] args) {
		//模拟气象站
		WeatherStation weatherStation=new WeatherStation();
		
		//模拟获取天气的用户
		
		Person person =new Person();
		
		weatherStation.addObServer(person);
		//当气象站发送消息时,所有实现了Observer的观察者都能够接收到消息
		weatherStation.notifyObserver();
		
	}

}
