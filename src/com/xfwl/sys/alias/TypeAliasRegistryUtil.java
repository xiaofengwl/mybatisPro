package com.xfwl.sys.alias;

import org.apache.ibatis.type.TypeAliasRegistry;

import com.xfwl.pojo.Role;
import com.xfwl.pojo.Student;
import com.xfwl.sqlsessionfactory.SqlSessionFactoryUtils;

/**
 * 别名注册
 * @author Jason
 *
 */
public class TypeAliasRegistryUtil {
	/**
	 * mybatis别名注册器
	 */
	private static TypeAliasRegistry registry;
	/**
	 * 私有构造
	 */
	private TypeAliasRegistryUtil(){}
	private TypeAliasRegistryUtil(TypeAliasRegistry registry){
		this.registry=registry;
	}
	/**
	 * 获取系统注册器
	 * @return
	 */
	public static TypeAliasRegistry getInstance(){
		return new TypeAliasRegistryUtil(SqlSessionFactoryUtils.getConfiguration().getTypeAliasRegistry()).registry;
	}
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		//给Student类注册别名
		TypeAliasRegistryUtil.getInstance().registerAlias("student", Student.class);
		//给Role类注册别名
		TypeAliasRegistryUtil.getInstance().registerAlias("role", Role.class);
	}
}
