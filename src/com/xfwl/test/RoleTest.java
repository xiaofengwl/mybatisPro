package com.xfwl.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.xfwl.imapper.role.RoleMapper;
import com.xfwl.pojo.Role;
import com.xfwl.sqlsessionfactory.SqlSessionFactoryUtils;
/**
 * 测试mybatis对数据库的操作
 * @author Jason
 *
 */
public class RoleTest {
	
	public static void main(String[] args) {
		/**
		 * 数据准备
		 */
		Role role=new Role();
		role.setRid("100005");
		role.setRname("微灵"); 
		role.setRage("24");
		role.setRlevel("12");
		role.setRaddress("保密");
		role.setRren("困惑");
		/**
		 * 事务控制：入库操作
		 */
		SqlSession session=null;
		try{
			//打开session连接
			session=SqlSessionFactoryUtils.openSqlSession();
			//动态代理，拿到接口代理对象
			RoleMapper roleMapper=session.getMapper(RoleMapper.class);
			//开始执行sql操作
			/*int index=roleMapper.insertRole(role);
			System.out.println("index="+index);
			if(index==1){
				System.out.println("role数据入库成功！");
			}
			role.setRname("小风微灵2");
			index=roleMapper.updateRole(role);
			System.out.println("index="+index);
			if(index==1){
				System.out.println("role数据跟新成功！");
			}
			session.commit(); //这里一定要提交，不然数据进不去数据库中  
*/			List<Role> r2=roleMapper.findRoles("小");
			System.out.println(r2.size());
			
			
			System.out.println(roleMapper.getRole("100005").toString());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close();
			}
		}
	}
}
