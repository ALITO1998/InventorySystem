/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.sql.DriverManager;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class LoginPanal extends Application {
    
 
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        Label Footer = new Label("Designed by Alito1998");
        Footer.setStyle("-fx-text-fill: blue;");
        Footer.setAlignment(Pos.CENTER);
        root.setBottom(Footer);
       
        GridPane gride = new GridPane();
        gride.setHgap(10);
        gride.setVgap(10);
        gride.setAlignment(Pos.CENTER);
       // gride.setPadding(new Insets(25,25,25,25));
        gride.setStyle("-fx-border-insets: 190 180 150 170;-fx-border-color: CYAN;-fx-border-width: 5px;-fx-border-style: solid inside;");
        root.setCenter(gride);
        
        Label LLI = new Label("Log In");
        LLI.setStyle("-fx-translate-x: -35;-fx-translate-y: -30;-fx-background-color: CYAN;-fx-text-fill: red;-fx-font: 24px ButtonFont;");
        LLI.setTextAlignment(TextAlignment.CENTER);
        gride.addRow(0, LLI);
        
        Label LUI = new Label("ID :");
        LUI.setTextAlignment(TextAlignment.CENTER);
        LUI.setStyle("-fx-background-color: CYAN;-fx-text-fill: red;-fx-font: 18px ButtonFont;");
        gride.add(LUI, 0, 1);
       
        Label LPW = new Label("Password :");
        LPW.setTextAlignment(TextAlignment.CENTER);
        LPW.setStyle("-fx-background-color: CYAN;-fx-text-fill: red;-fx-font: 18px ButtonFont;");
        gride.add(LPW, 0, 2);
       
        TextField TFUI = new TextField();
        TFUI.setStyle("-fx-text-fill: black;-fx-font: 14px ButtonFont;");
        TFUI.setPromptText("Enter Your ID ");
        gride.add(TFUI, 1, 1);
        
        PasswordField PFPW = new PasswordField();
        PFPW.setStyle("-fx-text-fill: black;-fx-font: 14px ButtonFont;");
        PFPW.setPromptText("Enter Your Password ");
        gride.add(PFPW, 1, 2);
       
        Button BLI = new Button("LOG IN");
        BLI.setStyle("-fx-translate-x: 90;-fx-background-color: CYAN; -fx-text-fill: red;-fx-font: 20px ButtonFont;");
        BLI.setAlignment(Pos.CENTER);
        BLI.setTextAlignment(TextAlignment.CENTER);
        BLI.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String id = TFUI.getText();
                String Pass = PFPW.getText();
                if (id.equals("12345")&&Pass.equals("0123747086")){
                    AdminPanel x = new AdminPanel();
                    Stage stage = new Stage();
                    x.start(stage);
                    stage.show();
                    primaryStage.close();
                }else{
                    SalesmanPanel mp = new SalesmanPanel();
                    Stage stage = new Stage();
                    mp.start(stage);
                    stage.show();
                    primaryStage.close();
                }
              /*  try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull","root","");
                    Statement st = con.createStatement();
                    ResultSet rs= st.executeQuery("SELECT * FROM Inventory");
                    while (rs.next()) {
                        String id = rs.getString("ID");
                        String pass = rs.getString("PassWord");
                        if(id.equals(a)&&pass.equals(b)){
                            AdminPanel x = new AdminPanel();
                            Stage stage = new Stage();
                            x.start(stage);
                            stage.show();
                            primaryStage.close();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Invalide ID or PassWord !", "Invalide", 1);
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error", "Connection error", 0);
                }*/
            }
        });
                
           
        gride.addRow(3, BLI);
        
        Scene scene = new Scene(root,700,550);
        scene.getStylesheets().add(StartPanal.class.getResource("style.css").toExternalForm());
        primaryStage.setTitle("Inventory System(LogIn)");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
