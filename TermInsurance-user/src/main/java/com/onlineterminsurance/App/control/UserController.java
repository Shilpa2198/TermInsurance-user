package com.onlineterminsurance.App.control;

import java.util.List;


//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineterminsurance.App.entity.User;
import com.onlineterminsurance.App.exception.ResourceNotFoundException;
import com.onlineterminsurance.App.service.UserServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	@GetMapping("/user")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Integer userid) throws ResourceNotFoundException {
		User user= userService.findUserById(userid);
		return  ResponseEntity.ok(user);
	}

	@PostMapping("/user")
	public User saveUser( @RequestBody User user1 ) {
		return userService.saveUser(user1);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable(value = "id") Integer userid,
			 @RequestBody User user) throws ResourceNotFoundException {
		User user1= userService.updateUser(userid, user);
		return  ResponseEntity.ok(user1);
	}
	 @DeleteMapping("/user/{id}")
	 public ResponseEntity<Boolean> deleteUser(@PathVariable(value = "id") Integer userid,@RequestBody User user) throws ResourceNotFoundException	{
			Boolean user1 = userService.deleteUserById(userid);
			return  ResponseEntity.ok(user1);
 }

}
