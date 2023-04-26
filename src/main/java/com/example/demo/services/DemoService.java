package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.Demo;
import com.example.demo.dto.DemoRequest;
import com.example.demo.dto.RequestSuccess;
import com.example.demo.enums.DemoErrorCode;
import com.example.demo.exception.DemoException;
import com.example.demo.mapper.DemoMapper;

public class DemoService {


	private final DemoMapper mapper;
	
	/**
	 * 
	 */
	@Autowired
	public DemoService(DemoMapper mapper) {
		this.mapper = mapper;
	}

	/**
	 * @param loginId
	 * @return
	 */
	public RequestSuccess submitDemo(DemoRequest request) throws DemoException {
		if (request == null) {
			throw new DemoException(DemoErrorCode.EXDEMO_NULL_REQUEST.name());
		}
		RequestSuccess response = new RequestSuccess();
		
		return response;
	}

	/**
	 * @param loginId
	 * @return
	 */
	public RequestSuccess updateDemoById(String loginId) throws DemoException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param loginId
	 * @return
	 */
	public RequestSuccess deleteDemoById(String loginId) throws DemoException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param loginId
	 * @return
	 */
	public List<Demo> getDemoList(String loginId) throws DemoException {
		// TODO Auto-generated method stub
		return null;
	}

}
