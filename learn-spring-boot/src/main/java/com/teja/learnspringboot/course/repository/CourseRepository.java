package com.teja.learnspringboot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teja.learnspringboot.course.bean.Course;

// This interface is required to get data from database
public interface CourseRepository extends JpaRepository<Course, Long> {

}
