package com.silkroad.MybatisFactory;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//마이바티스 파일 및 매퍼연동 담당
public class SqlSessionFactoryGenerater {

	private static Logger mybatislog = LoggerFactory.getLogger(SqlSessionFactoryGenerater.class);

	public static SqlSessionFactory MyBatisSession() {
		String mybatisConfig = "Mybatis/BoardMapper.xml";
		InputStream stream = null;
		SqlSessionFactory sessionfactory = null;

		try {
			mybatislog.info("=============================");
			mybatislog.info("Mybatis 연동성공하였습니다~!");
			mybatislog.info("=============================");

			stream = Resources.getResourceAsStream(mybatisConfig);
			sessionfactory = new SqlSessionFactoryBuilder().build(stream);
		} catch (Exception e) {
			mybatislog.error(e.toString());
		}
		return sessionfactory;
	}

}