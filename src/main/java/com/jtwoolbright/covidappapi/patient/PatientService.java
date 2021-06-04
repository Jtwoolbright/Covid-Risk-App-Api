package com.jtwoolbright.covidappapi.patient;

import org.springframework.stereotype.Service;

@Service
public class PatientService {

	private int result;
	private Patient patient = new Patient();
	
	public void setPatient(Patient patient) {
		this.patient = patient;
		setResult(patient);
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public int getResult() {
		return result;
	}

	private void setResult(Patient patient) {
		if (patient.getObesity() == 1) {
			result = 2;
		} else if (patient.getRenal_chronic() == 1) {
			result = 2;
		} else if (patient.getAge() >= 65) {
			result = 2;
		} else if (patient.getPneumonia() == 1) {
			result = 2;
		} else if (patient.getRenal_chronic() == 1) {
			result = 2;
		} else{
			int count = 0;
			if (patient.getAge() > 50) {
				count++;
			}
			if (patient.getTobacco() == 1) {
				count++;
			}
			if (patient.getContact_other_covid() == 1) {
				count++;
			}
			if (patient.getDiabetes() == 1) {
				count+=4;
			}
			if (patient.getAsthma() == 1) {
				count+=2;
			}
			if (patient.getCardiovascular() == 1) {
				count+=2;
			}
			if (patient.getCopd() == 1) {
				count+=4;
			}
			if (patient.getInmsupr() == 1) {
				count+=3;
			}
			if (patient.getHypertension() == 1) {
				count++;
			}
			if (patient.getPregnancy() == 1) {
				count++;
			}
			if (patient.getOther_disease() == 1) {
				count++;
			}
			if (count > 5) {
				result = 2;
			} else if (count > 3) {
				result = 1;
			} else {
				result = 0;
			}
		}
	}
}
