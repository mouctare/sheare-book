package com.sharebook.ebook.service;

import com.sharebook.ebook.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCouse(Course course);

    void deleteCourse(Long courseId);

    List<Course> listCourses();
}
