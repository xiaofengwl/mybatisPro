package com.xfwl.imapper.student;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.Alias;

import com.xfwl.pojo.Student;
import com.xfwl.pojo.params.PageParams;
import com.xfwl.pojo.params.StudentParams;
@Alias("studentMapper")
public interface StudentMapper {
	/**
	 * 新增学生数据
	 * @param stu
	 * @return
	 */
	public boolean insertStudent(Student stu);
	/**
	 * 删除学生数据
	 * @param stu
	 * @return
	 */
	public boolean delStudent(Student stu);
	/**
	 * 更新学生数据
	 * @param stu
	 * @return
	 */
	public boolean updateStudent(Student stu);
	/**
	 * 查询学生数据
	 * @param stu
	 * @return
	 */
	public Student qryStudentById(Student stu);
	/**
	 * 查询学生数据
	 * @param stuId
	 * @return
	 */
	public Student qryStudentById2(String stuId);
	/**
	 * 模糊查询学生信息
	 * @param stuName
	 * @return
	 */
	public List<Student> qryStudentsByName(String stuName);
	/**
	 * 查询所有学生信息
	 * @return
	 */
	public List<Student> qryAllStudent();
	/**
	 * 复合条件查询【多个查询参数】
	 * @param paramMap
	 * @return
	 */
	public List<Student> qryStudentByMult(Map<String,Object> paramMap);
	/**
	 * 使用注解的方式传递多个参数[比map传值方式可读性要好]
	 * @param st_name
	 * @param st_id
	 * @return
	 */
	public List<Student> qryStudentByMultParam(@Param("st_name") String stuName,@Param("st_id") String stuId);
	/**
	 * 混合使用注解查询数据集合
	 * @param params
	 * @param pages
	 * @return
	 */
	public List<Student> qryStudengByCofParam(@Param("params")StudentParams params,@Param("pages") PageParams pages);
	
}
