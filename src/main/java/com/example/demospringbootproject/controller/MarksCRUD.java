package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class MarksCRUD {
    ArrayList<Integer> marks=new ArrayList<>();
    @PostMapping("/marks_add/{marksScored}")
    public String add(@PathVariable int marksScored){
        marks.add(marksScored);
        return marksScored+"Marks Added Successfully";
    }
    @GetMapping("/marks")
    public ArrayList<Integer> getMarks(){
        return marks;
    }
    @PutMapping("/marks_update/{marksScored}/{index}")
    public String update(@PathVariable int marksScored,@PathVariable int index){
        marks.set(index,marksScored);
        return marksScored+"Marks Updated Successfully";
    }
    @DeleteMapping("/marks_delete")
    public String delete(@RequestParam int index){
        marks.remove(index);
        return "Marks Deleted Successfully";
    }
}
