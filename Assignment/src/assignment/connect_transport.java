
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

public class connect_transport extends Application {
    Stage HP_Stage = new Stage();
    @Override 
    public void start(Stage primaryStage) {
        Text number=new Text("Number Plate");
        TextField tf=new TextField();
        Text txt=new Text();
        
        Text name=new Text("Driver Name");
        TextField tf2=new TextField();
        Text txt2=new Text();
        
        Text v_number=new Text("Vehicle Number");
        TextField tf3=new TextField();
        Text txt3=new Text();
        
        Text p_number=new Text("Phone Number");
        TextField tf4=new TextField();
        Text txt4=new Text();
        
        Button btn= new Button("Save");
        
        //Eventhandling for the save button
         btn.setOnMouseClicked((new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent event) {    
             
               final String number = tf.getText();
                String name=tf2.getText();
                String v_number= tf3.getText(); 
              final String p_number= tf4.getText(); 
        try
        {
            //Step One
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Step Two
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/se","root","");
            
            //Step Three
            Statement st=con.createStatement();
            
         
            
            //Step Four
         String mySQL_st = "INSERT INTO `advanced_bookings`(`Number_Plate`,`Driver_Name`,`Vehicle_Number`,`Phone_Number`) VALUES ("+"'"+number+"'"+","+"'"+name+"'"+","+"'"+v_number+"'"+","+"'"+p_number+"'"+")";
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

       
        gridPane.add(number, 1, 1);
        gridPane.add(name, 1, 2);
        gridPane.add(v_number, 1, 3);
        gridPane.add(p_number, 1, 4);
        
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
