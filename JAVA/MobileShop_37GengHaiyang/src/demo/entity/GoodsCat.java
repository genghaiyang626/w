package demo.entity;

import java.sql.Timestamp;

public class GoodsCat {
	private int cat_id;
	private String cat_path;
	private int goods_count;
	private String image;
	private Timestamp creatime;
	private int list_show;
	private Timestamp modifytime;
	private String name;
	private int parent_id;
	private int sort;
	private int type_id;
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_path() {
		return cat_path;
	}
	public void setCat_path(String cat_path) {
		this.cat_path = cat_path;
	}
	public int getGoods_count() {
		return goods_count;
	}
	public void setGoods_count(int goods_count) {
		this.goods_count = goods_count;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Timestamp getCreatime() {
		return creatime;
	}
	public void setCreatime(Timestamp creatime) {
		this.creatime = creatime;
	}
	public int getList_show() {
		return list_show;
	}
	public void setList_show(int list_show) {
		this.list_show = list_show;
	}
	public Timestamp getModifytime() {
		return modifytime;
	}
	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
}
