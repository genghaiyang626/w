package com.edu.chapter3_3.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.edu.chapter3_3.dao.MemberDao;
import com.edu.chapter3_3.dao.MemberDaoImpl;
import com.edu.chapter3_3.entity.Member;

public class MemberDaoTest {
    
	private MemberDao memberDao;
	@Before
	public void setUp() throws Exception {
		//mybatis配置文件
		String resource ="SqlMapConfig.xml";
		//创建MemberDaoImpl对象
		memberDao=new  MemberDaoImpl(resource);
	}

//	@Test
//	public void testFindById() throws Exception {
//		Member member =memberDao.findById(7);
//		System.out.println(member);
//	}

//	@Test
//	public void testSave() throws Exception {
//		Member member =new Member();
//		member.setName("王尼玛");
//		member.setPassword("123");
//		member.setEmail("157@c233");
//		member.setGender(1);
//		member.setMoble("123456789");
//		member.setCreate_time(null);
//		member.setLast_time(null);
//		member.setImage("img.jpg");
//		int insertCount=memberDao.save(member);
//		System.out.println(insertCount);
//		//System.out.println(member.getMember_id());
//	}

//	@Test
//	public void testUpdatePassword() throws Exception {
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("member_id",11);
//		params.put("name", "李四");
//		params.put("email", "123@321");
//		params.put("gender", 0);
//		params.put("moble", "789456133");
//		params.put("image", "色图.jpg");
//		params.put("password","pwdchange");
//		int count =memberDao.updatePassword(params);
//	}

	@Test
	public void testDeleteById() throws Exception {
		int count = memberDao.deleteById(10);
		System.out.println(count);
	}

}
