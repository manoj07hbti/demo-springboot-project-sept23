package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CourseCRUDController {
    ArrayList<String> courses=new ArrayList<>();

    //C- CREATE or ADD
    @RequestMapping("/course_add/{course}")
    public String add(@PathVariable String course){
        courses.add(course);
        return course+" added SuccessFully:";
    }

    //R- READ/GET

    @RequestMapping("/courses")
    public ArrayList<String> getCourses(){
        return courses;
    }

    //U- UPDATE

    @RequestMapping("/update_course")
    public String update(@RequestParam String courseName, @RequestParam int index ){
        courses.set(index,courseName);
         return courseName+ " Updated Successfully...";
    }

    //D-DELETE
    @RequestMapping("/delete_course")
    public String delete(@RequestParam int index){

        courses.remove(index);

        return "Deleted Successfully...";
    }

}
