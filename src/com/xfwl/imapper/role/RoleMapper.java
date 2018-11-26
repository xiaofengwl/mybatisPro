package com.xfwl.imapper.role;

import java.util.List;

import com.xfwl.pojo.Role;

/**
 * 角色表映射接口
 * @author Jason
 *
 */
public interface RoleMapper {
	/**WW
	 * 新增角色数据
	 * @param role
	 * @return
	 */
	public int insertRole(Role role);
	/**
	 * 删除角色信息
	 * @param role
	 * @return
	 */
	public int deleteRole(Role role);
	/**
	 * 修改角色信息
	 * @param role
	 * @return
	 */
	public int updateRole(Role role);
	/**
	 * 查找指定角色信息
	 * @param id
	 * @return
	 */
	public Role getRole(String id);
	/**
	 * 根据名称模糊查询角色信息
	 * @param roleName
	 * @return
	 */
	public List<Role> findRoles(String roleName);
}
