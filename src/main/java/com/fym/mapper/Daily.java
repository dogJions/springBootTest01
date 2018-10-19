package com.fym.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Daily {
	
	List<com.fym.entity.Daily> selectAll();
}
