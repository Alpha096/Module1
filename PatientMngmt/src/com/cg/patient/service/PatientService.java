package com.cg.patient.service;

import java.util.ArrayList;

import com.cg.patient.dto.Patient;
import com.cg.patient.exception.PatientException;

public interface PatientService {
	public int addPatient(Patient patient);
	public ArrayList<Patient> getPatientList(String roomType);
	public Patient ValidateDetails(Patient emp)throws PatientException;
	public boolean validatePatientName(String name) throws PatientException;
	public boolean validatePatientMobNo(String mob) throws PatientException;
	public boolean validateMCondition(String mCondition) throws PatientException;
	public boolean validateRoomType(String roomtype) throws PatientException;
    
}
