package com.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 相当于一个组装图纸
 * 汽车的某一个位置需要什么样的零件
 * @author youx
 *
 */
public class CarAdapter  extends BaseAdapter{
	private static List<Part> partList;

	static {
		partList=new ArrayList<>();
		partList.add(new Part());
		partList.add(new Part());
		partList.add(new Part());
	}
    public CarAdapter() {

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
