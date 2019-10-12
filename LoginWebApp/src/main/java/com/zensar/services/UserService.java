package com.zensar.services;

import org.springframework.stereotype.Service;
import com.zensar.entities.User;

@Service
public interface UserService {
	
	boolean validateUser(User user);
	
}
