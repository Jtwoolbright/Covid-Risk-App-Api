package com.jtwoolbright.covidappapi.patient;

public class Patient {
	
	private int age, sex, tobacco, contact_other_covid, inmsupr, copd,
	diabetes, renal_chronic, obesity, pregnancy, hypertension, asthma, cardiovascular, pneumonia,
	covid_res, other_disease;
	
	public Patient() {
		
	}

	public Patient(int age, int sex, int tobacco, int contact_other_covid,
			int inmsupr, int copd, int diabetes, int renal_chronic, int obesity, int pregnancy, int hypertension,
			int asthma, int cardiovascular, int pneumonia, int covid_res, int other_disease) {
		super();
		this.age = age;
		this.sex = sex;
		this.tobacco = tobacco;
		this.contact_other_covid = contact_other_covid;
		this.inmsupr = inmsupr;
		this.copd = copd;
		this.diabetes = diabetes;
		this.renal_chronic = renal_chronic;
		this.obesity = obesity;
		this.pregnancy = pregnancy;
		this.hypertension = hypertension;
		this.asthma = asthma;
		this.cardiovascular = cardiovascular;
		this.pneumonia = pneumonia;
		this.covid_res = covid_res;
		this.other_disease = other_disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getContact_other_covid() {
		return contact_other_covid;
	}

	public void setContact_other_covid(int contact_other_covid) {
		this.contact_other_covid = contact_other_covid;
	}

	public int getInmsupr() {
		return inmsupr;
	}

	public void setInmsupr(int inmsupr) {
		this.inmsupr = inmsupr;
	}

	public int getCopd() {
		return copd;
	}

	public void setCopd(int copd) {
		this.copd = copd;
	}

	public int getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(int diabetes) {
		this.diabetes = diabetes;
	}

	public int getObesity() {
		return obesity;
	}

	public void setObesity(int obesity) {
		this.obesity = obesity;
	}

	public int getHypertension() {
		return hypertension;
	}

	public void setHypertension(int hypertension) {
		this.hypertension = hypertension;
	}

	public int getAsthma() {
		return asthma;
	}

	public void setAsthma(int asthma) {
		this.asthma = asthma;
	}

	public int getCardiovascular() {
		return cardiovascular;
	}

	public void setCardiovascular(int cardiovascular) {
		this.cardiovascular = cardiovascular;
	}

	public int getCovid_res() {
		return covid_res;
	}

	public void setCovid_res(int covid_res) {
		this.covid_res = covid_res;
	}

	public int getOther_disease() {
		return other_disease;
	}

	public void setOther_disease(int other_disease) {
		this.other_disease = other_disease;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getTobacco() {
		return tobacco;
	}

	public void setTobacco(int tobacco) {
		this.tobacco = tobacco;
	}

	public int getRenal_chronic() {
		return renal_chronic;
	}

	public void setRenal_chronic(int renal_chronic) {
		this.renal_chronic = renal_chronic;
	}

	public int getPregnancy() {
		return pregnancy;
	}

	public void setPregnancy(int pregnancy) {
		this.pregnancy = pregnancy;
	}

	public int getPneumonia() {
		return pneumonia;
	}

	public void setPneumonia(int pneumonia) {
		this.pneumonia = pneumonia;
	}

}
