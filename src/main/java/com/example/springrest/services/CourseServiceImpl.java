package com.example.springrest.services;
import com.example.springrest.enities.Course;
import com.example.springrest.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl() {
    }
    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
    @Override
    public Course getCourse(long courseId) {
        return courseRepository.getReferenceById(courseId);
    }
    @Override
    public Course addCourse(Course course) {
        courseRepository.save(course);
        return course;
    }
    @Override
    public Course updateCourse(Course course ) {
        courseRepository.save(course);
        return course;
    }

    public void deleteCourse(Long courseId){
        Course entity = courseRepository.getReferenceById(courseId);
        courseRepository.delete(entity);
    }


}
