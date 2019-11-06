package com.edu.chapter3_3.dao;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.edu.chapter3_3.entity.Member;

public class MemberDaoImpl implements MemberDao {
	//注入SQLSessionFactory 单一实例
	private SqlSessionFactory SqlSessionFactory;
    public MemberDaoImpl(String sqlMapConfigPath)throws Exception {
    	//读取配置文件
		InputStream inputStream =Resources.getResourceAsStream(sqlMapConfigPath);
		//创建会话工厂
		this.SqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	

	@Override
	public Member findById(int member_id) throws Exception {
		// TODO Auto-generated method stub
		//通过工厂得到sqlSession
		SqlSession session =SqlSessionFactory.openSession();
		
		//通过sqlSession操作数据库
		Member member=session.selectOne("member.findById",member_id);
		
		//释放资源
		session.close();
		
		return member;
	}

	@Override
	public int save(Member member) throws Exception {
		// TODO Auto-generated method stub
        SqlSession session =SqlSessionFactory.openSession();
		
		//通过sqlSession操作数据库
		int count=session.insert("member.save",member);
		
		session.commit();
		
		//释放资源
		session.close();
		
		return count;
	}

	@Override
	public int updatePassword(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session =SqlSessionFactory.openSession();
		
		//通过sqlSession操作数据库
		int count=session.update("member.updatePassword",params);
		
		session.commit();
		
		//释放资源
		session.close();
		return count;
	}

	@Override
	public int deleteById(int member_id) throws Exception {
		// TODO Auto-generated method stub
SqlSession session =SqlSessionFactory.openSession();
		
		//通过sqlSession操作数据库
		int count=session.delete("member.deleteById",member_id);
		
		session.commit();
		
		//释放资源
		session.close();
		return count;
	}

}
