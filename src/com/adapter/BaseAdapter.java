package com.adapter;

public abstract class BaseAdapter {
	
	public abstract int getCount();
	
	public abstract Object getItem(int position);
	
	public abstract int getItemId(int position);
}
