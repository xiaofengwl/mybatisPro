package com.xfwl.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.xfwl.imapper.student.StudentMapper;
import com.xfwl.pojo.Student;
import com.xfwl.pojo.enums.SexEnum;
import com.xfwl.sqlsessionfactory.SqlSessionFactoryUtils;

/**
 * 测试学生类
 * @author Jason
 *
 */
public class StudentTest {
	
	private Student student;
	private static SqlSession session=null;
	//初始化数据
	private void initData(){
		//准备数据
		student=new Student();
		student.setSt_id("100005");
		student.setSt_age("22");
		student.setSt_name("xfwl3");
		student.setSt_ren("pritty");
		student.setSt_others("nottings");
		student.setSt_address("安徽省，阜阳市、颍上县");
		student.setSt_email("lvjun2@yusys.com");
		student.setSt_sex(SexEnum.MALE);
		/*System.out.println(SexEnum.FEMALE.getSexById(1).getSexName());*/
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
	public void insertStudent(){//新增数据
		initData();
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		boolean flag=stundetMapper.insertStudent(student);
		System.out.println(flag?"数据入库成功":"数据入库失败");		
		session.commit();	
	}
	public void updateStudent(){//更新数据
		initData();
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		boolean flag=stundetMapper.updateStudent(student);
		System.out.println(flag?"数据更新成功":"数据更新失败");		
		session.commit();	
	}
	public void delStudent(){//删除数据
		initData();
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		boolean flag=stundetMapper.delStudent(student);
		System.out.println(flag?"数据删除成功":"数据删除失败");		
		session.commit();	
	}
	@Test
	public void qryStudentById(){//查询数据：by-id
		initData();
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		Student stu=stundetMapper.qryStudentById(student);
		System.out.println(stu);
	}
	public void qryStudentsByName(){//查询数据：by-name:测试自定义类型转换器
		initData();
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		List<Student> list=stundetMapper.qryStudentsByName("军");
		System.out.println(Arrays.toString(list.toArray()));		
	}
	public void qryAllStudent(){//查询数据：all
		initData();
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		List<Student> list=stundetMapper.qryAllStudent();
		System.out.println(Arrays.toString(list.toArray()));		
	}
	public void qryStudentByMult(){//复合条件查询1:测试自定义类型转换器
		initData();
		Map<String,Object> map=new HashMap<>();
		map.put("st_name", "吕军");
		map.put("st_id", "100003");
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		List<Student> list=stundetMapper.qryStudentByMult(map);
		System.out.println(Arrays.toString(list.toArray()));
	}
	public void qryStudentByMultParam(){//复合条件查询2
		initData();
		StudentMapper stundetMapper=session.getMapper(StudentMapper.class);
		List<Student> list=stundetMapper.qryStudentByMultParam("吕军","100003");
		System.out.println(Arrays.toString(list.toArray()));
	}

}
