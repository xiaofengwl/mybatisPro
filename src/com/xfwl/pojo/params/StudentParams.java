package com.xfwl.pojo.params;

import com.xfwl.pojo.enums.SexEnum;

/**
 * 学生类的参数类
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月27日下午2:39:10
 */
public class StudentParams {
	  private String st_id;  	//id
	  private String st_name; 	//名称
	  private String st_age ;	//年龄
	  private String st_ren ;	//备注
	  private String st_others ;//其他说明
	  private String st_email ; //邮件
	  private String st_address ;//居住地址
	  private SexEnum st_sex ;//性别
	  /*getter和setter*/
		public String getSt_id() {
			return st_id;
		}
		public void setSt_id(String st_id) {
			this.st_id = st_id;
		}
		public String getSt_name() {
			return st_name;
		}
		public void setSt_name(String st_name) {
			this.st_name = st_name;
		}
		public String getSt_age() {
			return st_age;
		}
		public void setSt_age(String st_age) {
			this.st_age = st_age;
		}
		public String getSt_ren() {
			return st_ren;
		}
		public void setSt_ren(String st_ren) {
			this.st_ren = st_ren;
		}
		public String getSt_others() {
			return st_others;
		}
		public void setSt_others(String st_others) {
			this.st_others = st_others;
		}
		public String getSt_email() {
			return st_email;
		}
		public void setSt_email(String st_email) {
			this.st_email = st_email;
		}
		public String getSt_address() {
			return st_address;
		}
		public void setSt_address(String st_address) {
			this.st_address = st_address;
		}
		
		public SexEnum getSt_sex() {
			return st_sex;
		}
		public void setSt_sex(SexEnum st_sex) {
			this.st_sex = st_sex;
		}
}
