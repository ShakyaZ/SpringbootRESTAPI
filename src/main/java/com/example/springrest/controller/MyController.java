package com.example.springrest.controller;

import com.example.springrest.enities.Course;
import com.example.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String Home() {
        return "welcome to home:: home";
    }

    //getting courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();

    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));

    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);

    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId) {
        this.courseService.deleteCourse(Long.valueOf(courseId));
        System.out.println("deleted the course");
    }
}
