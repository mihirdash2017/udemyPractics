package com.example.UserRestService.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.UserRestService.model.User;

@Component
public class UserDao {
	private static List<User> userList=new ArrayList();
	private static int userCount=3;
	
	static{
			userList.add(new User(1,"Mihir", 29, 6000));
			userList.add(new User(2,"Malay", 26, 8000));
			userList.add(new User(3,"Pralay", 23, 10000));
			
	}
	//find all user
	public List<User>findAll(){
		return userList;
		
	}
	//save user
	public User saveUser(User user){
		if(user.getId()==0){
			user.setId(++userCount);
		}
		userList.add(user);
		return user;
		
	}
	public User findUser(int id){
		for (User user : userList) {
			if(user.getId()==id){
				return user;
			}
		}
		return null;
	}
	

}
