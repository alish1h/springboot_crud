package com.democrud1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.democrud1.Entity.CourseEntity;
import com.democrud1.service.CourseService;

@RestController
public class CourseController 
{

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody CourseEntity courseEntity)
	{
		String status=courseService.upsert(courseEntity);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/course{id}")
	public ResponseEntity<CourseEntity> getCourse(@PathVariable Integer id)
	{
		CourseEntity course=courseService.getById(id);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<CourseEntity>> getAllCourses()
	{
		List<CourseEntity> courseEntity=courseService.getAll();
		return new ResponseEntity<>(courseEntity, HttpStatus.OK);
	}
	
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody CourseEntity courseEntity)
	{
		String status=courseService.upsert(courseEntity);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/course{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id)
	{
		String status=courseService.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
}
