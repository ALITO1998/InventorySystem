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
public class ManagerPanal  extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        TabPane tpane = new TabPane();
        HBox hbTopbtns = new HBox(10);
        Tab tWorker = new Tab("Worker");
        Tab tProducte = new Tab("Producte");
        Tab tReport = new Tab("Report");
        Tab tProFile = new Tab("Profile");
        VBox vbWbtn = new VBox(10);
        HBox hbWCTab = new HBox(10);
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
        Button bWorker = new Button("Worker");
        hbTopbtns.getChildren().add(bWorker);
        bWorker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tpane.getTabs().add(tWorker);
                tpane.getSelectionModel().select(tWorker);
            }
        });
        Button bProducte = new Button("Producte");
        hbTopbtns.getChildren().add(bProducte);
        bProducte.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tpane.getTabs().add(tProducte);
                tpane.getSelectionModel().select(tProducte);
            }
        });
        Button bReport = new Button("Report");
        hbTopbtns.getChildren().add(bReport);
        bReport.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tpane.getTabs().add(tReport);
                tpane.getSelectionModel().select(tReport);
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
       //==============WorkerTab====================== 
        TableView TW = new TableView();
        TW.setMinWidth(580);
        TableColumn TCWID = new TableColumn("ID");
        //TCWID.setCellValueFactory(new PropertyValueFactory("id_W"));
        TW.getColumns().add(TCWID);
        TableColumn TCWN = new TableColumn("Name");
       // TCWN.setCellValueFactory(new PropertyValueFactory("name_W"));
        TCWN.setPrefWidth(150);
        TW.getColumns().add(TCWN);
        TableColumn TCWS = new TableColumn("Salary");
        //TCWS.setCellValueFactory(new PropertyValueFactory("salary"));
        TW.getColumns().add(TCWS);
        TableColumn TCWB = new TableColumn("Bonus");
        //TCWYB.setCellValueFactory(new PropertyValueFactory("year_of_birth"));
        TW.getColumns().add(TCWB);
        TableColumn TCWR = new TableColumn("Rate");
        //TCWR.setCellValueFactory(new PropertyValueFactory("rate"));
        TW.getColumns().add(TCWR);
        
        TableColumn TCWDpet = new TableColumn("Department");
        //TCWPHN.setCellValueFactory(new PropertyValueFactory("phonenumber"));
        TCWDpet.setPrefWidth(110);
        TW.getColumns().add(TCWDpet);
        Button ANWbtn = new Button("Add New");
        Button EWbtn = new Button("Edite Selected");
        Button RSWbtn = new Button("Remove Selected");
        vbWbtn.setAlignment(Pos.CENTER);
        vbWbtn.getChildren().addAll(ANWbtn,EWbtn,RSWbtn);
        hbWCTab.getChildren().addAll( TW,vbWbtn);
        tWorker.setContent(hbWCTab);
        //================End WorkerTab===========
        //************************************
        //================ProductTap==========
        TableView TP = new TableView();
        //TP.setMinWidth(580);
        TableColumn TCIDP = new TableColumn("ID");
        TCIDP.setPrefWidth(50);
       // TCIDP.setCellValueFactory(new PropertyValueFactory("id_P"));
        TP.getColumns().add(TCIDP);
        TableColumn TCNP = new TableColumn("Name");
        TCNP.setPrefWidth(145);
       // TCNP.setCellValueFactory(new PropertyValueFactory("name_P"));
        TP.getColumns().add(TCNP);
        TableColumn TCP = new TableColumn("Price");
       // TCP.setCellValueFactory(new PropertyValueFactory("price"));
        TP.getColumns().add(TCP);
        TableColumn TCCP = new TableColumn("Count");
       // TCCP.setCellValueFactory(new PropertyValueFactory("count"));
        TP.getColumns().add(TCCP);
        TableColumn TCEDP = new TableColumn("Expiry Date");
       // TCEDP.setCellValueFactory(new PropertyValueFactory("expiry_date"));
        TP.getColumns().add(TCEDP);
        TableColumn TCDP = new TableColumn("Discount");
       // TCDP.setCellValueFactory(new PropertyValueFactory("discount"));
        TP.getColumns().add(TCDP);
        TableColumn TCDPP = new TableColumn("Department");
       // TCDP.setCellValueFactory(new PropertyValueFactory("department"));
        TP.getColumns().add(TCDPP);
        TableColumn TCNSP = new TableColumn("Number of sales");
        TCNSP.setPrefWidth(110);
       // TCDP.setCellValueFactory(new PropertyValueFactory("Number_of_sales"));
        TP.getColumns().add(TCNSP);
        tProducte.setContent(TP);
        //=============End ProductTab=========== 
        //************************************
        //=============ReportTab============
        Label SDL = new Label("Selecte Department :");
        SDL.setStyle("-fx-font: 36px HeaderFont;-fx-translate-x: -150;");
        vbReport.getChildren().add(SDL);
        ComboBox DCB = new ComboBox();
        DCB.setPrefWidth(300);
        DCB.getSelectionModel().select(0);
        vbReport.getChildren().add(DCB);
        Button grbtn = new Button("Get Report");
        grbtn.setStyle("-fx-font: 20px HeaderFont;");
        vbReport.getChildren().add(grbtn);
        vbReport.setAlignment(Pos.CENTER);
        tReport.setContent(vbReport);
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
        
        /*============Test===============
        Employee W1 = new Employee(2311,"Ali", 1998, 1000, "01120557102", "alialaa144144@gmail.com","Worker");
        TW.getItems().add(W1);
        Product P1 = new Product(1111, "PRODUCT1", 5,5, 2022, 0,"A");
        TP.getItems().add(P1);
        TP.setColumnResizePolicy( TableView.CONSTRAINED_RESIZE_POLICY );
        //===========End Test============*/
        //************************************
        Scene scene = new Scene(root, 700, 550,true);
        scene.getStylesheets().add(StartPanal.class.getResource("style.css").toExternalForm());
        
        primaryStage.setTitle("Inventory System(Manager)");
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
