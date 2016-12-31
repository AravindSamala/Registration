package com.registration.SeviceImpl;

import com.registration.DaoI.RegistrationDaoI;
import com.registration.DaoImpl.RegistrationDaoImpl;
import com.registration.Dto.Pojo;
import com.registration.ServiceI.RegisterationServiceI;

public class RegistrationServiceImpl implements RegisterationServiceI {

	public int register(Pojo p) {
		// TODO Auto-generated method stub
		RegistrationDaoI rdaoi = new RegistrationDaoImpl();
		return rdaoi.register(p);
	}

	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		RegistrationDaoI rdaoi = new RegistrationDaoImpl();
		return rdaoi.login(email, password);

	}

}
