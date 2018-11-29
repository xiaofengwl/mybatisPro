package com.xfwl.pojo;
/**
 * 登记工牌
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月29日上午10:04:31
 */
public class Card {
	
	private String cd_no; 		// 工牌登记编号(主键）
	private int cd_teacherId;   // 教师ID
	private String cd_date;     // 登记日期
	private String cd_ren;      // 备注
	
	/* getter和setter */
	public String getCd_no() {
		return cd_no;
	}
	public void setCd_no(String cd_no) {
		this.cd_no = cd_no;
	}
	public int getCd_teacherId() {
		return cd_teacherId;
	}
	public void setCd_teacherId(int cd_teacherId) {
		this.cd_teacherId = cd_teacherId;
	}
	public String getCd_date() {
		return cd_date;
	}
	public void setCd_date(String cd_date) {
		this.cd_date = cd_date;
	}
	public String getCd_ren() {
		return cd_ren;
	}
	public void setCd_ren(String cd_ren) {
		this.cd_ren = cd_ren;
	}
	@Override
	public String toString() {
		return "Card [cd_no=" + cd_no + ", cd_teacherId=" + cd_teacherId
				+ ", cd_date=" + cd_date + ", cd_ren=" + cd_ren + "]";
	}
	
}
