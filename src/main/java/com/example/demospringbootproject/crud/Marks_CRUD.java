package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Marks_CRUD {
    ArrayList<Integer> marksCrud = new ArrayList();

    // C- Create or Add
    @RequestMapping("/marks_add")
    public String add(@RequestParam int marks) {
        marksCrud.add(marks);
        return marks + " added successfully";
    }

    // R- Read or Get
    @RequestMapping("/marks_read")
    public ArrayList<Integer> getMarksCrud() {
        return marksCrud;
    }

    // U- Update
    @RequestMapping("/marks_update")
    public String update(@RequestParam int marksUpdate,@RequestParam int index){
        marksCrud.set(index,marksUpdate);
        return marksUpdate+" update successfully";
    }

    // D- Delete

    @RequestMapping("/marks_delete")

    public String delete(@RequestParam int index){
        marksCrud.remove(index);
        return  " deleted successfully";
    }


}
