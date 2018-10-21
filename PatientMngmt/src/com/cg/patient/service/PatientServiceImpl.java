package com.cg.patient.service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.cg.patient.dao.PatientDAO;
import com.cg.patient.dao.PatientDAOImpl;
import com.cg.patient.dto.Patient;
import com.cg.patient.dto.RoomType;
import com.cg.patient.exception.PatientException;

public class PatientServiceImpl implements PatientService{

	PatientDAO dao;
    public PatientServiceImpl(){
     dao = new PatientDAOImpl();
    }
    
	@Override
	public int addPatient(Patient patient) {
		return dao.addPatient(patient);
	}

	@Override
	public ArrayList<Patient> getPatientList(String roomType) {
		return dao.getEmployeeList(roomType);
	}
	
	public Patient ValidateDetails(Patient patient) throws PatientException {

        if(validatePatientName(patient.getPatientName()) && validatePatientMobNo(patient.getPatientMobNo())  && validateMCondition(patient.getPatientMCondition()) && validateRoomType(patient.getRoomType()) )
            return patient;
        else
            return null;
}


	public boolean validatePatientName(String name) throws PatientException {
	 if(name==null)
            throw new PatientException("Name can not be null");
     Pattern pat = Pattern.compile("[A-Z][a-z]{3,12}");
     Matcher mat= pat.matcher(name);
     return mat.matches();
    }

	public boolean validatePatientMobNo(String mob) throws PatientException {
		if(mob==null) {
			throw new PatientException("Mobile number cannot be null");
		}
		Pattern pat = Pattern.compile("[0-9]{10}");
		Matcher mat= pat.matcher(mob);
		return mat.matches();
	}
	
	public boolean validateMCondition(String mCondition) throws PatientException{
		Pattern pat = Pattern.compile("[A-Z][a-z]{3,15}");
	    Matcher mat= pat.matcher(mCondition);
	    return mat.matches();	
	}
		
	public boolean validateRoomType(String roomType) throws PatientException {
		
	    if(roomType.equals((RoomType.Special).toString()) || roomType.equals((RoomType.DoubleSharing).toString()) || roomType.equals((RoomType.General).toString()))
	    	return true;
	    else {
	    	return false;
	    }
	}

}
