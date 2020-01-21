package com.silkroad.SilkRoadDB;

public class SqlMapper {

	// SQL종류에 따른 SQL명령문 생성 함수
	public String sqlMap(String sqlMapper) {
		String sql = "";
		switch (sqlMapper) {
		case "insert":
			sql = "insert into board(BoardWriter, BoardContent) values(?,?)";
			break;
		case "OrderInsert":
			sql = "insert into OrderBoard(ItemName, ItemPrice, userSize, OrderAddr, userName, orderTel) values(?,?,?,?,?,?)";
			break;
		case "AdminBoard":
			sql = "select * from board where BoardNum is not null";
			break;
		case "AdminOrder":
			sql = "select * from orderboard where OrderCnt is not null";
			break;
		}
		return sql;
	}
}