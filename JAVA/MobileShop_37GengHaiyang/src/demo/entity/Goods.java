package demo.entity;

import java.sql.Timestamp;

public class Goods {
	private int goods_id;
	private double weight;
	private int view_count;
	private String thumbnail;
	private String sn;
	private String small;
	private double price;
	private String params;
	private String original;
	private String name;
	private double mktprice;
	private int mkt_enable;
	private Timestamp last_modify;
	private String intro;
	private String description;
	private Timestamp creatime;
	private double cost;
	private int cat_id;
	private int buy_count;
	private String brief;
	private int brand_id;
	private String big;
	private GoodsCat goodsCat;
	private Band band;
	public GoodsCat getGoodsCat() {
		return goodsCat;
	}
	public void setGoodsCat(GoodsCat goodsCat) {
		this.goodsCat = goodsCat;
	}
	public Band getBand() {
		return band;
	}
	public void setBand(Band band) {
		this.band = band;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMktprice() {
		return mktprice;
	}
	public void setMktprice(double mktprice) {
		this.mktprice = mktprice;
	}
	public int getMkt_enable() {
		return mkt_enable;
	}
	public void setMkt_enable(int mkt_enable) {
		this.mkt_enable = mkt_enable;
	}
	public Timestamp getLast_modify() {
		return last_modify;
	}
	public void setLast_modify(Timestamp last_modify) {
		this.last_modify = last_modify;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCreatime() {
		return creatime;
	}
	public void setCreatime(Timestamp creatime) {
		this.creatime = creatime;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public int getBuy_count() {
		return buy_count;
	}
	public void setBuy_count(int buy_count) {
		this.buy_count = buy_count;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getBig() {
		return big;
	}
	public void setBig(String big) {
		this.big = big;
	}
	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", weight=" + weight + ", view_count=" + view_count + ", thumbnail="
				+ thumbnail + ", sn=" + sn + ", small=" + small + ", price=" + price + ", params=" + params
				+ ", original=" + original + ", name=" + name + ", mktprice=" + mktprice + ", mkt_enable=" + mkt_enable
				+ ", last_modify=" + last_modify + ", intro=" + intro + ", description=" + description + ", creatime="
				+ creatime + ", cost=" + cost + ", cat_id=" + cat_id + ", buy_count=" + buy_count + ", brief=" + brief
				+ ", brand_id=" + brand_id + ", big=" + big + ", goodsCat=" + goodsCat + ", band=" + band + "]";
	}
}
