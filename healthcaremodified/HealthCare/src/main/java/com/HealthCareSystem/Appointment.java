package com.HealthCareSystem;

import java.math.BigInteger;
import java.util.Date;

public class Appointment {

	String  userId; 
	BigInteger appointmentId;
	Test test;
	Date datetime;
	boolean approved;
	
	DiagnosticCenter center;
	public Appointment(String userId, BigInteger appointmentId, Test test, Date datetime, boolean approved,
			DiagnosticCenter center) {
		super();
		this.userId = userId;
		this.appointmentId = appointmentId;
		this.test = test;
		this.datetime = datetime;
		this.approved = approved;
		this.center = center;
	}
	public Appointment() {
		super();
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	
	public void setAppointmentId(BigInteger appointmentId) {
		this.appointmentId = appointmentId;
	}
	public BigInteger getAppointmentId() {
		return appointmentId;
	}
	
	public void setTest(Test test) {
		this.test = test;
	}
	public Test getTest() {
		return test;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public Date getDatetime() {
		return datetime;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public boolean getApproved() {
		return approved;
	}
	
	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	} 
	
}
	