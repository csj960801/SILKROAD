package com.silkroad.SilkRoadDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.silkroad.SilkRoadDB.DBConnection;
import com.silkroad.SilkRoadDB.SqlMapper;
import com.silkroad.SilkRoadVO.SilkRoadBoardVO;
import com.silkroad.SilkRoadVO.SilkRoadOrderVO;

public class SilkRoadDAOImpl extends SqlMapper implements SilkRoadDAO {
	private Logger logger = LoggerFactory.getLogger(SilkRoadDAOImpl.class);

	private Connection conector;
	private PreparedStatement sqlState;

	public static SilkRoadDAOImpl getDaoImpl() {
		return new SilkRoadDAOImpl();
	}

	/*
	 * 문의게시판 문의글 저장
	 */
	@Override
	public boolean insertInquiry(SilkRoadBoardVO vo) {
		boolean check = false;
		String sql = "insert";

		try {
			conector = DBConnection.getDBConnector();
			sqlState = conector.prepareStatement(super.sqlMap(sql));

			sqlState.setString(1, vo.getClientEmail());
			sqlState.setString(2, vo.getClientInquiry());
			if (sqlState.executeUpdate() > 0) {
				check = true;
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
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return check;
	}

	@Override
	public boolean insertOrder(SilkRoadOrderVO vo2, HttpServletRequest req) {
		boolean check = false;
		String sql = "OrderInsert";
		try {
			conector = DBConnection.getDBConnector();
			sqlState = conector.prepareStatement(super.sqlMap(sql));
			sqlState.setString(1, vo2.getItemName());
			sqlState.setString(2, vo2.getItemPrice());
			sqlState.setInt(3, vo2.getSizeForm());
			sqlState.setString(4, vo2.getOrderAddr());
			sqlState.setString(5, vo2.getUserName());
			sqlState.setString(6, vo2.getOrderTel());
			if (sqlState.executeUpdate() > 0) {
				check = true;
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
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return check;
	}

}
