package kr.nigagara.teamalpha.delivery;


import java.util.List;

import kr.nigagara.teamalpha.member.MemberVO;

public interface DeliveryService {
	List<DeliveryVO> list(MemberVO memId);
	DeliveryVO select(Integer deliveryNum);
}