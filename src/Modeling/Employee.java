/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 *
 * @author hp
 */
public class Employee extends User{
    int rate;

    public Employee(int rate, int id, String name, int year_of_birth, String address, int salary, int bonus, String phonenumber, String Email, String Password, String department) {
        super(id, name, year_of_birth, address, salary, bonus, phonenumber, Email, Password, department);
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
