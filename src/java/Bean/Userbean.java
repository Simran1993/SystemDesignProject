/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.java.Bean;

import java.io.Serializable;

/**
 *
 * @author OWNER
 */
@SuppressWarnings("serial")
public class Userbean implements Serializable{
    private int UserId;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String userType;
    
    public Userbean(){
        
    }

    public Userbean( String username,String firstName,String lastName,String password, String userType) {
        super();
        this.username =username;
        this.firstName=firstName;
        this.lastName=lastName;
        this.password = password;
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    

    // Getters and setters for each field

    public int getId() {
        return UserId;
    }

    public void setId(int id) {
        this.UserId = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
