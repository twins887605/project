package com.thinkit.model;

import lombok.Data;

// @Data - getter/setter, toString() 을 만들어주는 어노테이션 
@Data
public class TestVO {

	private String id;
	private String name;
	private int age;
}
