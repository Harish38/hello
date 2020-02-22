package com.HealthCareSystem;
import java.util.ArrayList;
import java.util.List;
public class DiagnosticCenter {
	 String centerName;
	 String centerId;
	  List<Test> listOfTests=new ArrayList<Test>();
	   List<Appointment> appointmentList=new ArrayList<Appointment>();
	   
	  public DiagnosticCenter() {//Default constructor
		super();
	}
	public DiagnosticCenter(String centerName, String centerId, List<Test> listOfTests,List<Appointment> appointmentList) {//Parametrized constructor
		super();
		this.centerName = centerName;
		this.centerId = centerId;
		this.listOfTests = listOfTests;
		this.appointmentList = appointmentList;
	}
	
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterId() {
		return centerId;
	}
	
	public void setListOfTests(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}
	public List<Test> getListOfTests() {
		return listOfTests;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
}
