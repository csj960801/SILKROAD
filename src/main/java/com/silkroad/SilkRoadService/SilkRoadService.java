package com.silkroad.SilkRoadService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public interface SilkRoadService {

	boolean insertInquiry(SilkRoadBoardVO vo);

	boolean insertOrder(SilkRoadOrderVO vo2, HttpServletRequest req);

	List<SilkRoadBoardVO> adminBoard();

	List<SilkRoadOrderVO> adminOrder();

}
