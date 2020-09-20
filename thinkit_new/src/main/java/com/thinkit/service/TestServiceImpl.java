package com.thinkit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkit.mapper.TestMapper;
import com.thinkit.model.TestVO;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {
	
	// @Setter(onMethod_ = @Autowired)
	private TestMapper mapper;
	
	@Override
	public List<TestVO> getList() {
		// TODO Auto-generated method stub
		
		log.info("getList............");
		
		return mapper.getList();
	}

}
