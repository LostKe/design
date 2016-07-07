package com.observer;

/**
 * 主题：用来发布消息
 * @author youx
 *
 */
public interface Subject {
	
	public void addObServer(Observer observer);
	
	public void removeObServer(Observer observer);
	
	/**
	 * 该方法应该是由某一事件触发而产生的调用
	 */
	public void notifyObserver();
}
