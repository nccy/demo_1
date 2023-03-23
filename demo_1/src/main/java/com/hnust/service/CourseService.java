package com.hnust.service;

import com.hnust.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 长夜
 * @date 2023/3/22 21:48
 */
public interface CourseService {
    Integer insertAutoId(Course course);
    List<Course> selectAll();
    Course selectById(Integer id);
    Integer update(Course course);
    List<Course> selectByscName(String name);
}
