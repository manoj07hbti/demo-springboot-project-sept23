package com.example.demospringbootproject.ControllerAssignment.CRUD;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MarksCRUD
{
    ArrayList<Integer> marks = new ArrayList<>();

    //C- Create or Add
@RequestMapping("/marks_add{marksScored}")
    public String add (@PathVariable int marksScored){
        marks.add(marksScored);
        return marksScored+ "Marks Added Successfully";
    }

    //R - Read or Get
    @RequestMapping("/marks")
    public ArrayList<Integer> getMarks(){
        return marks;
    }

    //U- Update
    @RequestMapping("/update/{marksScored}/{index}")
    public String update(@RequestParam int marksScored, @PathVariable int index){
        marks.set(index,marksScored);
        return marksScored+"Marks Updated Successfully";
    }

    //D- Delete or Remove
    @RequestMapping("/delete")
    public String delete(@RequestParam int index){
        marks.remove(index);
        return "Marks Deleted Successfully";
    }

}
