package com.cg.patient.dao;

import java.util.ArrayList;
import com.cg.patient.dto.Patient;

public interface PatientDAO {
	public int addPatient(Patient patient);
	public ArrayList<Patient> getEmployeeList(String roomType);
}
