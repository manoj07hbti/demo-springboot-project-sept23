package com.example.demospringbootproject.ControllerAssignment;

import com.example.demospringbootproject.Service.EngineerService;
import com.example.demospringbootproject.entity.Engineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerDbController
{
    @Autowired
    EngineerService service;
    @PostMapping("/add_engg_db")
    public String add(@RequestBody Engineer engineer){
        return service.add(engineer);
    }

    @GetMapping("engineers")
    public List<Engineer> getAllEngineers(){
    return service.getAllEngineer();
    }

    @GetMapping("/engineer/{id}")
    public Engineer getEngineerbyID(@PathVariable Long id){
    return service.getEngineerbyID(id);
    }

    @PutMapping("/update_name{name}/{id}")
    public String updateName(@PathVariable String name, @PathVariable long id){
        return service.updateName(name, id);

    }
    @DeleteMapping("/remove/{id}")
    public String removeStudent(@PathVariable long id){
        return service.removeStudent(id);
    }
}
