package com.fram.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fram.models.User;
import com.fram.utils.MyBatisConfig;

public class UserDaoImpl implements IUserDao {

	@Override
	public User createUSer(User user) {
		 SqlSession session = MyBatisConfig.getSessionFactory().openSession();
			try {
				session.insert("userMapper.createUser", user);
				session.commit();
				session.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return user;
	}

	public List<User> getAllUsers() {
		 SqlSession session = MyBatisConfig.getSessionFactory().openSession();
		List<User> users = null;
		try {
			users= session.selectList("userMapper.getAllUsers");
			session.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("The users: " + users);
		
		return users;
	}

	@Override
	public User getUserDetails(String employeeId) {
		User user = null;
		 SqlSession session = MyBatisConfig.getSessionFactory().openSession();
			try {
				user = session.selectOne("userMapper.getUserByd", employeeId);
				session.commit();
				session.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return user;
	}
	

}
