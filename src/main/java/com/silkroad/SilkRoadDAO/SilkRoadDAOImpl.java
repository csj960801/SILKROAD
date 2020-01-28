package com.silkroad.SilkRoadDAO;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.silkroad.SilkRoadDB.DBConnection;
import com.silkroad.SilkRoadDB.SqlMapper;
import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public class SilkRoadDAOImpl extends SqlMapper implements SilkRoadDAO {
	private Logger logger = LoggerFactory.getLogger(SilkRoadDAOImpl.class);

	// Jdbc Setting
	private Connection conector;
	private PreparedStatement sqlState;
	private ResultSet resultset;

	// Mybatis Setting
	String mapper = "Mybatis/Mybatis-Config.xml";
	InputStream mapperstream = null;

	public static SilkRoadDAOImpl getDaoImpl() {
		return new SilkRoadDAOImpl();
	}

	/**
	 * 문의게시판 문의글 저장(Mybatis)
	 */
	@Override
	public boolean insertInquiry(SilkRoadBoardVO vo) {
		boolean check = false;
		try {
			mapperstream = Resources.getResourceAsStream(mapper);
			SqlSessionFactory sessionfactory = new SqlSessionFactoryBuilder().build(mapperstream);
			SqlSession session = sessionfactory.openSession();

			int InquiryInsert = session.insert("InquiryInsert", vo);
			if (InquiryInsert > 0) {
				session.commit();
				check = true;
			}
		} catch (Exception e) {
			logger.error(e.toString());
		} finally {
			try {
				mapperstream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return check;
	}

	/**
	 * 주문 기능 담당 함수
	 */
	@Override
	public boolean insertOrder(SilkRoadOrderVO vo2, HttpServletRequest req) {
		boolean check = false;
		try {
			mapperstream = Resources.getResourceAsStream(mapper);
			SqlSessionFactory sessionfactory = new SqlSessionFactoryBuilder().build(mapperstream);
			SqlSession session = sessionfactory.openSession();

			int OrderInsert = session.insert("OrderInsert", vo2);
			if (OrderInsert > 0) {
				session.commit();
                check = true;
				System.out.println("주문되었습니다.");
			}

		} catch (Exception e) {
			logger.error(e.toString());
		} finally {
			try {
				mapperstream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return check;
	}

	/**
	 * 관리자용 게시글 확인 함수
	 */
	@Override
	public List<SilkRoadBoardVO> adminBoard() {
		List<SilkRoadBoardVO> boardList = new ArrayList<SilkRoadBoardVO>();
		String sql = "AdminBoard";
		try {
			conector = DBConnection.getDBConnector();
			sqlState = conector.prepareStatement(super.sqlMap(sql));
			resultset = sqlState.executeQuery();

			while (resultset.next()) {
				SilkRoadBoardVO boardvo = new SilkRoadBoardVO();
				boardvo.setClientInquiry(resultset.getString("BoardContent"));
				boardvo.setClientEmail(resultset.getString("BoardWriter"));

				// System.out.println(resultset.getMetaData());
				boardList.add(boardvo);
			}
		} catch (Exception e) {
			logger.error(e.toString());
		} finally {
			try {
				if (conector != null) {
					conector.close();
				}
				if (sqlState != null) {
					sqlState.close();
				}
				if (resultset != null) {
					resultset.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return (boardList.isEmpty()) ? null : boardList;
	}

	/**
	 * 관리자용 주문 내용 확인 함수
	 */
	@Override
	public List<SilkRoadOrderVO> adminOrder() {
		List<SilkRoadOrderVO> adminorder = new ArrayList<SilkRoadOrderVO>();
		String sql = "AdminOrder";
		try {
			conector = DBConnection.getDBConnector();
			sqlState = conector.prepareStatement(super.sqlMap(sql));
			resultset = sqlState.executeQuery();

			while (resultset.next()) {
				SilkRoadOrderVO ordervo = new SilkRoadOrderVO();
				ordervo.setItemName(resultset.getString("ItemName"));
				ordervo.setItemPrice(resultset.getString("ItemPrice"));
				ordervo.setOrderAddr(resultset.getString("OrderAddr"));
				ordervo.setOrderTel(resultset.getString("orderTel"));
				ordervo.setSizeForm(resultset.getInt("userSize"));
				ordervo.setUserName(resultset.getString("userName"));
				adminorder.add(ordervo);
			}
		} catch (Exception e) {
			logger.error("주문기능예외발생: " + e.toString());
		} finally {

		}
		return (adminorder.isEmpty()) ? null : adminorder;
	}
}// end of class