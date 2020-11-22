package com.onlineterminsurance.App.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.onlineterminsurance.App.entity.User;
import com.onlineterminsurance.App.exception.ResourceNotFoundException;
import com.onlineterminsurance.App.repository.UserDaoImpl;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl user;
	

	public List<User> getAllUsers(){
		return user.findAll();
	}

	public User findUserById(@PathVariable(value="id")Integer userid) throws ResourceNotFoundException {
		
		User user1=user.findByUserId(userid);
		if(user1==null)
		{
			new ResourceNotFoundException("User Policy not found for this id :: " + userid);
		}
		return user1;
	}
	/*public boolean deleteUserById(@PathVariable(value="id") Long medicalId)
	{
		
		return userdetails.deleteById(medicalId);
	}*/
	 public boolean deleteUserById(Integer userid) throws ResourceNotFoundException {
	    	User user1 = user.findById(userid)
					.orElseThrow(() -> new ResourceNotFoundException("User Policy ot found for this id :: " + userid));
	    	 user.delete(user1);
	    	 if(null == user){
		            return true;
		        }
		        return false;
	    }

	public User saveUser(User user1) {
		
		return user.save(user1);
	}

	public User updateUser(Integer userid,User users) throws ResourceNotFoundException {
		User user1 = user.findById(userid)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userid));
		user1.setFname(users.getFname());
		user1.setLname(users.getLname());
		user1.setPhoneno(users.getPhoneno());
		//user.setAddress(users.getAddress());
		user1.setDob(users.getDob());
		user1.setAadhar(users.getAadhar());
		final User updateduser =user.save(user1);
		return updateduser;
	}
	

	public List<User> saveAll() {
		// TODO Auto-generated method stub
		return null;
	}


}


