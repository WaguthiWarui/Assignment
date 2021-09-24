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
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Register1 extends Application  {
    Stage HP_Stage = new Stage();


    @Override
    public void start(Stage primaryStage) {
        //LABELS
        Text name_label = new Text("Username");
        Text email_label = new Text("Email Address");
        Text number_label = new Text("Phone Number");
        Text password_label = new Text("New Password");
        Text pass_label = new Text("Confirm Password");
        
        //FIELDS
        TextField uname_tf = new TextField();
        TextField email_tf = new TextField();
        TextField num_tf = new TextField();
        PasswordField password_tf = new PasswordField();
        PasswordField pass_tf = new PasswordField();
        
        //BUTTON
        Button signup_btn = new Button("Sign up");
        
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(name_label,1,1);
        gridPane.add(email_label,1,2);
        gridPane.add(number_label,1,3);
        gridPane.add(password_label,1,4);
        gridPane.add(pass_label,1,5);
        gridPane.add(uname_tf,2,1);
        gridPane.add(email_tf,2,2);
        gridPane.add(num_tf,2,3);
        gridPane.add(password_tf,2,4);
        gridPane.add(pass_tf,2,5);
        gridPane.add(signup_btn,1,6);
        
        gridPane.setMinSize(1000,600);
        
        gridPane.setVgap(30);
        
        gridPane.setHgap(50);
        
        gridPane.setAlignment(Pos.CENTER);
        
        //EVENT HANDLER FOR SIGNUP BUTTON 
        signup_btn.setOnMouseClicked((new EventHandler<MouseEvent>() { 
        public void handle(MouseEvent event) {
        UserHomePage_1 hp = new UserHomePage_1 ();
        Stage stage = (Stage) signup_btn.getScene().getWindow();            
                stage.show();
        
            //opening a new window
            hp.start(hp.HP_Stage);
        
         
         } 
      })); 
        
        //SCENE
        primaryStage.setTitle("Registration Window");
        
        Scene my_scene = new Scene(gridPane);
        
        primaryStage.setScene(my_scene);
        
        primaryStage.show();
        
}
}










