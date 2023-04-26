package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.Demo;

@Mapper
public interface DemoMapper {

	public List<Demo> getExistingDemo(@Param("id") String id);
}
