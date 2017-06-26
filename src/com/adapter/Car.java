package com.adapter;

public class Car {
	
	private BaseAdapter adapter;
	
	private int mCount;
	
	public void setAdapter(BaseAdapter adapter){
		this.adapter=adapter;
	}

	/**
	 * 组装
	 */
	public void assemble(){
		mCount=adapter.getCount();
		
		for (int i = 0; i < mCount; i++) {
				//这里 获得不同的零件
			System.out.println("组装零件："+i);
			  Part part=(Part) adapter.getItem(i);
		}
	}

}
