/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Final.DAO;

/**
 *
 * @author OWNER
 */
public class UserDAO {
    
    private String Username;
    private String Useremail;
    private String Userpassword;

    public UserDAO(String Username, String Useremail, String Userpassword) {
        this.Username = Username;
        this.Useremail = Useremail;
        this.Userpassword = Userpassword;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getUseremail() {
        return Useremail;
    }

    public void setUseremail(String Useremail) {
        this.Useremail = Useremail;
    }

    public String getUserpassword() {
        return Userpassword;
    }

    public void setUserpassword(String Userpassword) {
        this.Userpassword = Userpassword;
    }
    
}
