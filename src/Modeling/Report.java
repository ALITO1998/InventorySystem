/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import Viewing.BarChartSample;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class Report {
    int id ;
    ArrayList<Integer> Ss ;
    ArrayList<Integer> Is ;
    String title = new String();
    String Xtitle = new String();
    String Ytitle = new String();
    public ArrayList<ArrayList<Integer>> generatesalesmanreport (ArrayList<Salesman> o){
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        Ss = new ArrayList<>();
        Is = new ArrayList<>();
        title = "Report of Employee";
        Xtitle = "IDs of Employee";
        Ytitle = "Rate of Employees";
        for (int i = 0; i < o.size(); i++) {
            Ss.add(i, ((Salesman)o.get(i)).id);
            Is.add(i, ((Salesman)o.get(i)).rate);
        }
        al.add(Ss);
        al.add(Is);
        return al;
    }

    public ArrayList<ArrayList<Integer>> generateproductreport (ArrayList<Product> o){
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        Ss = new ArrayList<>();
        Is = new ArrayList<>();
        title = "Report of Product";
        Xtitle = "IDs of Product";
        Ytitle = "Number of sales of Products";
        for (int i = 0; i < o.size(); i++) {
            Ss.add(i, ((Product)o.get(i)).id);
            Is.add(i, ((Product)o.get(i)).Number_of_sales);
            }
        al.add(Ss);
        al.add(Is);
        return al;
    }
}
