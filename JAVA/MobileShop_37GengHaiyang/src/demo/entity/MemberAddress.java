package demo.entity;

import java.sql.Timestamp;

public class MemberAddress {
	private Integer address_id;
	private Integer member_id;
	private String sheng;
	private String shi;
	private String qu;
	private String xx_address;
	private String person;
	private String telephone;
	private Timestamp createtime;
	private Timestamp lasttime;
	
	private Member member;
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getSheng() {
		return sheng;
	}
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public String getQu() {
		return qu;
	}
	public void setQu(String qu) {
		this.qu = qu;
	}
	public String getxx_address() {
		return xx_address;
	}
	public void setxx_address(String xx_address) {
		this.xx_address = xx_address;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public Timestamp getLasttime() {
		return lasttime;
	}
	public void setLasttime(Timestamp lasttime) {
		this.lasttime = lasttime;
	}
	@Override
	public String toString() {
		return "MemberAddress [address_id=" + address_id + ", member_id=" + member_id + ", sheng=" + sheng + ", shi="
				+ shi + ", qu=" + qu + ", xx_address=" + xx_address + ", person=" + person + ", telephone=" + telephone
				+ ", createtime=" + createtime + ", lasttime=" + lasttime + ", member=" + member + "]";
	}
	
}
