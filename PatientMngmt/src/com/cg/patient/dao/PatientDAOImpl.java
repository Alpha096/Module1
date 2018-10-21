package com.cg.patient.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.cg.patient.dto.Patient;

public class PatientDAOImpl implements PatientDAO{

	Map<Integer,Patient> patientMap;
	int idCount=100;
	public PatientDAOImpl(){
		patientMap = DataStore.createCollection();
	}
	
	@Override
	public int addPatient(Patient patient) {
		patientMap.put(idCount, patient);
		idCount++;
		return idCount;
	}

	@Override
	public ArrayList<Patient> getEmployeeList(String roomType) {
		Collection<Patient> pList = patientMap.values();
		ArrayList<Patient> patient=new ArrayList<>();
		
		for(Patient p : pList){
			if(p.getRoomType().equals(roomType)){
				patient.add(p);
			}
		}
		return patient;
		}

}


