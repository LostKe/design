package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler<T> implements InvocationHandler{
	
	private Object target;
	//生成代理对象	
	public T bind(Object target){
		this.target=target;
		return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		System.out.println("调用前");
		Object result=method.invoke(target, args);
		System.out.println("调用后");
		return result;
	}

}
