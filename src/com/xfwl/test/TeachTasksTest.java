package com.xfwl.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.xfwl.imapper.teachtasks.TeachTaskMapper;
import com.xfwl.pojo.TCourseTasks;
import com.xfwl.pojo.Teacher;
import com.xfwl.sqlsessionfactory.SqlSessionFactoryUtils;

/**
 * 教师任务信息查询测试类
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月29日上午10:34:45
 */
public class TeachTasksTest {
	private static SqlSession session=null;
	//初始化数据
	private void initData(){
		//准备数据
		//准备连接
		try{
			if(session==null){
				//打开session连接
				session=SqlSessionFactoryUtils.openSqlSession();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//打印集合
	private <T> void printList(List<T> list){
		System.out.println("查询到结果集："+list.size()+"条记录");
		System.out.println("-----------------------------");
		for(T each:list){
			System.out.println(each.toString());
		}
		System.out.println("-----------------------------");
	}
	//根据教师ID查询教师登机牌信息
	public void qryTasksByTID(){
		initData();
		TeachTaskMapper taskMapper=session.getMapper(TeachTaskMapper.class);
		List<TCourseTasks> taskList=taskMapper.qryTasksByTID(1);
		printList(taskList);
	}
	//根据教师ID查询教师信息
	@Test
	public void qryTeacherById(){
		initData();
		TeachTaskMapper taskMapper=session.getMapper(TeachTaskMapper.class);
		Teacher teacher=taskMapper.qryTeacherById(1);
		System.out.println("查询教师信息：");
		System.out.println("ID:"+teacher.getT_id());
		System.out.println("名称:"+teacher.getT_name());
		System.out.println("性别:"+teacher.getT_sex());
		System.out.println("地址:"+teacher.getT_address());
		System.out.println("登记牌信息："+teacher.getCard());
		System.out.println("授课任务：如下");
		printList(teacher.getTasks());
	}
	
}
