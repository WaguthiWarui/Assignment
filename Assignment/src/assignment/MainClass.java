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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) {
        //LABELS
        Text welcome_label = new Text("MAJALIWA BUS SERVICES");
        
        //BUTTONS
        Button admin1_button = new Button("Admin");
        Button user1_button = new Button("User");
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(welcome_label,1,1);
        gridPane.add(admin1_button,1,2);
        gridPane.add(user1_button,2,2);
        
        gridPane.setMinSize(600,300);
        gridPane.setVgap(10);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);
        
        //EVENT HANDLER FOR ADMIN BUTTON 
        admin1_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) {
        Admin1 hp = new Admin1();
            //opening a new window
            hp.start(hp.HP_Stage);
         
         } 
      })); 
          //EVENT HANDLER FOR USER BUTTON 
        user1_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
        public void handle(MouseEvent event) {
        User1 hp = new User1();
        Stage stage = (Stage) user1_button.getScene().getWindow();            
                stage.show();
        
            //opening a new window
            hp.start(hp.HP_Stage);
        
         
         } 
      })); 
        
         primaryStage.setTitle(" Window");
        
        Scene my_scene = new Scene(gridPane);
        
        primaryStage.setScene(my_scene);
        
        primaryStage.show();
         
}
}










