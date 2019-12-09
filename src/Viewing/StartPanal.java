/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewing;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javax.swing.border.StrokeBorder;

/**
 *
 * @author hp
 */
public class StartPanal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        Label Footer = new Label("Designed by Alito1998");
        Footer.setStyle("-fx-text-fill: blue;");
        Footer.setAlignment(Pos.CENTER);
        root.setBottom(Footer);
        
        GridPane gride = new GridPane();
        gride.setAlignment(Pos.CENTER);
        
        Label header = new Label("Welcome To SSSFA");
        header.setAlignment(Pos.CENTER);
        header.setFont(Font.font("roman", 56));
        header.setPadding(new Insets(150,0,0,0));
        gride.add(header, 0, 0,3,1);
        
        Label header1 = new Label("Inventory System");
        header1.setAlignment(Pos.CENTER);
        header1.setFont(Font.font("roman",FontWeight.EXTRA_BOLD, 36));
        header1.setPadding(new Insets(0,0,0,100));
        gride.add(header1, 0, 1,3,1);
        
        
        
        Button Enter = new Button("Enter");
        Enter.setStyle("-fx-background-color: CYAN; -fx-text-fill: red;-fx-font: 36px ButtonFont;");
        Enter.setAlignment(Pos.CENTER);
        Enter.setTextAlignment(TextAlignment.CENTER);
        Enter.setPrefSize(150, 75);
        Enter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginPanal x = new LoginPanal();
                Stage stage = new Stage();
                x.start(stage);
                stage.show();
                primaryStage.close();
            }
        });
        
        VBox vBox = new VBox(35,gride,Enter);
        vBox.setAlignment(Pos.CENTER);
        
        root.setTop(vBox);
        
        Scene scene = new Scene(root,700,550);
        scene.getStylesheets().add(StartPanal.class.getResource("style.css").toExternalForm());
        primaryStage.setTitle("Inventory System");
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
