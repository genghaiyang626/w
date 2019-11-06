package com.edu.chapter3_3.dao;

import java.util.Map;

import com.edu.chapter3_3.entity.Member;

public interface MemberDao {
	public Member findById(int member_id) throws Exception;
	
	public int save(Member member) throws Exception;
	
	public int updatePassword(Map<String, Object> params) throws Exception;
	
	public int deleteById(int member_id) throws Exception;
}
