package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exception.UserExistsException;
import com.stacksimplify.restservices.exception.UserNotFoundException;
import com.stacksimplify.restservices.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// Get all users
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	// Create user
	public User createUser(User user) throws UserExistsException {
		// if user exists with the username
		User existingUser = userRepository.findByUsername(user.getUsername());
		// if not exist throw UserExistException
		if (existingUser != null) {
			throw new UserExistsException("User already exists in repository");
		}

		return userRepository.save(user);
	}

	// Get user by ID
	public Optional<User> getUserById(Long id) throws UserNotFoundException {
		Optional<User> user = userRepository.findById(id);
		if (!user.isPresent()) {
			throw new UserNotFoundException("User not found in user repository");
		}
		return user;
	}

	// Update user by ID
	public User updateUserById(Long id, User user) throws UserNotFoundException {
		Optional<User> OptionalUser = userRepository.findById(id);
		if (!OptionalUser.isPresent()) {
			throw new UserNotFoundException("User not found in user repository, provide the correct user id");
		}
		user.setUserid(id);
		return userRepository.save(user);
	}

//deleteUserByID

	public void deleteUserById(Long id) {
		Optional<User> OptionalUser = userRepository.findById(id);
		if (!OptionalUser.isPresent()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
					"User not found in user repository, provide the correct user id");
		}
		userRepository.deleteById(id);

	}

	// getUserByUsernameMethod
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
