/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

/**
 *
 * @author hp
 */
public class User {
    int id ;
    String name;
    int year_of_birth;
    String address;
    int salary;
    int bonus;
    String phonenumber;
    String Email;
    String Password;
    String department;

    public User(int id, String name, int year_of_birth, String address, int salary, int bonus, String phonenumber, String Email, String Password, String department) {
        this.id = id;
        this.name = name;
        this.year_of_birth = year_of_birth;
        this.address = address;
        this.salary = salary;
        this.bonus = bonus;
        this.phonenumber = phonenumber;
        this.Email = Email;
        this.Password = Password;
        this.department = department;
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

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}

   
    
    
    

