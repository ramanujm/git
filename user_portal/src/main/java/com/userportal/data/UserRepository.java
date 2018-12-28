/**
 * 
 */
package com.userportal.data;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.userportal.model.User;

/**
 * @author mishrar
 *
 */
public interface UserRepository extends Repository<User, Integer> {

	void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);
}
