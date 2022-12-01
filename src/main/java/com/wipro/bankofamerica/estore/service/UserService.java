package com.wipro.bankofamerica.estore.service;

import java.util.HashSet;
import java.util.List;

import com.wipro.bankofamerica.estore.model.FourDigitNumber;
import com.wipro.bankofamerica.estore.model.User;

/**
 *
 * @author Jeevan
 */
public interface UserService {

	public User loginUser(String username, String password) throws Exception;

//	public User saveUser(User user);

	public List<User> getListByCity(String city);
	
	public FourDigitNumber saveFourDigitNumber(FourDigitNumber fourDigitNumber);
	
	public HashSet<User> saveUser(User user); // new added method in our programs

	HashSet<User> saveUser(HashSet<User> user);

}
