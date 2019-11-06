package com.edu.chapter3_3.dao;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.edu.chapter3_3.entity.Member;

public class MemberDaoImpl implements MemberDao {
	//ע��SQLSessionFactory ��һʵ��
	private SqlSessionFactory SqlSessionFactory;
    public MemberDaoImpl(String sqlMapConfigPath)throws Exception {
    	//��ȡ�����ļ�
		InputStream inputStream =Resources.getResourceAsStream(sqlMapConfigPath);
		//�����Ự����
		this.SqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	

	@Override
	public Member findById(int member_id) throws Exception {
		// TODO Auto-generated method stub
		//ͨ�������õ�sqlSession
		SqlSession session =SqlSessionFactory.openSession();
		
		//ͨ��sqlSession�������ݿ�
		Member member=session.selectOne("member.findById",member_id);
		
		//�ͷ���Դ
		session.close();
		
		return member;
	}

	@Override
	public int save(Member member) throws Exception {
		// TODO Auto-generated method stub
        SqlSession session =SqlSessionFactory.openSession();
		
		//ͨ��sqlSession�������ݿ�
		int count=session.insert("member.save",member);
		
		session.commit();
		
		//�ͷ���Դ
		session.close();
		
		return count;
	}

	@Override
	public int updatePassword(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session =SqlSessionFactory.openSession();
		
		//ͨ��sqlSession�������ݿ�
		int count=session.update("member.updatePassword",params);
		
		session.commit();
		
		//�ͷ���Դ
		session.close();
		return count;
	}

	@Override
	public int deleteById(int member_id) throws Exception {
		// TODO Auto-generated method stub
SqlSession session =SqlSessionFactory.openSession();
		
		//ͨ��sqlSession�������ݿ�
		int count=session.delete("member.deleteById",member_id);
		
		session.commit();
		
		//�ͷ���Դ
		session.close();
		return count;
	}

}
