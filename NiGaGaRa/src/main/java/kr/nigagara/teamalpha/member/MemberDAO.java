package kr.nigagara.teamalpha.member;

import java.util.List;

public interface MemberDAO {

	int insert(MemberVO member);

	MemberVO login(String id, String pass);

	MemberVO read(String mem_id);

	int update(MemberVO member);

	int drop(String mem_id);

	List<String> searchid(String email);

	int updatePass(String id, String email, String temppass);

	int resetpass(String mem_id, String newpass);
	
	List<MemberVO> list();

	int updateRole(String id, String role);

}
