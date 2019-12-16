/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Manager extends User{

    
    public Manager()
    {
        
    }

    public Manager(int id, String name, Date birthdate, String address, int salary, int bonus, String phonenumber, String Email, String Password, Department department) {
        super( name, birthdate, address, salary, bonus, phonenumber, Email, department);
    }

  

    public void makeOffers(Product p, int offerprecentage )
    {
        String q = new String();
        float np = p.price-(p.price*offerprecentage)/100;
        q = "UPDATE `product` SET`price`="+np+",`discount`="+offerprecentage+" WHERE id="+p.id;
        DBConnection.control(q);
    }
    
    public void addEmp(Salesman s)
    {
        String q= new String();
        q="INSERT INTO `salesman`(`name`, `birthdate`, `address`, `salary`, `bonus`, `phone_number`, `email`, `password`, `rate` ,`department`) VALUES ('"+s.name+"' , "+s.birthdate.toString()+" , '"+s.address+"' , "+s.salary+" , "+s.bonus+" , '"+s.phonenumber+"' , '"+s.Email+"' , '"+s.Password+"' , "+s.rate +" , '"+s.department.toString()+")";
        DBConnection.control(q);
    }
    
    public void deleteEmp(int id)
    {
        String q= new String();
        q="delete from `Salesman` where id= "+id;
        DBConnection.control(q);
    }
    
    public void updateEmp(Salesman s)
    {
        String q = new String();
        q="UPDATE `salesman` SET `name`='"+s.name+"',`birthdate`="+s.birthdate+",`address`='"+s.address+"',`salary`="+s.salary+",`bonus`="+s.bonus+",`phone_number`='"+s.phonenumber+"',`email`='"+s.Email+"',`password`='"+s.Password+"',`rate`="+s.rate+",`department`='"+s.department.toString()+"' WHERE id="+s.id;
        DBConnection.control(q);
    }
    
   public ArrayList<ArrayList<Integer>> recieveReport(Department d,String reportType)
    {
        return d.generate_report(reportType);
        
    }

}
