package demo.mapper;

import java.util.List;
import java.util.Map;

import demo.entity.Member;
import demo.entity.MemberAddress;


public interface MemberMapper {
	//通过ID查询会员
	public Member findById(int member_id) throws Exception;
	
	//根据会员用户名或邮箱或电话号码，查询会员信息
	public List<Member> findMemberInformation(Member member)throws Exception;
	
	//增加会员
	public int save(Member member) throws Exception;
	//通过id更新会员密码
	public int updatePassword(Map<String, Object> params) throws Exception;
	//删除会员
	public int deleteById(int member_id) throws Exception;
	//动态更新会员信息
	public int dynamicUpdate(Map<String, Object> params) throws Exception;
	//查询指定会员的会员及会员地址信息
	public Member findAddressMemberById(int member_id) throws Exception;
}
