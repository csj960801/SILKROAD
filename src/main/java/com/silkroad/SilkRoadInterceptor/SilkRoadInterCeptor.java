package com.silkroad.SilkRoadInterceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.silkroad.SilkRoadDAO.SilkRoadDAOImpl;
import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public class SilkRoadInterCeptor extends HandlerInterceptorAdapter {

	private Logger interCeptorLog = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SilkRoadDAOImpl dao;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
        
		//문의글 VO
		SilkRoadBoardVO boardVO = new SilkRoadBoardVO(request.getParameter("clientEmail"),request.getParameter("clientInquiry"));
		
		//주문용 VO
		SilkRoadOrderVO orderVO = new SilkRoadOrderVO();

		if (request.getParameter("clientEmail").indexOf("@") <= 0 || !dao.insertInquiry(boardVO)) {
			interCeptorLog.info("-----------------");
			interCeptorLog.info("옳지않은 이메일 입력방식");
			interCeptorLog.info("-----------------");
			return false;
		} else if (request.getParameter("clientInquiry").length() <= 1) {
			interCeptorLog.info("-----------------");
			interCeptorLog.info("옳지않은 문의글 입력방식");
			interCeptorLog.info("-----------------");
			return false;
		} else if (!dao.insertOrder(orderVO, request)) {
			interCeptorLog.info("-----------------");
			interCeptorLog.info("옳지않은 주문방식");
			interCeptorLog.info("-----------------");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
