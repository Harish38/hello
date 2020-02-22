
package com.HealthCareSystem;
import java.util.Date;
public interface DAO {
	int addCenter(DiagnosticCenter center) ;
	int removeCenter(DiagnosticCenter center) ;
	int addTest(Test test) throws HealthException;
	int removeTest(Test test) ;
	int approveAppointement();
int makeanAppointement(User user,DiagnosticCenter center, Test test,  Date datetime);
	int register(User User);
		 
	}