/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import java.sql.Date;

/**
 *
 * @author hp
 */
public class person {
    int id ;
    String name;
    Date birthdate;
    String address;
    String phonenumber;
    String Email;
    String Password;

    public person() {
    }
    public person(String name, Date birthdate, String address, String phonenumber, String Email) {
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.phonenumber = phonenumber;
        this.Email = Email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public boolean login (String id,String pass){
        String q ;
        if(id.charAt(0) == '1'){
            q = "SELECT * FROM manager";
        }else if(id.charAt(0)=='2'){
            q = "SELECT * FROM salesman";
        }else{
            return  false;
        }
        return DBConnection.login(id, pass, q);
    }
    
}
