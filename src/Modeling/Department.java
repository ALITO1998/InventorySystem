/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Department {
    int id ;
    String name;
    ArrayList<Salesman> employees = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> generate_report(String rtype)
    {
        Report r = new Report();
        if(rtype.equals("Salesman")){
            return r.generatesalesmanreport(employees);
        }else if(rtype.equals("Product")){
            return r.generateproductreport(products);
        }
        return null;
    }
    
}
