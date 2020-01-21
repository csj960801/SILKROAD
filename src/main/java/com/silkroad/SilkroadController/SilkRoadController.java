package com.silkroad.SilkroadController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.silkroad.SilkRoadInterceptor.SilkRoadInterCeptor;
import com.silkroad.SilkRoadService.SilkRoadServiceImpl;
import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;
import com.silkroad.SilkroadController.SilkRoadItemDetail;

/**
 * CopyRight by CSJ
 */
@Controller
public class SilkRoadController extends SilkRoadItemDetail {
	private static final Logger logger = LoggerFactory.getLogger(SilkRoadController.class);

	@Autowired
	private SilkRoadServiceImpl service;

	@Autowired
	private SilkRoadInterCeptor interCeptor;

	// 어플리케이션을 작동하게 될 경우 index를 타고 main.jsp로 로딩 되도록.
	// POST
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String home(Model model) {
		logger.info("=================");
		logger.info("POST방식으로 접근 시도");
		logger.info("=================");

		model.addAttribute("main", "/Template/main.jsp");
		return "index";
	}

	// GET
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void home(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("=================");
		logger.info("GET방식으로 접근 시도");
		logger.info("=================");

		RequestDispatcher fowardMain = request.getRequestDispatcher("/Template/main.jsp");
		fowardMain.forward(request, response);
	}

	/**
	 * 관리자 기능
	 */
	@RequestMapping("/Admin/admin.do")
	public Map<String, Object> admin() {
		HashMap<String, Object> adminMap = new HashMap<String, Object>();
		return adminMap;
	}

	/**
	 * 관리자 문의글 확인 기능(List)
	 */
	@RequestMapping("/Admin/adminCheck.do")
	public List<SilkRoadBoardVO> adminCheck(Model model) throws Exception {

		List<SilkRoadBoardVO> boardList = service.adminBoard();
		model.addAttribute("adminBoardList", boardList);
		model.addAttribute("adminOrderList", adminOrder());

		return boardList;
	}

	/**
	 * 관리자 주문 확인 기능(List)
	 */
	private List<SilkRoadOrderVO> adminOrder() {
		List<SilkRoadOrderVO> orderList = service.adminOrder();
		return orderList;
	}

	/**
	 * 카테고리별 페이지 이동
	 */
	@RequestMapping("/categories.do")
	public String Categories(@RequestParam(value = "pageInfo") String categories) {
		String CategoryPage = "";
		switch (categories) {
		case "ring":
			CategoryPage = "/Categories/ring";
			break;
		case "neckless":
			CategoryPage = "/Categories/necklace";
			break;
		case "braclet":
			CategoryPage = "/Categories/bracelet";
			break;
		}
		return CategoryPage;
	}

	// (RequestToViewNameTranslator)
	@RequestMapping("/Categories/Detail/category.do")
	public Map<String, Object> categoryItem(@RequestParam(value = "item") String ItemKind) {
		HashMap<String, Object> CategoryMap = new HashMap<String, Object>();

		String itemDetail = super.ItemDetail(ItemKind);
		logger.info("선택아이템명: " + itemDetail);

		// 아이템별 종류 식별
		CategoryMap.put("ItemKind", itemDetail);
		// 아이템 코드
		CategoryMap.put("ItemCode", ItemKind);

		return CategoryMap;
	}

	/**
	 * 문의 게시판(RequestToViewNameTranslator)
	 */
	@RequestMapping("/Board/Inquiry.do")
	public Map<String, Object> inquiryBoard() {
		HashMap<String, Object> BoardMap = new HashMap<String, Object>();
		BoardMap.put("", "");
		return BoardMap;
	}

	/**
	 * 주문 게시판(RequestToViewNameTranslator)
	 */
	@RequestMapping("/Board/Order.do")
	public Map<String, Object> OrderBoard() {
		HashMap<String, Object> OrderMap = new HashMap<String, Object>();
		OrderMap.put("", "");
		return OrderMap;
	}

	/**
	 * 문의저장기능(검토대상 1)
	 */
	@RequestMapping("/sendInquiry.do")
	public String BoardFunction(@ModelAttribute("BoardVO") SilkRoadBoardVO vo) {
		boolean inquiry = service.insertInquiry(vo);
		if (inquiry) {
			logger.info("문의글 문의 성공~");
		}
		return "/Board/function/BoardFunction";
	}

	/**
	 * 주문기능(검토대상2)
	 */
	@RequestMapping("/OrderFunction.do")
	public String OrderFunction(@ModelAttribute("OrderVO") SilkRoadOrderVO vo2, HttpServletRequest req) {
		boolean Order = service.insertOrder(vo2, req);
		if (Order) {
			logger.info("주문성공~");
		}
		return "/Board/function/OrderFunction";
	}

}