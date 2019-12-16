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
public class Product {
    int id ;
    String name;
    float price;
    int count;
    int expiry;
    Date expiry_date ;
    int discount;
    String department;
    int Number_of_sales;
    public Product(){}

    public Product(String name_P, float price, int count, Date expiry_date, String department, int expiry, int Number_of_sales) {
        this.name = name_P;
        this.price = price;
        this.count = count;
        this.expiry = expiry;
        this.Number_of_sales = Number_of_sales;
        this.expiry_date = expiry_date;
        this.discount = 0;
        this.department = department;
        this.Number_of_sales = 0;
    }

    public int getNumber_of_sales() {
        return Number_of_sales;
    }

    public void setNumber_of_sales(int Number_of_sales) {
        this.Number_of_sales = Number_of_sales;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
    
}
