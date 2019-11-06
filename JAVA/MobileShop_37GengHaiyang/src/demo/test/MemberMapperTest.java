package demo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demo.entity.Member;
import demo.entity.MemberAddress;
import demo.mapper.MemberMapper;
import sun.net.www.content.text.plain;

class MemberMapperTest {
	SqlSessionFactory sqlSessionFactory;
	SqlSession session;
	MemberMapper memberMapper;
	
	@BeforeEach
	void setUp() throws Exception {
		String resource ="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	void testFindById() throws Exception {
		 session=sqlSessionFactory.openSession();
		 memberMapper = session.getMapper(MemberMapper.class);
		//SqlSession session=sqlSessionFactory.openSession();
        //MemberMapper memberMapper = session.getMapper(MemberMapper.class);
		Member member=memberMapper.findById(11);
		System.out.println(member);
		session.close();
	}
	
	@Test
	void testFindMemberInformation() throws Exception {
		session=sqlSessionFactory.openSession();
		memberMapper = session.getMapper(MemberMapper.class);
		Member member =new Member();
		member.setName("ËïÇ®");
		member.setEmail(null);
		member.setMoble(null);
		List<Member> mList= memberMapper.findMemberInformation(member);
		//System.out.println(mList);
		for (Member item : mList) {
			System.out.println(item);
		}
		session.close();
	}
	
	@Test
	void testSave() throws Exception {
		session=sqlSessionFactory.openSession();
		memberMapper = session.getMapper(MemberMapper.class);
		Member member =new Member();
		member.setName("ËïÇ®");
		member.setPassword("136");
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
	void testUpdatePassword() throws Exception {
		session=sqlSessionFactory.openSession();
		memberMapper = session.getMapper(MemberMapper.class);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("member_id",11);
		params.put("name", "Ëï¾Æ");
		params.put("email", "144@321");
		params.put("gender", 1);
		params.put("moble", "789456133");
		params.put("image", "Í·Ïñ.jpg");
		params.put("password","pwdchange2");
		int count = memberMapper.updatePassword(params);
		session.commit();
		System.out.println(count);
		session.close();
	}
	
	@Test
	void testdynamicUpdate() throws Exception{
		session=sqlSessionFactory.openSession();
		memberMapper = session.getMapper(MemberMapper.class);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("member_id",11);
		params.put("name", "Ëï¾Å");
		//params.put("email", "123@321");
		//params.put("gender", 1);
		//params.put("moble", "789456133");
		params.put("image", "Æ¤¿¨Çð.jpg");
		params.put("password","ÉñÆæµÄº£ÂÝ");
		Date date = new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
		params.put("last_time", dateFormat.format(date));
		int count = memberMapper.dynamicUpdate(params);
		session.commit();
		System.out.println(count);
		session.close();
	}

	@Test
	void testDeleteById() throws Exception {
		session=sqlSessionFactory.openSession();
		memberMapper = session.getMapper(MemberMapper.class);
		int count =memberMapper.deleteById(7);
		session.commit();
		System.out.println(count);
		session.close();
	}

    @Test
    void testAddressMemberMap() throws Exception {
    	session=sqlSessionFactory.openSession();
		memberMapper = session.getMapper(MemberMapper.class);
		Member mList = memberMapper.findAddressMemberById(11);
//		System.out.println(memberMapper.findAddressMemberById(11));
		System.out.println(mList);
		for (MemberAddress memberAddress : mList.getMemberAddresses()) {
			System.out.println(memberAddress);
		}
		session.close();
    }
	

	

}
