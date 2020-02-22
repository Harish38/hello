package com.HealthCareSystem;
import java.math.BigInteger;
import java.util.List;
public class User {
	
	String UserId;
	List<DiagnosticCenter> centerList;
	 String userPassword;
	String userName;
	 BigInteger contactNo;
	 String userRole;
	//HashMap<User> userList;
	String emailId; 
	int age;
	String gender;
	
	public User(String userId, List<DiagnosticCenter> centerList, String userPassword, String userName,
			BigInteger contactNo, String userRole, String emailId) {
		super();
		UserId = userId;
		this.centerList = centerList;
		this.userPassword = userPassword;
		this.userName = userName;
		this.contactNo = contactNo;
		this.userRole = userRole;
		this.emailId = emailId;
	}
	public User() {
		super();
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserId() {
		return UserId;
	}
	
	
	public void setCenterList(List<DiagnosticCenter> centerList) {
		this.centerList = centerList;
	}
	public List<DiagnosticCenter> getCenterList() {
		return centerList;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	
	
	public BigInteger getContactNo() {
		return contactNo;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}
	
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmailId() {
		return emailId;
	} 
}