package com.pc.service;

import java.util.List;

import com.pc.entity.Course;

public interface ICourseService {
	public List<Course> getByCategory(String category);
	public List<Course> getByInstructorName(String instructorName);
	public List<Course> getByPriceLessThan(Double price);
	public List<Course> getByPriceGreaterThan(Double price);
	public List<Course> getByDurationInHoursGreaterThan(Integer hours);
	public List<Course> getByRatingGreaterThanEqual(Double rating);
	public List<Course> getByLanguage(String language);
	public List<Course> getByCourseTitleContaining(String keyword);
}
