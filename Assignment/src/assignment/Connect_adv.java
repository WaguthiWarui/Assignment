
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

public class Connect_adv extends Application {
   Stage HP_Stage = new Stage();
    @Override 
    public void start(Stage primaryStage) {
        Text ID=new Text("Vehicle_ID");
        TextField tf=new TextField();
        Text txt=new Text();
        
        Text time=new Text("Time");
        TextField tf2=new TextField();
        Text txt2=new Text();
        
        Text route=new Text("Route");
        TextField tf3=new TextField();
        Text txt3=new Text();
        
        Text date=new Text("Date");
        TextField tf4=new TextField();
        Text txt4=new Text();
        
        Button btn= new Button("Save");
        
        //Eventhandling for the save button
         btn.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) {    
             
               final String ID = tf.getText();
                String time=tf2.getText();
                String route= tf3.getText(); 
              final String date= tf4.getText(); 
        try
        {
            //Step One
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Step Two
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/se","root","");
            
            //Step Three
            Statement st=con.createStatement();
            
         
            
            //Step Four
         String mySQL_st = "INSERT INTO `advanced_bookings`(`Vehicle_ID`,`Time`,`Route`,`Date`) VALUES ("+"'"+ID+"'"+","+"'"+time+"'"+","+"'"+route+"'"+","+"'"+date+"'"+")";
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


        gridPane.add(ID, 1, 1);
        gridPane.add(time, 1, 2);
        gridPane.add(route, 1, 3);
        gridPane.add(date, 1, 4);
        
        gridPane.add(tf,2,1);
        gridPane.add(tf2, 2, 2);
        gridPane.add(tf3, 2, 3);
        gridPane.add(tf4,2,4);
        
        gridPane.add(btn, 0, 4);
        primaryStage.setTitle("Advanced bookings Form");
        Scene scene=new Scene (gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

