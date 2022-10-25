package com.example.studentregiatrationsystem.repositories;

import com.example.studentregiatrationsystem.model.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
