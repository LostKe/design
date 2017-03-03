package com.adapter;

import java.util.List;

/**
 * 汽车的某一个位置需要什么样的零件
 * @author youx
 *
 */
public class CarAdapter  extends BaseAdapter{
	private List<Part> partList;
	CarAdapter(List<Part> partList){
		this.partList=partList;
	}
	
	@Override
	public int getCount() {
		return partList.size();
	}
	
	@Override
	public Object getItem(int position) {
		return partList.get(position);
	}

	@Override
	public int getItemId(int position) {
		return position;
	}

	

	

}
