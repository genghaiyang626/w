package demo.entity;

import java.sql.Timestamp;

public class goods_type {
	private int type_id;
	private String params;
	private String name;
	private int is_physical;
	private int disabled;
	private Timestamp creatime;
	private Timestamp modifytime;
//	private List<TypeBrand> typeBrands;
//	public List<TypeBrand> getTypeBrands() {
//		return typeBrands;
//	}
//	public void setTypeBrands(List<TypeBrand> typeBrands) {
//		this.typeBrands = typeBrands;
//	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIs_physical() {
		return is_physical;
	}
	public void setIs_physical(int is_physical) {
		this.is_physical = is_physical;
	}
	public Timestamp getCreatime() {
		return creatime;
	}
	public void setCreatime(Timestamp creatime) {
		this.creatime = creatime;
	}
	public Timestamp getModifytime() {
		return modifytime;
	}
	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}
	public int getDisabled() {
		return disabled;
	}
	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}
	@Override
	public String toString() {
		return "goods_type [type_id=" + type_id + ", params=" + params + ", name=" + name + ", is_physical="
				+ is_physical + ", disabled=" + disabled + ", creatime=" + creatime + ", modifytime=" + modifytime
				+ "]";
	}
	
}
