package com.huatec.edu.mobileshop.entity;

import java.io.Serializable;

import com.sun.jmx.snmp.Timestamp;

public class Member implements Serializable{
	private Integer member_id;//���
	private String uname;//��Ա��
	private String password;//����
	private String email;//����
	private Integer sex;//�Ա��У�0��Ů��1
	private String mobile;//�ֻ���
	//java.sql.Timestamp
	private Timestamp regtime;//ע��ʱ��
	private Timestamp lastlogin;//����¼ʱ��
	private String image;//ͷ��
	//get��set����
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
