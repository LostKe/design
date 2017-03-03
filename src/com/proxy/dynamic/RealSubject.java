package com.proxy.dynamic;

public class RealSubject implements Subject{

	@Override
	public void doSomthing() {
		System.out.println("开始处理!");
		
	}

}
