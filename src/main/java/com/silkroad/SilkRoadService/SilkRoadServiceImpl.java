package com.silkroad.SilkRoadService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.silkroad.SilkRoadDAO.SilkRoadDAOImpl;
import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public class SilkRoadServiceImpl implements SilkRoadService {

	@Autowired
	private SilkRoadDAOImpl dao;

	public static SilkRoadServiceImpl getServiceImpl() {
		return new SilkRoadServiceImpl();
	}

	@Override
	public boolean insertInquiry(SilkRoadBoardVO vo) {
		// TODO Auto-generated method stub
		return dao.insertInquiry(vo);
	}

	@Override
	public boolean insertOrder(SilkRoadOrderVO vo2, HttpServletRequest req) {
		// TODO Auto-generated method stub
		return dao.insertOrder(vo2, req);
	}

	@Override
	public List<SilkRoadBoardVO> adminBoard() {
		// TODO Auto-generated method stub
		return dao.adminBoard();
	}

	@Override
	public List<SilkRoadOrderVO> adminOrder() {
		// TODO Auto-generated method stub
		return dao.adminOrder();
	}
}