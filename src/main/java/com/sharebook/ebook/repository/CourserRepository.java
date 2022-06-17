package com.sharebook.ebook.repository;

import com.sharebook.ebook.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourserRepository extends JpaRepository<Course, Long> {
}
