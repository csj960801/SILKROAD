package com.silkroad.SilkRoadInterceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.silkroad.SilkRoadDAO.SilkRoadDAOImpl;
import com.silkroad.SilkRoadVO.SilkRoadAdminVO;
import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public class SilkRoadInterCeptor extends HandlerInterceptorAdapter {

	private Logger interCeptorLog = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		SilkRoadAdminVO adminVo = new SilkRoadAdminVO(request.getParameter("admin_id"));

		adminVo.setAdmin_id(request.getParameter("admin_id"));
		if (adminVo.getAdmin_id().equals("CsJ")) {

			interCeptorLog.info("-----------------");
			interCeptorLog.info("관리자 BrAnt님, 안녕하세요");
			interCeptorLog.info("-----------------");

		} else {
			interCeptorLog.info("-----------------");
			interCeptorLog.info("관리자 인증 실패");
			interCeptorLog.info("-----------------");

			RequestDispatcher toMain = request.getRequestDispatcher("/");
			toMain.forward(request, response);
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		interCeptorLog.info("postHandle Activated");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}