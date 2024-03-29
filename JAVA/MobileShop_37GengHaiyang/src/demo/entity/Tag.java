package demo.entity;

import java.sql.Timestamp;

public class Tag {
	private int tag_id;
	private int count;
	private int type;
	private int team;	
	private int sort;
	private String name;
	private Timestamp modifytime;
	private Timestamp creatime;
	public int getTag_id() {
		return tag_id;
	}
	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getModifytime() {
		return modifytime;
	}
	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}
	public Timestamp getCreatime() {
		return creatime;
	}
	public void setCreatime(Timestamp creatime) {
		this.creatime = creatime;
	}
	@Override
	public String toString() {
		return "Tag [tag_id=" + tag_id + ", count=" + count + ", type=" + type + ", team=" + team + ", sort=" + sort
				+ ", name=" + name + ", modifytime=" + modifytime + ", creatime=" + creatime + "]";
	}
}
