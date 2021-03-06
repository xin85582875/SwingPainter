package com.finalproject.configure;

/**
 * 一个代表线条粗细的枚举类。
 * 
 * @author Yixin
 *
 */
public enum LineThickness {
	
	THIN(3),
	MIDDLE(6),
	THICK(10);
	
	private int val;
	
	private LineThickness(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	
	
}
