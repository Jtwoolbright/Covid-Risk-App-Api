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
		if (patient.getVaccinated() == 1) {
			result = 0;
		} else if (patient.getKidneyFail() == 1) {
			result = 2;
		} else if (patient.getAge() >= 65) {
			result = 2;
		} else if (patient.getPneumonia() == 1) {
			result = 2;
		} else if (patient.getObesity() == 1) {
			result = 2;
		} else{
			int count = 0;
			if (patient.getAge() > 50) {
				count++;
			}
			if (patient.getTobacco() == 1) {
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
			if (patient.getImSupress() == 1) {
				count+=3;
			}
			if (patient.getHypertension() == 1) {
				count++;
			}
			if (patient.getPregnancy() == 1) {
				count++;
			}
			if (patient.getOther() == 1) {
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
