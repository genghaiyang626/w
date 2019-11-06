package demo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demo.GoodsMapper.goods_typeMapper;
import demo.entity.Member;
import demo.entity.MemberAddress;
import demo.entity.goods_type;
import demo.mapper.MemberMapper;

class goods_typeMapperTest {

	SqlSessionFactory sqlSessionFactory;
	SqlSession session;
	goods_typeMapper goodsmapper;
	
	@BeforeEach
	void setUp() throws Exception {
		String resource ="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	void testFindById() throws Exception {
		session=sqlSessionFactory.openSession();
		goodsmapper=session.getMapper(goods_typeMapper.class);
		goods_type goods_typer=goodsmapper.findById(4);
		System.out.println(goods_typer);
		session.close();
		
	}


	@Test
	void testDeleteById() throws Exception {
		session=sqlSessionFactory.openSession();
		goodsmapper=session.getMapper(goods_typeMapper.class);
		int count =goodsmapper.deleteById(7);
		session.commit();
		System.out.println(count);
		session.close();
	}

	@Test
	void testSave() throws Exception {
		session=sqlSessionFactory.openSession();
		goodsmapper=session.getMapper(goods_typeMapper.class);
		//Map<String, Object> params = new HashMap<String, Object>();
		goods_type goods_typer=new goods_type();
		goods_typer.setName("蘑菇");
		goods_typer.setParams("{\"参数\":{\"产地\":\"\",\"储存方法\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\",\"配料\":\"\"}}");
		goods_typer.setIs_physical(1);
		goods_typer.setCreatime(null);
		goods_typer.setModifytime(null);
		goods_typer.setDisabled(0);
		int insertCount=goodsmapper.save(goods_typer);
		session.commit();
		System.out.println(insertCount);
		session.close();
	}

	@Test
	void testUpdate() throws Exception {
		session=sqlSessionFactory.openSession();
		goodsmapper=session.getMapper(goods_typeMapper.class);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", 8);
		params.put("name", "蛋糕");
		params.put("params", "{\"参数\":{\"产地\":\"\",\"储存方法\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\",\"配料\":\"\"}}");

		Date date = new Date();   	
		Timestamp timestamp = new Timestamp(date.getTime());//获取当前系统时间
		params.put("modifytime", timestamp);
		
		int count = goodsmapper.update(params);
		session.commit();
		System.out.println(count);
		session.close();
	}
	
	@Test
	void testdynamicUpdate() throws Exception{
		session=sqlSessionFactory.openSession();
		goodsmapper=session.getMapper(goods_typeMapper.class);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("type_id",5);
		params.put("name", "猫粮");
		Date date = new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
		params.put("modifytime", dateFormat.format(date));
		int count = goodsmapper.dynamicUpdate(params);
		session.commit();
		System.out.println(count);
		session.close();
	}

}
