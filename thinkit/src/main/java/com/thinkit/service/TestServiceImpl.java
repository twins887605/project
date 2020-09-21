package com.thinkit.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkit.dao.TestDAO;
import com.thinkit.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDAO dao;
	
	@Override
	public List<TestVO> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

}
