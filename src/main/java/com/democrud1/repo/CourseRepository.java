package com.democrud1.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.democrud1.Entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Serializable>
{

}
