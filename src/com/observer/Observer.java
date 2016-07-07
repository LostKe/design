package com.observer;

/**
 * 接收者
 * @author youx
 *
 */
public interface Observer {
	
	public void onChange(Subject sub);
}
