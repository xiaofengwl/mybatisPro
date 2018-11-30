package com.xfwl.imapper.teachtasks;

import java.util.List;

import org.apache.ibatis.annotations.Select;

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
	 * 根据教师ID查询教师信息（使用注解方式）：不需要在mapper映射文件中配置了
	 * @param t_id
	 * @return
	 */
	@Select("select t_id,t_name,t_sex,t_address from teacher where t_id=#{t_id}")
	public Teacher qryTeacherByIdOnAnnotations(int t_id);
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
