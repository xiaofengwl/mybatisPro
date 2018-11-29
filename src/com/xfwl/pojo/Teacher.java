package com.xfwl.pojo;

import java.util.List;

/**
 * 教师类
 * 
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月29日上午9:13:29
 */
public class Teacher {
	private int t_id; 			 // 教师ID(主键）
	private String t_name;		 // 教师名称
	private String t_sex; 		 // 教师性别
	private String t_address;	 // 所住地址
	private Card card;			 // 登记工牌[一对一]
	private List<TCourseTasks> tasks = null;// 当前教师的授课任务[一对多]

	/* getter和setter */
	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_sex() {
		return t_sex;
	}

	public void setT_sex(String t_sex) {
		this.t_sex = t_sex;
	}

	public String getT_address() {
		return t_address;
	}

	public void setT_address(String t_address) {
		this.t_address = t_address;
	}

	public List<TCourseTasks> getTasks() {
		return tasks;
	}

	public void setTasks(List<TCourseTasks> tasks) {
		this.tasks = tasks;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
}
