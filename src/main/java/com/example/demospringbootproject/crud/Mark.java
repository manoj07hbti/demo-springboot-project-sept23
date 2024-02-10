package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Mark {

    ArrayList<Integer>marks=new ArrayList<>();
    @RequestMapping("/_add")
    public Integer add(@RequestParam Integer mark){
        marks.add(mark);
        return mark ;
    }
    @RequestMapping("/all_number")
    public ArrayList<Integer>getMarks(){
        return marks;
    }
    @RequestMapping("/update")
    public Integer update(@RequestParam Integer mark,@RequestParam Integer index){
        marks.set(index,mark);
        return mark;
    }
    @RequestMapping("/delete")
    public Integer delete(@RequestParam Integer index){
        marks.remove(index);
        int mark=0;
        return mark;

    }

}
