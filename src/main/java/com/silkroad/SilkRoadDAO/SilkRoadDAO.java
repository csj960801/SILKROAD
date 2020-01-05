package com.silkroad.SilkRoadDAO;

import javax.servlet.http.HttpServletRequest;

import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public interface SilkRoadDAO {

	 boolean insertInquiry(SilkRoadBoardVO vo);
	 boolean insertOrder(SilkRoadOrderVO vo2, HttpServletRequest req);
}