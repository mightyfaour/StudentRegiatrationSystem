package com.example.studentregiatrationsystem.services;

import com.example.studentregiatrationsystem.dtos.request.addStudentRequest;
import com.example.studentregiatrationsystem.dtos.response.addStudentResponse;

public interface StudentServices {
    addStudentResponse addStudent (addStudentRequest request);
}
