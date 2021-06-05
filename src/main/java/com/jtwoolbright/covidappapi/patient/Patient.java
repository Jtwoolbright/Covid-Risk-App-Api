package com.jtwoolbright.covidappapi.patient;

public class Patient {
	
	private int age, sex, tobacco, vaccinated, imSupress, copd,
	diabetes, kidneyFail, obesity, pregnancy, hypertension, asthma, cardiovascular, pneumonia,
	other;
	
	public Patient() {
		
	}

	public Patient(int age, int sex, int tobacco, int vaccinated,
			int imSupress, int copd, int diabetes, int kidneyFail, int obesity, int pregnancy, int hypertension,
			int asthma, int cardiovascular, int pneumonia, int other) {
		super();
		this.age = age;
		this.sex = sex;
		this.tobacco = tobacco;
		this.vaccinated = vaccinated;
		this.imSupress = imSupress;
		this.copd = copd;
		this.diabetes = diabetes;
		this.kidneyFail = kidneyFail;
		this.obesity = obesity;
		this.pregnancy = pregnancy;
		this.hypertension = hypertension;
		this.asthma = asthma;
		this.cardiovascular = cardiovascular;
		this.pneumonia = pneumonia;
		this.other = other;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(int vaccinated) {
		this.vaccinated = vaccinated;
	}

	public int getImSupress() {
		return imSupress;
	}

	public void setImSupress(int imSupress) {
		this.imSupress = imSupress;
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

	public int getOther() {
		return other;
	}

	public void setOther(int other) {
		this.other = other;
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
	
	public void getKidneyFail(int kidneyFail) {
		this.kidneyFail = kidneyFail;
	}
	
	public int getKidneyFail() {
		return kidneyFail;
	}

}
