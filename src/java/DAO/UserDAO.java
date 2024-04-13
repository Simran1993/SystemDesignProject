/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD
package DAO;
=======
package src.java.DAO;
>>>>>>> 6d2f4f8b8f6b17736d9a433cedfe2389a651b742

import Bean.Userbean;

/**
 *
 * @author OWNER
 */
public interface UserDAO {
    
    public String registerUser(String username,String firstName,String lastName, String password, String userType);
    
    public String registerUser(Userbean user);
    
    public boolean isRegistered(String UserName);
    
    public String isValidCredential(String UserName, String password);
    
    public Userbean getUserDetails(String UserName, String password);
    
    public String getFName(String UserName);
    
    public String getUserType(String username);
    
    
}
