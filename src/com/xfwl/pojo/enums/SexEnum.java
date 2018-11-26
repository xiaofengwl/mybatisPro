package com.xfwl.pojo.enums;
/**
 * 性别枚举类
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月24日下午3:22:15
 */
public enum SexEnum {
	MALE(0,"男"),FEMALE(1,"女"),MIDDLE(2,"人妖");	
	
	private int sexId;
	private String sexName;
	/**
	 * 构造
	 */
	SexEnum(int sexId,String sexName){
		this.sexId=sexId;
		this.sexName=sexName;
	}
	public int getSexId() {
		return sexId;
	}
	public void setSexId(int sexId) {
		this.sexId = sexId;
	}
	public String getSexName() {
		return sexName;
	}
	public void setSexName(String sexName) {
		this.sexName = sexName;
	}
	
	public SexEnum getSexById(int sexId){
		for(SexEnum sex:SexEnum.values()){
			if(sex.getSexId()==sexId){
				return sex;
			}
		}
		return null;
	}
}
