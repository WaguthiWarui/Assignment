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

public class UserHomePage_1 extends Application {
    Stage HP_Stage = new Stage();
    @Override
    public void start(Stage primaryStage) {
       //LABELS
        Text welcome_label = new Text("MAJALIWA BUS SERVICES");
        
        //BUTTONS
        Button bookings_button = new Button("Advanced Bookings");
        Button book_button = new Button("Regular Bookings");
        
        
        
        //GRIDPANE
        GridPane gridPane = new GridPane();
        
        gridPane.add(welcome_label,0,0);
        gridPane.add(bookings_button,0,1);
        gridPane.add(book_button,2,1);
        
        
        gridPane.setMinSize(500,250);        
        gridPane.setVgap(10);        
        gridPane.setHgap(20);        
        gridPane.setAlignment(Pos.CENTER);
        
        //EVENT HANDLER FOR THE ADVANCED BOOKING BUTTON
        bookings_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
        public void handle(MouseEvent event) {
        Connect_adv hp = new Connect_adv();
        
        Stage stage = (Stage) bookings_button.getScene().getWindow();            
                stage.show();
        
            //opening a new window
            hp.start(hp.HP_Stage);
        }
        }));
        
        //EVENT HANDLER FOR THE REGULAR BOOKING BUTTON
        book_button.setOnMouseClicked((new EventHandler<MouseEvent>() { 
        public void handle(MouseEvent event) {
        connect_reg hp = new connect_reg();
        
        Stage stage = (Stage) book_button.getScene().getWindow();            
                stage.show();
        
            //opening a new window
            hp.start(hp.HP_Stage);
        }
        }));
        
       
        //SCENE
        Scene my_scene = new Scene(gridPane);
        
        //STAGE
        primaryStage.setScene(my_scene);
        primaryStage.setTitle("Welcome To Bus Station");
        primaryStage.show();

}
}









