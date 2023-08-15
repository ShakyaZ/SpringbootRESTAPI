package com.example.springrest.services;

import com.example.springrest.enities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(Long studentId);


}
