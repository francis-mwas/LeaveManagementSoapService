package com.fram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.fram.BusinessException;
import com.fram.BusinessFaultType;
import com.fram.GetUserDetailsRequest;
import com.fram.GetUserDetailsResponse;
import com.fram.IUserService;
import com.fram.ObjectFactory;
import com.fram.UserRequestType;
import com.fram.UserResponseType;
import com.fram.UserService;
import com.fram.UserType;
import com.fram.UsersListResponseType;
import com.fram.UsersListType;
import com.fram.dao.IUserDao;
import com.fram.models.User;


public class UserServiceImpl extends SpringBeanAutowiringSupport  implements IUserService {
	
	private UserService userService;
	
	@Autowired
	IUserDao dao;
	
	public UserResponseType registerUser(UserRequestType parameters) throws BusinessException {
		// create object of responseType and set values & return
		
		ObjectFactory factory = new ObjectFactory();
		UserResponseType UserResType = new UserResponseType();
		
		
		try {

//			setting the local variables
			int emp_id = 0;
			UserResType.setEmail(parameters.getUserType().getEmail());
			UserResType.setFirstName(parameters.getUserType().getFirstName());
			UserResType.setTitle(parameters.getUserType().getTitle());
			UserResType.setLastName(parameters.getUserType().getLastName());
			UserResType.setEmployeeId(parameters.getUserType().getEmployeeId());
			UserResType.setStation(parameters.getUserType().getStation());
			UserResType.setDepartment(parameters.getUserType().getDepartment());
			
		
//			Local variables for constructing the user 
			String firstName = UserResType.getFirstName();
			String lastName = UserResType.getLastName();
			String title = UserResType.getTitle();
			String email = UserResType.getEmail();
			String employeeId = UserResType.getEmployeeId();
			String department = UserResType.getDepartment();
			String station = UserResType.getStation();
			
			User users = dao.createUSer(new User(emp_id,firstName,lastName,title,email,employeeId,department,station));
			
		} catch (Exception e) {
			BusinessFaultType businessFaultType = null;
            businessFaultType = new BusinessFaultType();
            businessFaultType.setErrorCode(500);
            businessFaultType.setErrorMessage("An error occur while invoking user web service " + e.getMessage());
            businessFaultType.setErrorDescription(e.getStackTrace().toString());
		}
		
		return  UserResType;
	}

	
//	get the list of users
	@Override
	public UsersListResponseType getAllUsers() {
		List<User> getUsers = null;
		UsersListResponseType usersList = new UsersListResponseType();
		UsersListType userListType = new UsersListType();
		UserType userType = null;
		
		getUsers = dao.getAllUsers();
		
		for(User users:getUsers) {
			userType = new UserType();
			userType.setFirstName(users.getFirstName());
			userType.setLastName(users.getLastName());
			userType.setEmail(users.getEmail());
			userType.setTitle(users.getTitle());
			userType.setEmployeeId(users.getEmployeeId());
			userType.setDepartment(users.getDepartment());
			userType.setStation(users.getStation());
			
			userListType.getUserType().add(userType);
		}
		
		usersList.setUsersListType(userListType);
		
		return usersList;
	}
	
//	get user by employeeId

	@Override
	public GetUserDetailsResponse getUserDetails(GetUserDetailsRequest parameters) {
		User userDetails = null;
		UserType userType = new UserType();
		GetUserDetailsResponse getUserDetailsResponse = new GetUserDetailsResponse();
	
		userDetails = dao.getUserDetails(parameters.getEmployeeId()); 
	    userType.setFirstName(userDetails.getFirstName());
	    userType.setLastName(userDetails.getLastName());
	    userType.setEmail(userDetails.getEmail());
	    userType.setTitle(userDetails.getTitle());
	    userType.setEmployeeId(userDetails.getEmployeeId());
	    userType.setDepartment(userDetails.getDepartment());
	    userType.setStation(userDetails.getStation());
	    
	    getUserDetailsResponse.setUserType(userType);
	    
		return getUserDetailsResponse;
	}
 
}
