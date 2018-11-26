package com.xfwl.sys.types;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
/**
 * 测试一下：自定义一个typerHandler
 * @author Jason、lvjun2@yusys.com
 * @dateTime 2018年11月24日下午1:50:20
 */
@MappedTypes(String.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String>{
	/**
	 * 设置参数
	 */
	public void setParameter(PreparedStatement ps, int i, String parameter,
			JdbcType jdbcType) throws SQLException {
		ps.setString(i, parameter);
	}

	/**
	 * 取值-1
	 */
	public String getResult(ResultSet rs, String columnName) throws SQLException {
		return rs.getString(columnName);
	}

	/**
	 * 取值-2
	 */
	public String getResult(ResultSet rs, int indexColumn) throws SQLException {
		return rs.getString(indexColumn);
	}

	/**
	 * 取值-3
	 */
	public String getResult(CallableStatement cs, int indexColumn)
			throws SQLException {
		return cs.getString(indexColumn);
	}
}
