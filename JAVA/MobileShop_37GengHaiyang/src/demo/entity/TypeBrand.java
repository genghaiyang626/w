package demo.entity;

import java.sql.Timestamp;

public class TypeBrand {
	private int id;
	private int type_id;
	private int brand_id;
	private Timestamp creatime;
	private Timestamp modifytime;
	private Band band;
	public Band getBand() {
		return band;
	}
	public void setBand(Band band) {
		this.band = band;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
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
	@Override
	public String toString() {
		return "TypeBrand [id=" + id + ", type_id=" + type_id + ", brand_id=" + brand_id + ", creatime=" + creatime
				+ ", modifytime=" + modifytime + "]";
	}
}
