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
public class Admin extends person{


    
    public void add(Object o)
    {
        String q ;
        if(o instanceof Manager)
        {
            Manager m = new Manager();
            m = (Manager)o;
            q="INSERT INTO `manager`(`name`, `birthdate`, `address`, `salary`, `bonus`, `phone_number`, `email`, `password`, `department`) VALUES ('"+m.name+"' , "+m.birthdate.toString()+" , '"+m.address+"' , "+m.salary+" , "+m.bonus+" , '"+m.phonenumber+"' , '"+m.Email+"' , '"+m.Password+"' , '"+m.department.toString()+")";
        }
        else if(o instanceof Salesman)
        {
            Salesman s = new Salesman();
            s= (Salesman)o ;
            q="INSERT INTO `salesman`(`name`, `birthdate`, `address`, `salary`, `bonus`, `phone_number`, `email`, `password`, `rate` ,`department`) VALUES ('"+s.name+"' , "+s.birthdate.toString()+" , '"+s.address+"' , "+s.salary+" , "+s.bonus+" , '"+s.phonenumber+"' , '"+s.Email+"' , '"+s.Password+"' , "+s.rate +" , '"+s.department.toString()+")";
        }
        else
        {
            Product p = new Product();
            p = (Product) o;
            q = "INSERT INTO `product`(`name`, `price`, `expiry_date`, `discount`, `department`, `count`, `expiry`, `Number_of_sales`) VALUES ('"+p.name+"',"+p.expiry_date.toString()+","+p.discount+","+p.department.toString()+","+p.count+","+p.expiry+","+p.Number_of_sales+")";
        }
        DBConnection.control(q);
    }
    
    public void delete(int id,String objecttype)
    {
        String q = new String();
        if(objecttype.equals("Manager"))
        {
            q="delete from `Manager` where id= "+id;
        }
        else if(objecttype.equals("Salesman"))
        {
            q="delete from `Salesman` where id= "+id;
        }
        else if(objecttype.equals("Product"))
        {
            q="delete from `Product` where id= "+id;
        }
        DBConnection.control(q);
    }
    
    public void update(Object o)
    {
        String q ;
        if(o instanceof Manager)
        {
            Manager m = new Manager();
            m = (Manager)o;
            q="UPDATE `manager` SET `name`='"+m.name+"',`birthdate`="+m.birthdate+",`address`='"+m.address+"',`salary`="+m.salary+",`bonus`="+m.bonus+",`phone_number`='"+m.phonenumber+"',`email`='"+m.Email+"',`password`='"+m.Password+",`department`='"+m.department.toString()+"' WHERE id="+m.id;
        }
        else if(o instanceof Salesman)
        {
            Salesman s = new Salesman();
            s= (Salesman)o ;
            q="UPDATE `salesman` SET `name`='"+s.name+"',`birthdate`="+s.birthdate+",`address`='"+s.address+"',`salary`="+s.salary+",`bonus`="+s.bonus+",`phone_number`='"+s.phonenumber+"',`email`='"+s.Email+"',`password`='"+s.Password+"',`rate`="+s.rate+",`department`='"+s.department.toString()+"' WHERE id="+s.id;
        }
        else
        {
            Product p = new Product();
            p = (Product) o;
            q = "UPDATE `product` SET `name`='"+p.name+"',`price`="+p.price+",`expiry_date`="+p.expiry_date.toString()+",`discount`="+p.discount+",`department`="+p.department.toString()+",`count`="+p.count+",`expiry`="+p.expiry+",`Number_of_sales`="+p.Number_of_sales+" WHERE id="+p.id;
        }
        DBConnection.control(q);
    }
    
    public void addBonus(int id,int bonus)
    {
        String q;
        q="UPDATE `manager` SET `bonus`="+bonus+"Where id="+id;
        DBConnection.control(q);
    }
    
    public ArrayList<ArrayList<Integer>> recieveReport(Department d,String reportType)
    {
        return d.generate_report(reportType);
        
    }

    
}
