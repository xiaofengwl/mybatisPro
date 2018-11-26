package com.xfwl.sqlsessionfactory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 创建sqlsessionFactory，采用单例模式
 */
public class SqlSessionFactoryUtils {
	/**
	 * 创建锁对象（被锁资源）
	 */
	private final static Class<SqlSessionFactoryUtils> LOCK=SqlSessionFactoryUtils.class;
	/**
	 * 懒汉式单例对象
	 */
	private static SqlSessionFactory sqlSessionFactory=null;
	/**
	 * 私有构造，防止被实例化
	 */
	private SqlSessionFactoryUtils(){}
	/**
	 * 获取sqlSessionFactory对象
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		synchronized (LOCK) {
			if(sqlSessionFactory!=null){
				return sqlSessionFactory;
			}
			//String resouces=SqlSessionFactoryUtils.class.getClassLoader().getResource("").getPath()+"mybatis-config.xml";
			//resouces=resouces.substring(resouces.indexOf("/")+1);
			String resouces="mybatis-config.xml";
			InputStream is=null;
			try {
				is=Resources.getResourceAsStream(resouces);
				sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
			return sqlSessionFactory;			
		}
	}
	/**
	 * 打开数据库session连接
	 */
	public static SqlSession openSqlSession(){
		if(sqlSessionFactory==null){
			sqlSessionFactory=getSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();
	}
	/**
	 * 获取Configuration对象
	 * @return
	 */
	public static Configuration getConfiguration(){
		if(sqlSessionFactory==null){
			sqlSessionFactory=getSqlSessionFactory();
		}
		return sqlSessionFactory.getConfiguration();
	}
	
}
