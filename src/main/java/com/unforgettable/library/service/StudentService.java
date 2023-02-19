package com.unforgettable.library.service;

import com.unforgettable.library.entity.Book;
import com.unforgettable.library.entity.Student;
import com.unforgettable.library.exception.StudentNotFoundException;
import com.unforgettable.library.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(
                () -> new StudentNotFoundException("Student with ID=" + id + " not found")
        );
    }

    public void deleteStudentById(Long id) {
        studentRepository.delete(getStudentById(id));
    }

    public void updateStudent(Student student) {
        Student updatedStudent = getStudentById(student.getId());
        updatedStudent.setStudent(student);
        studentRepository.save(updatedStudent);
    }

    public List<Book> getBooksReadByStudent(Long id) {
        return getStudentById(id).getBooks();
    }
}
