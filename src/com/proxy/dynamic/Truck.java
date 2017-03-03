package com.proxy.dynamic;

public class Truck implements Car{

	@Override
	public int runDistance(int time) {
		int result=time*500;
		System.out.println("卡车"+time+"秒跑了"+result+"米");
		return result;
	}

}
