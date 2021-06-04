package com.jtwoolbright.covidappapi.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@RequestMapping(method=RequestMethod.POST, value="/result")
	public int postPatient(@RequestBody Patient patient) {
		patientService.setPatient(patient);
		return patientService.getResult();	
	}
}
