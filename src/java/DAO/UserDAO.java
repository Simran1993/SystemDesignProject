/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

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
