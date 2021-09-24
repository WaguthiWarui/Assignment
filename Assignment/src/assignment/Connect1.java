/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Connect1 extends Application {
   
    Stage HP_Stage = new Stage();
    @Override
    public void start(Stage primaryStage) {
        Text name=new Text("Name");
        TextField tf=new TextField();
        Text txt=new Text();
        
        Text number=new Text("Phone Number");
        TextField tf2=new TextField();
        Text txt2=new Text();
        
        Text ID=new Text("ID_Number");
        TextField tf3=new TextField();
        Text txt3=new Text();
        
        Button btn= new Button("Save");
        ComboBox job = new ComboBox();
        job.getItems().addAll("Conductor", "Driver");
        
       //Eventhandling for the save button
         btn.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) {    
             
               final String name = tf.getText();
                String job_option = (String)job.getValue();
                String number= tf2.getText(); 
              final String ID= tf3.getText(); 
        try
        {
            //Step One
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Step Two
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/se","root","");
            
            //Step Three
            Statement st=con.createStatement();
            
         
            
            //Step Four
         String mySQL_st = "INSERT INTO `employees`(`Name`,`Job`,`Phone Number`,`ID`) VALUES ("+"'"+name+"'"+","+"'"+job_option+"'"+","+"'"+number+"'"+","+"'"+ID+"'"+")";
         System.out.println(mySQL_st);
                  st.executeUpdate(mySQL_st);
                    
                    //Step Five
                    con.close();
                    
                    //txt.setText("Saving successful");
          }
        
        catch(Exception ee){System.out.println(ee);System.out.println("Connection error");} 
        
              } 
         }));
         
        GridPane gridPane = new GridPane();
      
        gridPane.setMinSize(600,400);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(20);
        gridPane.setHgap(30);
        gridPane.setAlignment(Pos.CENTER);


        gridPane.add(name, 1, 1);
        gridPane.add(number, 1, 2);
        gridPane.add(ID, 1, 3);
        
        gridPane.add(tf,2,1);
        gridPane.add(tf2, 2, 2);
        gridPane.add(tf3, 2, 3);
        
        gridPane.add(btn, 0, 4);
        gridPane.add(job, 0,1);
        
        primaryStage.setTitle("Employee Data Form");
        Scene scene=new Scene (gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
         } 
         
        }












