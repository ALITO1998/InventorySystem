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
public class Manager extends User{

    public Manager(int id, String name, int year_of_birth, String address, int salary, int bonus, String phonenumber, String Email, String Password, String department) {
        super(id, name, year_of_birth, address, salary, bonus, phonenumber, Email, Password, department);
    }

    public void makeOffers(Product p)
    {
        
    }
    
    public void addEmp(Employee e)
    {
        
    }
    
    public void deleteEmp(Employee e)
    {
        
    }
    
    public void updateEmp(Employee e)
    {
        
    }
    
    public Report recieveReport(Report r)
    {
        
        return null;
    }
    
}
