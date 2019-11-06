package demo.entity;

import java.util.List;

public class TagCustom extends Tag {
	List <Goods> goods;

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "TagCustom [goods=" + goods + ", toString()=" + super.toString() + "]";
	} 
}
