package demo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demo.GoodsMapper.TagMapper;
import demo.entity.Goods;
import demo.entity.TagCustom;

class TagMapperTest {
	
	SqlSessionFactory sqlSessionFactory;
	SqlSession session;
	TagMapper tagMapper;
	
	@BeforeEach
	void setUp() throws Exception {
		String resource ="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	void testFindTagGoodsByTagId() throws Exception {
		session=sqlSessionFactory.openSession();
		tagMapper = session.getMapper(TagMapper.class);
		List<TagCustom> tagCustoms =tagMapper.findTagGoodsByTagId(2);
		System.out.println(tagCustoms);
		for(TagCustom tagCustom:tagCustoms)
		{
			for(Goods goods:tagCustom.getGoods())
			{
				System.out.print(tagCustom.getName()+" ");
				System.out.print(goods.getName()+" ");
				System.out.print(goods.getGoodsCat().getName()+" ");
				System.out.println(goods.getBand().getName());
			}
		}
	}

}
