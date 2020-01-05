package com.silkroad.SilkRoadService;

import javax.servlet.http.HttpServletRequest;

import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public interface SilkRoadService {

	boolean insertInquiry(SilkRoadBoardVO vo);
	boolean insertOrder(SilkRoadOrderVO vo2, HttpServletRequest req);
	
}
