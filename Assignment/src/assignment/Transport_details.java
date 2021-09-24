/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Transport_details extends Application{
    Stage HP_Stage = new Stage();  
    
    @Override
    public void start(Stage primaryStage) {
        //LABELS
        Text name_label = new Text("Number Plate");
        Text driver_label = new Text("Driver Name");
        Text vehicle_label = new Text("Vehicle Number");
        Text phone_label = new Text("Phone Number");
        
        
        //TEXT FIELD
        TextField name_tf = new TextField();
        TextField driver_tf = new TextField();
        TextField vehicle_tf = new TextField();
        TextField phone_tf = new TextField();
        
        //PASSWORD FIELD
        PasswordField pass_field = new PasswordField();
        
        //BUTTONS
        Button save_btn = new Button("Save");
        Button transport_btn=new Button("Transport Details");
        
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(name_label,1,1);
        gridPane.add(driver_label,1,2);
        gridPane.add(vehicle_label,1,2);
        gridPane.add(phone_label,1,2);
        
        gridPane.add(name_tf,2,1);
        gridPane.add(driver_tf,2,1);
        gridPane.add(vehicle_tf,3,1);
        gridPane.add(phone_tf,4,1);
        
         
        gridPane.add(pass_field,2,2);
        gridPane.add(save_btn,1,3);
        gridPane.add(transport_btn,1,4);
        
        gridPane.setMinSize(600,300);
        
        gridPane.setVgap(10);
        
        gridPane.setHgap(20);
        
        gridPane.setAlignment(Pos.CENTER);
        
        //EVENT HANDLER FOR SIGNUP BUTTON 
        transport_btn.setOnMouseClicked((new EventHandler<MouseEvent>() { 
        public void handle(MouseEvent event) {
        connect_transport hp = new connect_transport ();
        Stage stage = (Stage) transport_btn.getScene().getWindow();            
                stage.show();
        
            //opening a new window
            hp.start(hp.HP_Stage);
        
            }
        }));
        
        primaryStage.setTitle("Transport Details  Window");
        Scene scene=new Scene (gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        }
    


        
    
    
        
         
                
  
                     





