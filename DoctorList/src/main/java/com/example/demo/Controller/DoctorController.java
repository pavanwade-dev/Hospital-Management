package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Doctor;
import com.example.demo.Service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	@PostMapping("Doctor")
	String saveDoctor(@RequestBody Doctor d)
	{
		doctorService.saveDoctor(d);
		return "Doctor Added Successfully";

}
	@GetMapping("Doctors")
	List<Doctor> getAllDoctor()
	{
	return doctorService.getAllDoctor();
}
}