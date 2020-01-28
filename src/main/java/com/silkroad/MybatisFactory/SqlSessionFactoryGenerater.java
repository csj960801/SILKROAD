package com.silkroad.MybatisFactory;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//마이바티스 파일 및 매퍼연동 담당
public class SqlSessionFactoryGenerater {

	private static Logger mybatislog = LoggerFactory.getLogger(SqlSessionFactoryGenerater.class);

	private static String mybatisConfig = "Mybatis/BoardMapper.xml";
	private static InputStream stream = null;
	private static SqlSessionFactory sessionfactory = null;
	private static SqlSession session = null;

	public static SqlSession MyBatisSession() {
		try {
			mybatislog.info("Mybatis 연동성공하였습니다~!");

			stream = Resources.getResourceAsStream(mybatisConfig);
			sessionfactory = new SqlSessionFactoryBuilder().build(stream);
			session = sessionfactory.openSession();
		} catch (Exception e) {
			mybatislog.error(e.toString());
		}
		return session;
	}

}