package com.registration.DaoI;

import com.registration.Dto.Pojo;

public interface RegistrationDaoI {

	 public int register(Pojo p);
	 public boolean login(String email,String password);

}
