package com.cg.patient.dto;

public class Patient {
	
	private int patientId;
	private String patientName;
	private String patientMobNo;
	private String patientMCondition;
	private String roomType;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientMobNo() {
		return patientMobNo;
	}
	public void setPatientMobNo(String patientMobNo) {
		this.patientMobNo = patientMobNo;
	}
	public String getPatientMCondition() {
		return patientMCondition;
	}
	public void setPatientMCondition(String patientMCondition) {
		this.patientMCondition = patientMCondition;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
}
