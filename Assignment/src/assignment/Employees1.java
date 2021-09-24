/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Employees1 extends Application {
   Stage HP_Stage = new Stage();  
    @Override
    public void start(Stage primaryStage) {
        //LABELS
        Text name_label = new Text("Username");
        Text pass_label = new Text("Password");
        Text ID_label = new Text("ID Number");
        Text phone_label = new Text("Phone Number");
        
        
        //TEXT FIELD
        TextField uname_tf = new TextField();
        TextField ID_tf = new TextField();
        TextField phone_tf = new TextField();
        
        //PASSWORD FIELD
        PasswordField pass_field = new PasswordField();
        
        //BUTTONS
        Button login_btn = new Button("Login");
        
        
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(name_label,1,1);
        gridPane.add(pass_label,1,2);
        gridPane.add(uname_tf,2,1);
        gridPane.add(pass_field,2,2);
        gridPane.add(login_btn,1,3);
        
        
        gridPane.setMinSize(600,300);
        
        gridPane.setVgap(10);
        
        gridPane.setHgap(20);
        
        gridPane.setAlignment(Pos.CENTER);
        
        //EVENT HANDLER FOR LOGIN BUTTON WITH LOGIN CREDENTIALS
        login_btn.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) {
             
        //Assume that the username & password are User and 23456 respectively
        String username = uname_tf.getText();
        String password = pass_field.getText();
        
        HomePage_Admin hp = new HomePage_Admin();
        
        if(username.equals("Employee") && password.equals("23456"))
        {
            //opening a new window
            hp.start(hp.HP_Stage);
        }
        else
        {
            // AN ALERT
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Wrong User Name or Password");
            a.show();   
        }
         
         } 
      })); 
         
}
}







