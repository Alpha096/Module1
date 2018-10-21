package com.cg.patient.dao;
import java.util.HashMap;
import java.util.Map;

import com.cg.patient.dto.Patient;

public class DataStore {
		private static Map<Integer,Patient> patient;
		public static Map<Integer,Patient> createCollection(){
			if(patient==null)
				patient=new HashMap<>();
			return patient;
			
		}
		}
