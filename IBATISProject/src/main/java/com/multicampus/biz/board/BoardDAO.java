package com.multicampus.biz.board;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.multicampus.biz.util.SqlMapClientFactoryBean;

public class BoardDAO {
	
	// SqlMapClient 객체가 바로 iBATIS 컨테이너다.
	private SqlMapClient ibatis;
	
	public BoardDAO() {
		// SqlMapClient는 SqlMapClientFactoryBean으로부터 획득한다.
		ibatis = SqlMapClientFactoryBean.getSqlMapClientInstance();
	}


}
