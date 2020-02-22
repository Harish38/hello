package com.HealthCareSystem;
import java.util.Scanner;

import com.HealthCareSystem.Service.ServiceImpl;
public class Health_Controller {
	public static void main(String[] args) throws HealthException   {
		Scanner sc=new Scanner(System.in);
				System.out.println("1.enter 1-if ur user");
				System.out.println("2.enter 2-if ur admin");
				int m=sc.nextInt();
				while(true) {
					switch(m) {
					case 1:
						System.out.println("r-enter r-for register");
						System.out.println("a-enter a-for appointment ");
					char a=sc.next().charAt(0);
						switch(a) {
						case 'r':
							ServiceImpl s = new ServiceImpl();
						s.register();
						break;
						case 'a':
							System.out.println("select the diagnostic center");
							//call the list of diagnostics
							System.out.println("select the test");
							//call the list of tests
							//updating of appointment list
							System.out.println("select date and time");
							//call date and time
					break;
						}
					case 2:
						System.out.println("enter userId");
						int userId=sc.nextInt();
						System.out.println("enter password");
						String password=sc.next();
						//call of dao layer
					}
				}
			}
		}
			