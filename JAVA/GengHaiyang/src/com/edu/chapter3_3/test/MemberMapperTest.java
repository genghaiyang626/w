package com.edu.chapter3_3.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import com.edu.chapter3_3.entity.Member;
import com.edu.chapter3_3.mapper.MemberDao;

public class MemberMapperTest {
	SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		//mybatis配置文件
		String resource ="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void FindById() throws Exception {
		SqlSession session=sqlSessionFactory.openSession();
		MemberDao memberMapper = session.getMapper(MemberDao.class);
		//Member member=session.selectOne("member.findById",7);
		Member member=memberMapper.findById(11);
		System.out.println(member);
		session.close();
	}

	@Test
	public void testSave() throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		MemberDao memberMapper = session.getMapper(MemberDao.class);
		//通过sqlSession操作数据库
		//第一个参数：映射文件中statement的id,namespace+"."+statement的id
		//第二个参数：指定：映射文件中的parameterType类型的参数
		//返回：插入的记录
		Member member =new Member();
		member.setName("孙钱");
		member.setPassword("123");
		member.setEmail("157@c233");
		member.setGender(1);
		member.setMoble("123456789");
		member.setCreate_time(null);
		member.setLast_time(null);
		member.setImage("img.jpg");
		int insertCount=memberMapper.save(member);
		session.commit();
		System.out.println(insertCount);
		//System.out.println(member.getMember_id());
		session.close();
	}

	@Test
	public void testUpdatePassword() throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		MemberDao memberMapper = session.getMapper(MemberDao.class);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("member_id",11);
		params.put("name", "孙酒");
		params.put("email", "123@321");
		params.put("gender", 1);
		params.put("moble", "789456133");
		params.put("image", "头像.jpg");
		params.put("password","pwdchange2");
		int count = memberMapper.updatePassword(params);
		
		session.commit();
		
		System.out.println(count);
		
		session.close();
	}

	@Test
	public void testDeleteById() throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		MemberDao memberMapper = session.getMapper(MemberDao.class);
		int count =memberMapper.deleteById(7);
		session.commit();
		System.out.println(count);
		session.close();
	}

}
