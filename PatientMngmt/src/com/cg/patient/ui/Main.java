package com.cg.patient.ui;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.patient.dto.Patient;
import com.cg.patient.exception.PatientException;
import com.cg.patient.service.PatientService;
import com.cg.patient.service.PatientServiceImpl;


public class Main {
	public static void main(String args[]) throws PatientException{
	PatientService service = new PatientServiceImpl();
    Patient patient;
    int ch=0;
    Scanner sc=new Scanner(System.in);
    		
    do{
    System.out.println("1. Add Patient ");
    System.out.println("2. Display Patient Details based on Room Type");
    System.out.println("3. Exit");
    System.out.println("Enter Your Choice");
    ch=sc.nextInt();
    
    switch(ch)
    {
    case 1: 
        do{
        System.out.println("Enter Patient Name :");
        String patientName=sc.next();
        System.out.println("Enter Patient MobileNo: ");
        String mobileNo=sc.next();
        System.out.println("Enter Patient medical condition: ");
        String mCondition=sc.next();
        System.out.println("Enter Room type: ");
        String roomType=sc.next();  
        patient = new Patient();
        patient.setPatientName(patientName);
        patient.setPatientMobNo(mobileNo);
        patient.setPatientMCondition(mCondition);
        patient.setRoomType(roomType);
            if( service.ValidateDetails(patient)!=null)
                break;
            else
                System.out.println("Invalid details entered...");
        }while(true);
            int id = service.addPatient(patient);
            System.out.println("Patient added..."+id);
    break;
    
    case 2:
    	 System.out.println("Enter Room type: ");
         String rt=sc.next();
         ArrayList<Patient> list=service.getPatientList(rt);
         if(list.size()==0)
             System.out.println("No patient found");
         else{
             for(Patient s:list){
                 System.out.println(s.getPatientName()+" "+s.getPatientMobNo()+ " " + s.getPatientMCondition());
             }
         }break;
  
    }
    
}while(ch!=3);
}
}
