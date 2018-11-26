package com.xfwl.pojo;
/**
 * 角色Bean
 * @author Jason
 *
 */
public class Role {
	private String rid;//角色ID
	private String rname;//角色名称
	private String rage;//角色年龄
	private String raddress;//角色地址
	private String rlevel;//角色级别
	private String rren;//角色备注
	/**getter and setter**/
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRage() {
		return rage;
	}
	public void setRage(String rage) {
		this.rage = rage;
	}
	public String getRaddress() {
		return raddress;
	}
	public void setRaddress(String raddress) {
		this.raddress = raddress;
	}
	public String getRlevel() {
		return rlevel;
	}
	public void setRlevel(String rlevel) {
		this.rlevel = rlevel;
	}
	public String getRren() {
		return rren;
	}
	public void setRren(String rren) {
		this.rren = rren;
	}
	
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", rage=" + rage
				+ ", raddress=" + raddress + ", rlevel=" + rlevel + ", rren="
				+ rren+"]";
	}
}
