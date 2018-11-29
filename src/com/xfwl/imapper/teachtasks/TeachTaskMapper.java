package com.xfwl.imapper.teachtasks;

import java.util.List;

import com.xfwl.pojo.Card;
import com.xfwl.pojo.TCourseTasks;
import com.xfwl.pojo.Teacher;

public interface TeachTaskMapper {
	
	/**
	 * 根据教师ID查询教师信息
	 * @param t_id
	 * @return
	 */
	public Teacher qryTeacherById(int t_id);
	/**
	 * 根据教师ID查询教师登机牌信息
	 * @param t_id
	 * @return
	 */
	public Card qryTeacherCardByTID(int t_id);
	/**
	 * 根据教师ID查询教师授课任务信息
	 * @param t_id
	 * @return
	 */
	public List<TCourseTasks> qryTasksByTID(int t_id);
}
