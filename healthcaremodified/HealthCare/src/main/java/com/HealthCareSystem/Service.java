package com.HealthCareSystem;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
public interface Service {
	
	public String ValidateName(String Name) throws HealthException;
	public	String ValidatePassword(User User) throws HealthException;
	public	int ValidatePhoneNo(User User) throws HealthException;

		class ServiceImpl implements Service {
		
private static final String Name = null;
Scanner sc=new Scanner(System.in);

public String ValidateName(String Name) throws HealthException {
	Pattern p=Pattern.compile("[A-Za-z]+");
	Matcher m=p.matcher(Name);
	if(!m.matches()) {
		throw new HealthException("First Letter Should Contain Only Alphabets");
	}
	return Name;
}
			public String ValidatePassword(String Password) throws HealthException {
				Pattern p=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,14})");
				Matcher m=p.matcher(Password);
				if(!m.matches()) {
					throw new HealthException("Password is wrong");
				}
			
				return Password;
			}
		
			public String ValidatePhoneNo(String mobileno) throws HealthException {
				
				if(mobileno.length()!=10){
					 try {
						throw new HealthException("Invalid Number");
					} catch (HealthException e) {
						e.printStackTrace();
					}
					
			}
				return mobileno;
			}

			public int addCenter(DiagnosticCenter center){
				 
				
				return 0;
			}

			public int removeCenter(DiagnosticCenter center){
				
				
				
				return 0;
			}

			public String addTest(String test) throws HealthException {
				return test;
					
				}

			public int removeTest(Test test) {
				
				return 0;
			}

			public int approveAppointement() {
			
				return 0;
			}

			public int makeanAppointement(User user, DiagnosticCenter center, Test test, Date datetime)
					 {
				
				
				return 0;
			}

			public String register() throws HealthException {
							
							System.out.println("enter Name");
							System.out.println("Name should not start with special characters and should not be blank. First letter should be capital");
							String Name=sc.next();
							ServiceImpl s = new ServiceImpl();
							s.ValidateName(Name);
						System.out.println("enter Password");
							System.out.println("Password must contain one number,one alphabet,one special\r\n" + 
									"character and size should be at least 8 characters and not more than 14\r\n" + 
									"characters.\r\n" + 
									"");
							String Password=sc.next();
							s.ValidatePassword(Password);
							System.out.println("enter phone number");
							System.out.println(": Phone number should be 10 digits");
							String mobileno = sc.next();
							Random r=new Random();
							int rn=r.nextInt(1000);
							System.out.println("UserId is "+rn);
							return s.ValidatePhoneNo(mobileno);
							
}

			
			public String ValidatePassword(User User) throws HealthException {
				// TODO Auto-generated method stub
				return null;
			}

			public int ValidatePhoneNo(User User) throws HealthException {
				// TODO Auto-generated method stub
				return 0;
			}
		
}
}
			
