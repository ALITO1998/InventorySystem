/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import java.sql.Date;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Salesman extends User{
    int rate;

    public Salesman(){}
    public Salesman(int rate, int id, String name, Date birthdate, String address, int salary, int bonus, String phonenumber, String Email, String Password, Department department) {
        super(name, birthdate, address, salary, bonus, phonenumber, Email,department);
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public void sell (Product p,int count){
        String q = new String();
        int nc = p.count-count;
        if(nc<0){
             JOptionPane.showMessageDialog(null, "Error", "أنا مش مش عاوز أديك أنا مش قادر أديك", 1);
        }else{
        q = "UPDATE `product` SET `count`="+nc+"WHERE id="+p.id;
        DBConnection.control(q);
        }
    }
}
