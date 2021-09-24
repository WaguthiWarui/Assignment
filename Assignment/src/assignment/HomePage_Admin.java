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

/**
 *
 * @author ADM
 */
public class HomePage_Admin extends Application {
    Stage HP_Stage = new Stage();
    @Override
    public void start(Stage primaryStage) {
       //LABELS
        Text welcome_label = new Text("MAJALIWA BUS SERVICES");
        
        //BUTTONS
        Button employee_button = new Button("Employee Details");
        Button record_button  = new Button("Transport Records");
        
        
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(welcome_label,0,0);
        gridPane.add(record_button,0,1);
        gridPane.add(employee_button,2,1);
        
        gridPane.setMinSize(500,250);        
        gridPane.setVgap(10);        
        gridPane.setHgap(20);        
        gridPane.setAlignment(Pos.CENTER);
        
        //EVENT HANDLER FOR THE EMPLOYEE DETAILS BUTTON 

        employee_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
        public void handle(MouseEvent event) {
        Connect1 hp=new Connect1();
        Stage stage = (Stage) employee_button.getScene().getWindow();            
                stage.show();
         //opening a new window
             hp.start(hp.HP_Stage);
        }
        }));
        
        //EVENT HANDLER FOR THE TRANSPORT RECORDS
        record_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
        public void handle(MouseEvent event) {
        Transport_details hp=new Transport_details();
        
        Stage stage = (Stage) record_button.getScene().getWindow();            
                stage.show();
        
            //opening a new window
            hp.start(hp.HP_Stage);
        }
        }));
        
        //SCENE
        Scene my_scene = new Scene(gridPane);
        
        
        //STAGE
        primaryStage.setScene(my_scene);
        primaryStage.setTitle("Welcome To Our Bus Services");
        primaryStage.show();


}
}









