/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewing;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class BarChartSample {
    ArrayList<Integer> Ids = new ArrayList<>();
    ArrayList<Integer> Rates = new ArrayList<>();
    String title;
    String Xtitle;
    String Ytitle;
    Scene scene;
    

    public BarChartSample(ArrayList<Integer> Is ,ArrayList<Integer> Ss,String title, String Xtitle, String Ytitle) {
        this.Ids = Ss;
        this.title = title;
        this.Xtitle = Xtitle;
        this.Ytitle = Ytitle;
        this.Rates = Is;
    }
    
    
    public BarChart start() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle(title);
        xAxis.setLabel(Xtitle);       
        yAxis.setLabel(Ytitle);
 
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Alis");
        for(int i = 0; i<Ids.size();i++){
            series1.getData().add(new XYChart.Data(Ids.get(i),Rates.get(i)));
        }
        bc.getData().add(series1);
        return bc;
    }
 
    public static void main(String[] args) {
        
    }
}