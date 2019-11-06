package demo.mapper;

import java.util.List;
import java.util.Map;

import demo.entity.Member;
import demo.entity.MemberAddress;


public interface MemberMapper {
	//ͨ��ID��ѯ��Ա
	public Member findById(int member_id) throws Exception;
	
	//���ݻ�Ա�û����������绰���룬��ѯ��Ա��Ϣ
	public List<Member> findMemberInformation(Member member)throws Exception;
	
	//���ӻ�Ա
	public int save(Member member) throws Exception;
	//ͨ��id���»�Ա����
	public int updatePassword(Map<String, Object> params) throws Exception;
	//ɾ����Ա
	public int deleteById(int member_id) throws Exception;
	//��̬���»�Ա��Ϣ
	public int dynamicUpdate(Map<String, Object> params) throws Exception;
	//��ѯָ����Ա�Ļ�Ա����Ա��ַ��Ϣ
	public Member findAddressMemberById(int member_id) throws Exception;
}
