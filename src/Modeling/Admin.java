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
public class Admin {
    
    int id ;
    String name;
    Date birthdate;
    String address;
    String phonenumber;
    String Email;
    String Password;

    public Admin(int id, String name, Date year_of_birth, String address, String phonenumber, String Email, String Password) {
        this.id = id;
        this.name = name;
        this.birthdate = year_of_birth;
        this.address = address;
        this.phonenumber = phonenumber;
        this.Email = Email;
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    public void add(Object o)
    {
        
    }
    
    public void delete(Object o)
    {
        
    }
    
    public void update(Object o)
    {
        
    }
    
    public void addBonus(Object o)
    {
        
    }
    
    public Report recieveReport(Report r)
    {
        
        return null;
    }

    
}
