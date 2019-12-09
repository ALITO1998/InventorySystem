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
    public BarChart generateBarChartSample (ArrayList<Object> o){
        Ss = new ArrayList<>();
        Is = new ArrayList<>();
        if (o.get(0) instanceof Employee){
            title = "Report of Employee";
            Xtitle = "IDs of Employee";
            Ytitle = "Rate of Employees";
            for (int i = 0; i < o.size(); i++) {
                Ss.add(i, ((Employee)o.get(i)).id);
                Is.add(i, ((Employee)o.get(i)).rate);
            }
        }else{
            title = "Report of Product";
            Xtitle = "IDs of Product";
            Ytitle = "Number of sales of Products";
            for (int i = 0; i < o.size(); i++) {
                Ss.add(i, ((Product)o.get(i)).id);
                Is.add(i, ((Product)o.get(i)).Number_of_sales);
            }
        }
        BarChartSample bcs = new BarChartSample(Is, Ss, title, Xtitle, Ytitle);
        return bcs.start();
        
    } 
}
