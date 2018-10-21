package com.cg.patient.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.patient.exception.PatientException;
import com.cg.patient.service.PatientService;
import com.cg.patient.service.PatientServiceImpl;


public class TestClass {

	@Test(expected=PatientException.class)
	public void test_ValidateName_null() throws PatientException{
		PatientService service=new PatientServiceImpl();
		service.validatePatientName(null);
	}
	
	@Test
	public void test_validateName_v1() throws PatientException{
	
		String name="Aete121";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validatePatientName(name);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateName_v2() throws PatientException{
	
		String name="Amita";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validatePatientName(name);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateName_v3() throws PatientException{
	
		String name="amita";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validatePatientName(name);
		Assert.assertEquals(false,result);
	}
	@Test(expected=PatientException.class)
	public void test_ValidateMobNo_null() throws PatientException{
		PatientService service=new PatientServiceImpl();
		service.validatePatientMobNo(null);
	}
	
	@Test
	public void test_validateMobNo_v1() throws PatientException{
	
		String mobNo="ABCD91828288";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validatePatientMobNo(mobNo);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateMobNo_v2() throws PatientException{
	
		String mobNo="9922974725";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validatePatientMobNo(mobNo);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateMobNo_v3() throws PatientException{
	
		String mobNo="992297";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validatePatientMobNo(mobNo);
		Assert.assertEquals(false,result);
	}
	
	@Test(expected=PatientException.class)
	public void test_validateMCondition_null() throws PatientException{
		PatientService service=new PatientServiceImpl();
		service.validatePatientName(null);
	}
	
	@Test
	public void test_validateMCondition_v1() throws PatientException{
	
		String pname="Aete121";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validateMCondition(pname);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateMCondition_v2() throws PatientException{
	
		String pname="Amita";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validateMCondition(pname);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateMCondition_v3() throws PatientException{
	
		String pname="amita";
		PatientService service=new PatientServiceImpl();
		boolean result= service.validatePatientName(pname);
		Assert.assertEquals(false,result);
	}
		
	
}
