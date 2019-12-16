/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewing;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class SalesmanPanel  extends Application {
    
 
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        TabPane tpane = new TabPane();
        HBox hbTopbtns = new HBox(10);
        Tab tsell = new Tab("Sell");
        Tab tProFile = new Tab("Profile");
        VBox vbWbtn = new VBox(10);
        
        VBox vbPbtn = new VBox(10);
        HBox hbPCTab = new HBox(10);
        VBox vbPFC =new VBox(10);
        ScrollPane spPFC = new ScrollPane();
        VBox vbReport = new VBox(15);
        
        //============Footer==============
        Label Footer = new Label("Designed by Alito1998");
        Footer.setStyle("-fx-text-fill: blue;");
        Footer.setAlignment(Pos.CENTER);
        root.setBottom(Footer);
        //==========EndFooter=============
        //************************************
        //===========HBox Of Main Buttons========
        root.setTop(hbTopbtns);
        hbTopbtns.setPadding(new Insets(5, 5, 5, 5));
        hbTopbtns.setPrefWidth(700);
        hbTopbtns.setAlignment(Pos.CENTER);
        Button bsell = new Button("Sell");
        hbTopbtns.getChildren().add(bsell);
        bsell.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tpane.getTabs().add(tsell);
                tpane.getSelectionModel().select(tsell);
            }
        });
        Button bProfile = new Button("Profile");
        hbTopbtns.getChildren().add(bProfile);
        bProfile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tpane.getTabs().add(tProFile);
                tpane.getSelectionModel().select(tProFile);
            }
        });
        Button bLogout = new Button();
        bLogout.setAlignment(Pos.BASELINE_LEFT);
        bLogout.getStyleClass().add("icon-logout");
        Tooltip tooltip = new Tooltip("LogOut");
        hbTopbtns.getChildren().add(bLogout);
        bLogout.setTooltip(tooltip);
        bLogout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginPanal x = new LoginPanal();
                Stage stage = new Stage();
                x.start(stage);
                stage.show();
                primaryStage.close();
            }
        });
       //=============End HBox Of Main Buttons================
       //************************************
       //===============Tabs================
        tpane.setStyle("-fx-border-style: solid inside;");
        root.setCenter(tpane);
        //=============End ProductTab=========== 
        //************************************
        //=============ReportTab============
        
        Label header = new Label("Selling");
        header.setStyle("-fx-font: 20px ButtonFont;");
        
        HBox HBinput = new HBox(10);
        HBinput.setAlignment(Pos.CENTER);
        
        ComboBox CBsell = new ComboBox();
        CBsell.getSelectionModel().select(0);
        HBinput.getChildren().add(CBsell);
        
        Spinner count = new Spinner();
        count.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999,Integer.parseInt("0")));
        count.setEditable(true);
       /* EventHandler<KeyEvent> enterKeyEventHandler;

    enterKeyEventHandler = new EventHandler<KeyEvent>() {

        @Override
        public void handle(KeyEvent event) {

            // handle users "enter key event"
            if (event.getCode() == KeyCode.ENTER) {

                try {
    // yes, using exception for control is a bad solution ;-)
            Integer.parseInt(spinner.getEditor().textProperty().get());
                }
                catch (NumberFormatException e) {

                    // show message to user: "only numbers allowed"

                    // reset editor to INITAL_VALUE
                    spinner.getEditor().textProperty().set(INITAL_VALUE);
                }
            }
        }
    };

    // note: use KeyEvent.KEY_PRESSED, because KeyEvent.KEY_TYPED is to late, spinners
    // SpinnerValueFactory reached new value before key released an SpinnerValueFactory will
    // throw an exception
    spinner.getEditor().addEventHandler(KeyEvent.KEY_PRESSED, enterKeyEventHandler);
        */HBinput.getChildren().add(count);
        
        VBox VBsell = new VBox(10);
        VBsell.setAlignment(Pos.CENTER);
        
        Button sell = new Button("Sell");
        sell.setStyle("-fx-font: 20px ButtonFont;");
        sell.setAlignment(Pos.CENTER);
        sell.setTextAlignment(TextAlignment.CENTER);
        sell.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            }
        });
        
        VBsell.getChildren().addAll(header, HBinput,sell);
        
        tsell.setContent(VBsell);
        //============End ReportTab===========
        //************************************
        //==============ProfileTab===========
        GridPane gridPF = new GridPane();
        Label Header = new Label("My Profile");
        Header.setStyle("-fx-font: 36px HeaderFont;-fx-translate-x: 235;");
        Header.setTextAlignment(TextAlignment.CENTER);
        Label mynameL = new Label("My Name :");
        gridPF.add(mynameL, 0, 1);
        TextField mynameTF = new TextField();
        mynameTF.setEditable(false);
        gridPF.add(mynameTF, 0, 2);
        Button ChangeNamebtn = new Button();
        ChangeNamebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mynameTF.setEditable(true);
            }
        });
        ChangeNamebtn.getStyleClass().add("icon-button");
        gridPF.add(ChangeNamebtn, 1, 2);
        Label myidL = new Label("My ID :");
        gridPF.add(myidL, 0, 3);
        TextField myidTF = new TextField();
        myidTF.setEditable(false);
        gridPF.add(myidTF, 0, 4);
        Label myemailL = new Label("My Email :");
        gridPF.add(myemailL, 0, 5);
        TextField myemailTF = new TextField();
        myemailTF.setEditable(false);
        gridPF.add(myemailTF, 0, 6);
        Button ChangeEmailbtn = new Button();
        ChangeEmailbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myemailTF.setEditable(true);
            }
        });
        ChangeEmailbtn.getStyleClass().add("icon-button");
        gridPF.add(ChangeEmailbtn, 1, 6);
        Label mypasswordL = new Label("My Password :");
        gridPF.add(mypasswordL, 0, 7);
        TextField mypasswordTF = new PasswordField();
        mypasswordTF.setEditable(false);
        gridPF.add(mypasswordTF, 0, 8);
        Button ChangePasswordbtn = new Button();
        ChangePasswordbtn.setOnAction(new  EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label newpasswordL = new Label("Enter Currant Password :");
                newpasswordL.setStyle("-fx-translate-x: 10;");
                gridPF.add(newpasswordL, 2, 7);
                TextField newpasswordTF = new PasswordField();
                newpasswordTF.setStyle("-fx-translate-x: 10;");
                gridPF.add(newpasswordTF, 2, 8);
                Button EditePasswordbtn = new Button("check");
                EditePasswordbtn.setStyle("-fx-translate-x: 15;");
                EditePasswordbtn.setOnAction(new  EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        newpasswordL.setVisible(false);
                        newpasswordTF.setVisible(false);
                        EditePasswordbtn.setVisible(false);
                        mypasswordTF.setEditable(true);
                    }
                });
                gridPF.add(EditePasswordbtn, 3, 8);
                }
            });
        ChangePasswordbtn.getStyleClass().add("icon-button");
        gridPF.add(ChangePasswordbtn, 1, 8);
        Label myphonenumL = new Label("My Phone Num :");
        gridPF.add(myphonenumL, 0, 9);
        TextField myphonenumTF = new TextField();
        myphonenumTF.setEditable(false);
        gridPF.add(myphonenumTF, 0, 10);
        Button ChangePhoneNumbtn = new Button();
        ChangePhoneNumbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myphonenumTF.setEditable(true);
            }
        });
        ChangePhoneNumbtn.getStyleClass().add("icon-button");
        gridPF.add(ChangePhoneNumbtn, 1, 10);
        Label mybirthdate = new Label("My BirthDate :");
        gridPF.add(mybirthdate, 0, 11);
        DatePicker birthdatedP = new DatePicker();
        birthdatedP.setEditable(false);
        gridPF.add(birthdatedP, 0, 12);
        Button Changebirthdatebtn = new Button();
        Changebirthdatebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                birthdatedP.setEditable(true);
            }
        });
        Changebirthdatebtn.getStyleClass().add("icon-button");
        gridPF.add(Changebirthdatebtn, 1, 12);
        Label myadressL = new Label("My Adress :");
        gridPF.add(myadressL, 0, 13);
        TextArea myadressTF = new TextArea();
        myadressTF.setEditable(false);
        myadressTF.setPrefWidth(300);
        gridPF.add(myadressTF, 0, 14);
        Button ChangeAdressbtn = new Button();
        ChangeAdressbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myadressTF.setEditable(true);
            }
        });
        ChangeAdressbtn.getStyleClass().add("icon-button");
        gridPF.add(ChangeAdressbtn, 1, 14);
        Button savebtn = new Button("Save Changes");
        savebtn.setPrefSize(644, 25);
        savebtn.setStyle("-fx-font: 15px HeaderFont;-fx-padding: 0 50 0 50");
        vbPFC.getChildren().addAll(Header,gridPF,savebtn);
        vbPFC.setStyle("-fx-translate-x: 5;");
        vbPFC.setPadding(new Insets(10, 25, 10, 25));
        spPFC.setContent(vbPFC);
        tProFile.setContent(spPFC); 
        
        
        //=============End ProfileTab=========
        //************************************
        //=============End Tabs================
        
        
        
        
        Scene scene = new Scene(root,700,550);
        scene.getStylesheets().add(StartPanal.class.getResource("style.css").toExternalForm());
        primaryStage.setTitle("Inventory System(Salesman)");
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
