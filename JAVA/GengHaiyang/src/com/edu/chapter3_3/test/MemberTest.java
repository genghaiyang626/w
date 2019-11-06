package com.edu.chapter3_3.test;




import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.edu.chapter3_3.entity.Member;



public class MemberTest {
//	@Test
//	public void findByIdTest() throws IOException {
//		String resource = "SqlMapConfig.xml";
//		InputStream inputStream=Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession session=sqlSessionFactory.openSession();
//		Member member=session.selectOne("member.findById",7);
//		System.out.println(member);
//		session.close();
//	}
	
//	@Test
//	public void saveTest() throws IOException {
//		//mybatis�����ļ�
//		String resource = "SqlMapConfig.xml";
//		//��ȡ�����ļ�
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		//�����ػ�����
//		SqlSessionFactory sqlSession =new SqlSessionFactoryBuilder().build(inputStream);
//		//ͨ�������õ�sqlsession
//		SqlSession session = sqlSession.openSession();
//		//ͨ��sqlSession�������ݿ�
//		//��һ��������ӳ���ļ���statement��id,namespace+"."+statement��id
//		//�ڶ���������ָ����ӳ���ļ��е�parameterType���͵Ĳ���
//		//���أ�����ļ�¼
//		Member member =new Member();
//		member.setName("����");
//		member.setPassword("123");
//		member.setEmail("157@c233");
//		member.setGender(1);
//		member.setMoble("123456789");
//		member.setCreate_time(null);
//		member.setLast_time(null);
//		member.setImage("img.jpg");
//		int insertCount=session.insert("member.save",member);
//		session.commit();
//		System.out.println(insertCount);
//		//System.out.println(member.getMember_id());
//		session.close();
//		
//	}

	@Test
	public void updatePasswordTest() throws IOException {
		//mybatis�����ļ�
		String resource = "SqlMapConfig.xml";
		//��ȡ�����ļ�
		InputStream inputStream = Resources.getResourceAsStream(resource);
	    //�����ػ�����
		SqlSessionFactory sqlSession =new SqlSessionFactoryBuilder().build(inputStream);
		//ͨ�������õ�sqlsession
		SqlSession session = sqlSession.openSession();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("member_id",5);
		params.put("name", "��wu");
		params.put("email", "123@321");
		params.put("gender", 0);
		params.put("moble", "789456133");
		params.put("image", "ɫͼ.jpg");
		params.put("password","pwdchange");
		int count = session.update("member.updatePassword",params);
		
		session.commit();
		
		System.out.println(count);
		
		session.close();
	}
//	@Test
//	public void deleteByIdTest() throws IOException {
//		//mybatis�����ļ�
//		String resource = "SqlMapConfig.xml";
//		//��ȡ�����ļ�
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//	    //�����ػ�����
//		SqlSessionFactory sqlSession =new SqlSessionFactoryBuilder().build(inputStream);
//		//ͨ�������õ�sqlsession
//		SqlSession session = sqlSession.openSession();
//		int count =session.delete("member.deleteById",6);
//		session.commit();
//		System.out.println(count);
//		session.close();
//	}
}
