package com.democrud1.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.democrud1.Entity.CourseEntity;
import com.democrud1.repo.CourseRepository;
import com.democrud1.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public String upsert(CourseEntity courseEntity) {
		courseRepo.save(courseEntity);
		return "Success";
	}

	@Override
	public CourseEntity getById(Integer id) {
		Optional<CourseEntity> findById =courseRepo.findById(id);
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}

	@Override
	public List<CourseEntity> getAll() {
		courseRepo.findAll();
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		if(courseRepo.existsById(id))
		{
			courseRepo.deleteById(id);
			return "Delete Sucess";
		}
		else
		{
			return "No record found";
		}
	}

}
