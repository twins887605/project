package com.thinkit.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thinkit.vo.TestVO;

@Repository 
// DAO라고 명시 (DAO를 스프링에서 인식시켜줌)
public class TestDAOImpl implements TestDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.thinkit.mapper.TestMapper";

	@Override
	public List<TestVO> selectList() {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(namespace+".selectMember");
	}
	


}
