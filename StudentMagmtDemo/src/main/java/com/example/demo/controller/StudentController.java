package com.example.demo.controller;

import com.example.demo.model.Student20IT144;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentrepository;



  //  ArrayList<Student20IT144> student = new ArrayList<Student20IT144>(
    //        Arrays.asList(
      //              new Student20IT144(1, "Parth"),
       //             new Student20IT144(2, "xyz"),
         //           new Student20IT144(3, "pqr"),
                //    new Student20IT144(4, "abc")
         //   )
  //  );
    // Add student POST
    @PostMapping("/")
    public String addStudent(@RequestBody Student20IT059 student){
        studentrepository.save(student);
       // this.student.add(student);
        return "Student added successfully";
    }
    // Update student PUT
    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable int id){
        return "Student updated successfully";
    }

    // view student GET
    @GetMapping("/student/{id}")
    public Student20IT059 getStudent(@PathVariable int id){
        //for(int i=0; i<student.size();i++){
         //   Student20IT059 studObj = student.get(i);
        //    if (studObj.getId() == id ){
         //       return student.get(i);
         //   }
      //  }
        return null;
    }

    // list all the students GET
    @GetMapping("/listStudents")
    public String listStudents(){
        return "Students list";
    }

    // delete student DELETE
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        return "Student delete mapping";
    }

}
