package com.xfwl.pojo;
/**
 * 教室课程安排表
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月29日上午9:22:40
 */
public class TCourseTasks {
	
	private int tc_id; 			// 课程计划id（主键）
	private int tc_teacherId; 	// 教室ID（外键）
	private int tc_courseId;	// 课程ID（外键）
	private String tc_date; 	// 课程时间点
	private String tc_ren; 		// 课程备注
	
	/* getter和setter */
	public int getTc_id() {
		return tc_id;
	}
	public void setTc_id(int tc_id) {
		this.tc_id = tc_id;
	}
	public int getTc_teacherId() {
		return tc_teacherId;
	}
	public void setTc_teacherId(int tc_teacherId) {
		this.tc_teacherId = tc_teacherId;
	}
	public int getTc_courseId() {
		return tc_courseId;
	}
	public void setTc_courseId(int tc_courseId) {
		this.tc_courseId = tc_courseId;
	}
	public String getTc_date() {
		return tc_date;
	}
	public void setTc_date(String tc_date) {
		this.tc_date = tc_date;
	}
	public String getTc_ren() {
		return tc_ren;
	}
	public void setTc_ren(String tc_ren) {
		this.tc_ren = tc_ren;
	}
	@Override
	public String toString() {
		return "TCourseTasks [tc_id=" + tc_id + ", tc_teacherId="
				+ tc_teacherId + ", tc_courseId=" + tc_courseId + ", tc_date="
				+ tc_date + ", tc_ren=" + tc_ren + "]";
	}
	

}
