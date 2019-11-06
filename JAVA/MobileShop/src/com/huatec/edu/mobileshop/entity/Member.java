package com.huatec.edu.mobileshop.entity;

import java.io.Serializable;

import com.sun.jmx.snmp.Timestamp;

public class Member implements Serializable{
	private Integer member_id;//编号
	private String uname;//会员名
	private String password;//密码
	private String email;//邮箱
	private Integer sex;//性别，男：0，女：1
	private String mobile;//手机号
	//java.sql.Timestamp
	private Timestamp regtime;//注册时间
	private Timestamp lastlogin;//最后登录时间
	private String image;//头像
	//get、set方法
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id=member_id;
	}
	public String toString() {
		return "Member[member_id="+member_id +",uname="+uname+
				",password="+password+",email="+email
				+",sex+"+sex+",mobile="+mobile+",regtime="
				+regtime+",lastlogin="+lastlogin
				+",image="+image+"]";
	}
}
