package com.proxy.dynamic;

public class Test {
	public static void main(String[] args) {
		ProxyHandler<Subject> handler=new ProxyHandler<Subject>();
		Subject proxySub=handler.bind(new RealSubject());
		proxySub.doSomthing();
		
		ProxyHandler<Car> carHandler=new ProxyHandler<Car>();
		Car car=carHandler.bind(new Truck());
		car.runDistance(100);
	}
}
