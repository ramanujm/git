/**
 * 
 */
package com.userportal.service;

import java.util.List;

import com.userportal.model.User;

/**
 * @author mishrar
 *
 */
public interface UserService {
	
	User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);

}
