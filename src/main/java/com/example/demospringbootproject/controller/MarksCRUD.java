package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class MarksCRUD {
    ArrayList<Integer> marks=new ArrayList<>();
    @RequestMapping("/marks_add/{marksScored}")
    public String add(@PathVariable int marksScored){
        marks.add(marksScored);
        return marksScored+"Marks Added Successfully";
    }
    @RequestMapping("/marks")
    public ArrayList<Integer> getMarks(){
        return marks;
    }
    @RequestMapping("/marks_update/{marksScored}/{index}")
    public String update(@PathVariable int marksScored,@PathVariable int index){
        marks.set(index,marksScored);
        return marksScored+"Marks Updated Successfully";
    }
    @RequestMapping("/marks_delete")
    public String delete(@RequestParam int index){
        marks.remove(index);
        return "Marks Deleted Successfully";
    }
}
