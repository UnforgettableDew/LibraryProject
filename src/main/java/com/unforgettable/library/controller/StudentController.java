package com.unforgettable.library.controller;

import com.unforgettable.library.entity.Book;
import com.unforgettable.library.entity.Student;
import com.unforgettable.library.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/list")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/read-book/{studentId}")
    public List<Book> getBooksReadByStudent(@PathVariable(name = "studentId") Long id) {
        return studentService.getBooksReadByStudent(id);
    }

    @PostMapping()
    public void addStudent(@Valid @RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping()
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }


}
