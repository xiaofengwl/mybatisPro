package com.xfwl.pojo;

import com.xfwl.pojo.enums.SexEnum;

/**
 * 课程类
 * 
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月29日上午9:17:41
 */
public class Course {
	private int c_id; 			// 课程id
	private String c_name; 		// 课程名称
	private String c_address;	// 授课地址（所在教室位置）
	private String c_ren; 		// 课程备注

	/* getter和setter */
	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_address() {
		return c_address;
	}

	public void setC_address(String c_address) {
		this.c_address = c_address;
	}

	public String getC_ren() {
		return c_ren;
	}

	public void setC_ren(String c_ren) {
		this.c_ren = c_ren;
	}
}
