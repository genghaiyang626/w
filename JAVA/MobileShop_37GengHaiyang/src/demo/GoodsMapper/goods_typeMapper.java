package demo.GoodsMapper;

import java.util.Map;

import demo.entity.goods_type;

public interface goods_typeMapper {
	public goods_type findById(int goods_type_id) throws Exception;
	public int deleteById(int goods_type_id) throws Exception;
	public int save(goods_type goods_typer) throws Exception;
	public int update(Map<String, Object> params) throws Exception;
	//动态更新会员信息
	public int dynamicUpdate(Map<String, Object> params) throws Exception;
}
