package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Doctor;

public interface DoctorService {
	void saveDoctor(Doctor d);
	List<Doctor> getAllDoctor();
}
