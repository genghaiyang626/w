package demo.GoodsMapper;

import java.util.List;

import demo.entity.TypeBrandCustom;

public interface TypeBrandMapper {
	public List<TypeBrandCustom> findTypeBrandByTypeId(int id) throws Exception;
}
