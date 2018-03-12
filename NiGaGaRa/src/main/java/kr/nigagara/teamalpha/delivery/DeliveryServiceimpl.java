package kr.nigagara.teamalpha.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.nigagara.teamalpha.goods.GoodsVO;
import kr.nigagara.teamalpha.member.MemberVO;
@Service
public class DeliveryServiceimpl implements DeliveryService {
@Autowired
@Qualifier("deliverydao")
DeliveryDAO dao;
	
	@Override
	public List<DeliveryVO> list(String delivery_Man) {

		return dao.list(delivery_Man);
	}

}
