package com.registration.ServiceI;

import com.registration.Dto.Pojo;

public interface RegisterationServiceI {
	 public int register(Pojo p);
	 public boolean login(String email,String password);


}
