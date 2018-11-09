package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//@author Victor & Jakob
public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        gridpane.setMinSize(300, 500);
        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //buttons 0-9
        Button button0 = new Button("0");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        
        //button operations
        Button buttonx2 = new Button("x^2");
        Button buttonxy = new Button("x^y");
        
        //position of buttons in grid
        gridpane.add(button0, 2, 6);
        gridpane.add(button1, 1, 5);
        gridpane.add(button2, 2, 5);
        gridpane.add(button3, 3, 5);
        gridpane.add(button4, 1, 4);
        gridpane.add(button5, 2, 4);
        gridpane.add(button6, 3, 4);
        gridpane.add(button7, 1, 3);
        gridpane.add(button8, 2, 3);
        gridpane.add(button9, 3, 3);
        
        gridpane.add(buttonx2, 0, 0);
        gridpane.add(buttonxy, 1, 0);
        

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}