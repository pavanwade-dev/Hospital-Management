package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.Repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctorRepository repository;

	@Override
	public void saveDoctor(Doctor d) {
		repository.save(d);
		
	}

	@Override
	public List<Doctor> getAllDoctor() {
		List<Doctor> l=repository.findAll();
		return l;
	}

}
