package com.sharebook.ebook.service;

import com.sharebook.ebook.model.Course;
import com.sharebook.ebook.repository.CourserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService{
    private final CourserRepository courserRepository;

    @Override
    public Course saveCouse(Course course){
        course.setCreateTime(LocalDateTime.now());
        return courserRepository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId){
        courserRepository.deleteById(courseId);
    }

    @Override
    public List<Course> listCourses(){
        return courserRepository.findAll();
    }
}
