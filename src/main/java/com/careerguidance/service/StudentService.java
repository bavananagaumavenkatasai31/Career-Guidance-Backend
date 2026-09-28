package com.careerguidance.service;

import com.careerguidance.entity.Student;
import com.careerguidance.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Save student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update student
    public Student updateStudent(Long id, Student student) {

        Student existingStudent = getStudentById(id);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEducationLevel(student.getEducationLevel());
        existingStudent.setBoard(student.getBoard());
        existingStudent.setStream(student.getStream());
        existingStudent.setPercentage(student.getPercentage());
        existingStudent.setInterest(student.getInterest());
        existingStudent.setPreferredPath(student.getPreferredPath());
        existingStudent.setCareerGoal(student.getCareerGoal());
        existingStudent.setSkills(student.getSkills());

        return studentRepository.save(existingStudent);
    }

    // Delete student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}