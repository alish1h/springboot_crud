package com.democrud1.service;

import java.util.List;

import com.democrud1.Entity.CourseEntity;

public interface CourseService 
{

	public String upsert(CourseEntity courseEntity);
	public CourseEntity getById(Integer id);
	public List<CourseEntity> getAll();
	public String deleteById(Integer id);
}
