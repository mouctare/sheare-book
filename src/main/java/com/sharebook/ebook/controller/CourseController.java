package com.sharebook.ebook.controller;

import com.sharebook.ebook.model.Course;
import com.sharebook.ebook.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/course")
public class CourseController {

    private CourseService courseService;

    @PostMapping
    public ResponseEntity<?> saveCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.saveCouse(course), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId){
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> getAllCourses(){
        return  ResponseEntity.ok(courseService.listCourses());
    }
}
