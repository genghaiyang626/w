package demo.entity;

import java.sql.Timestamp;
import java.util.List;

public class Member {
	//private static final long serialVersionUID = 1;

	private Integer member_id;
	private String name;
	private String password;
	private String email;
	private int gender;
	private String moble;
	private Timestamp create_time;
	private Timestamp last_time;
	private String image;
	private List<MemberAddress> memberAddresses;
	public List<MemberAddress> getMemberAddresses() {
		return memberAddresses;
	}
	public void setMemberAddresses(List<MemberAddress> memberAddresses) {
		this.memberAddresses = memberAddresses;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getLast_time() {
		return last_time;
	}
	public void setLast_time(Timestamp last_time) {
		this.last_time = last_time;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", gender=" + gender + ", moble=" + moble + ", create_time=" + create_time + ", last_time="
				+ last_time + ", image=" + image + ", memberAddresses=" + memberAddresses + "]";
	}
}
