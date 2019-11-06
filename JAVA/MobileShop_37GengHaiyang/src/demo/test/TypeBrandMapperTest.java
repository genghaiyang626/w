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

import demo.GoodsMapper.TypeBrandMapper;
import demo.GoodsMapper.goods_typeMapper;
import demo.entity.Band;
import demo.entity.Member;
import demo.entity.MemberAddress;
import demo.entity.TypeBrandCustom;
import demo.entity.goods_type;
import demo.mapper.MemberMapper;

class TypeBrandMapperTest {

	SqlSessionFactory sqlSessionFactory;
	SqlSession session;
	TypeBrandMapper typeBrandMapper;
	
	@BeforeEach
	void setUp() throws Exception {
		String resource ="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	void testFindTypeBrandByTypeId() throws Exception {
		session=sqlSessionFactory.openSession();
		typeBrandMapper = session.getMapper(TypeBrandMapper.class);
		List<TypeBrandCustom> typeBrandCustoms = typeBrandMapper.findTypeBrandByTypeId(4);
		System.out.println(typeBrandCustoms);
		for (TypeBrandCustom typeBrandCustom : typeBrandCustoms) {
			for(Band band:typeBrandCustom.getBands())
			{
				System.out.println(band);
			}
		}
		session.close();
	}

}
