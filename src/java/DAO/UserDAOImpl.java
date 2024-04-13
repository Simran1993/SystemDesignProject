/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
package DAO;
=======
package src.java.DAO;
>>>>>>> 6d2f4f8b8f6b17736d9a433cedfe2389a651b742

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utils.DBUtil;
import Bean.Userbean;
import DAO.UserDAO;


/**
 *
 * @author OWNER
 */


public class UserDAOImpl implements UserDAO {

	/*
    registerUser: is for regestering the data into database using user bean class 
    */
        @Override
	public String registerUser(String username,String firstName,String lastName, String password, String userType) {

		Userbean user = new Userbean( username, firstName, lastName,password, userType);

		String status = registerUser(user);

		return status;
	}

	/*
        registerUser: is for checking the user data already existes and use for inserting data into database
        
        */
        @Override
	public String registerUser(Userbean user) {

		String status = "User Registration Failed!";

		boolean isRegtd = isRegistered(user.getUsername());

		if (isRegtd) {
			status = "Username Already Registered!";
			return status;
		}
		Connection conn = DBUtil.provideConnection();
		PreparedStatement ps = null;
		if (conn != null) {
			System.out.println("Connected Successfully!");
		}

		try {

			ps = conn.prepareStatement("INSERT INTO Users (username, firstName, lastName, password, userType) VALUES(?,?,?,?,?) ");

			ps.setString(1, user.getUsername());
			ps.setString(2, user.getFirstName());
                        ps.setString(3, user.getLastName());
                        ps.setString(4, user.getPassword());
			ps.setString(5, user.getUserType());

			int k = ps.executeUpdate();

			if (k > 0) {
				status = "User Registered Successfully!";
				//MailMessage.registrationSuccess(user.getUsername(), user.getUsername().split(" ")[0]);
			}

		} catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}

		DBUtil.closeConnection(ps);
		DBUtil.closeConnection(ps);

		return status;
	}

	/*
        
        */
	public boolean isRegistered(String UserName) {
		boolean flag = false;

		Connection con = DBUtil.provideConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = con.prepareStatement("select * from user where username=?");

			ps.setString(1, UserName);

			rs = ps.executeQuery();

			if (rs.next())
				flag = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		DBUtil.closeConnection(rs);

		return flag;
	}

	/*
        this method is for checking login detail
        */
	public String isValidCredential(String UserName, String password) {
		String status = "Login Denied! Incorrect Username or Password";

		Connection con = DBUtil.provideConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			ps = con.prepareStatement("select * from users where username=? and password=?");

			ps.setString(1, UserName);
			ps.setString(2, password);

			rs = ps.executeQuery();

			if (rs.next())
				status = "valid";

		} catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}

		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		DBUtil.closeConnection(rs);
		return status;
	}

            /*
        for feacting the USer data
        */
	public Userbean getUserDetails(String UserName, String password) {

		Userbean user = null;

		Connection con = DBUtil.provideConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = con.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, UserName);
			ps.setString(2, password);
			rs = ps.executeQuery();

			if (rs.next()) {
				user = new Userbean();
                               user.setUsername(rs.getString("username"));
				user.setUsername(rs.getString("firstName"));
                                user.setUsername(rs.getString("lastName"));
				user.setPassword(rs.getString("password"));
                                user.setUserType(rs.getString("UserType"));

				return user;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		DBUtil.closeConnection(rs);

		return user;
	}

	/*
        GetUser first name
        */
	public String getFName(String UserName) {
		String fname = "";

		Connection con = DBUtil.provideConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = con.prepareStatement("select firstName from user where username=?");
			ps.setString(1, UserName);

			rs = ps.executeQuery();

			if (rs.next()) {
				fname = rs.getString(1);

				fname = fname.split(" ")[0];

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return fname;
	}
        
        public String getUserType(String username) {
        String userType = null;

        Connection con = DBUtil.provideConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

    try {
        ps = con.prepareStatement("SELECT userType FROM Users WHERE username = ?");
        ps.setString(1, username);
        rs = ps.executeQuery();

        if (rs.next()) {
            userType = rs.getString("userType");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        DBUtil.closeConnection(con);
        DBUtil.closeConnection(ps);
        DBUtil.closeConnection(rs);
    }

    return userType;
}

        
	
//	public String getUserAddr(String userId) {
//		String userAddr = "";
//
//		Connection con = DBUtil.provideConnection();
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//
//		try {
//			ps = con.prepareStatement("select address from user where email=?");
//
//			ps.setString(1, userId);
//
//			rs = ps.executeQuery();
//
//			if (rs.next())
//				userAddr = rs.getString(1);
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		return userAddr;
//	}

}

