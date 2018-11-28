package com.xfwl.pojo.params;
/**
 * 分页封装类
 * mybatis有一个RowBounds类，只需要传入实例对象，mapper.xml文件不需要limit,mybatis会自动识别处理
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月27日下午2:54:20
 */
public class PageParams {
	/**
	 * 起始索引值：0,1,2,3......
	 */
	private int start;
	/**
	 * 限制条数
	 */
	private int limit;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
}	
