package demo.entity;

import java.sql.Timestamp;

public class Band {
	private int brand_id;
	private String name;
	private String url;
	private String description;
	private int disabled;
	private String keywords;
	private String logo;
	private Timestamp creatime;
	private Timestamp modifytime;
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDisabled() {
		return disabled;
	}
	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
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
		return "Band [brand_id=" + brand_id + ", name=" + name + ", url=" + url + ", description=" + description
				+ ", disabled=" + disabled + ", keywords=" + keywords + ", logo=" + logo + ", creatime=" + creatime
				+ ", modifytime=" + modifytime + "]";
	}
}
