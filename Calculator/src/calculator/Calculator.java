package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//@author Victor & Jakob
public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        gridpane.setMinSize(250, 200);
        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //creating input field
        TextField textfield = new TextField();
        textfield.setText("");
        
        //creating buttons
        //buttons 0-9
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        //button operations
        Button btnx2 = new Button("X^2");
        Button btnxy = new Button("x^y");
        Button btnsin = new Button("sin");
        Button btncos = new Button("cos");
        Button btntan = new Button("tan");
        Button btnsqrt = new Button("√");
        Button btn10x = new Button("10^x");
        Button btnlog = new Button("log");
        Button btnexp = new Button("Exp");
        Button btnmod = new Button("Mod");
        Button btnarrow = new Button("↑");
        Button btnce = new Button("CE");
        Button btnc = new Button("C");
        Button btndelete = new Button("←");
        Button btndivide = new Button("÷");
        Button btnpi = new Button("π");
        Button btnmultiply = new Button("×");
        Button btnn = new Button("n!");
        Button btnminus = new Button("-");
        Button btnsign = new Button("±");
        Button btnplus = new Button("+");
        Button btnlbracket = new Button("(");
        Button btnrbracket = new Button(")");
        Button btndot = new Button(".");
        Button btnequal = new Button("=");
        
        //setting actions for buttons
        //buttons 0-9
        btn0.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "0");
        });
        btn1.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "1");
        });
        btn2.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "2");
        });
        btn3.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "3");
        });
        btn4.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "4");
        });
        btn5.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "5");
        });
        btn6.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "6");
        });
        btn7.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "7");
        });
        btn8.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "8");
        });
        btn9.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "9");
        });
        //button operations
        btnx2.setOnAction((ActionEvent event) -> {
            //should immediately calculate on last written full number
        });
        btnxy.setOnAction((ActionEvent event) -> {
            //should read last written full number and then take next written full number
        });
        btnsin.setOnAction((ActionEvent event) -> {
            //should immediately calculate on last written full number
        });
        btncos.setOnAction((ActionEvent event) -> {
            //should immediately calculate on last written full number
        });
        btntan.setOnAction((ActionEvent event) -> {
           //should immediately calculate on last written full number
        });
        btnsqrt.setOnAction((ActionEvent event) -> {
            //should immediately calculate on last written full number
        });
        btn10x.setOnAction((ActionEvent event) -> {
            //should immediately calculate on last written full number
        });
        btnlog.setOnAction((ActionEvent event) -> {
            //should immediately calculate on last written full number
        });
        btnexp.setOnAction((ActionEvent event) -> {
            //should immediately calculate on last written full number
        });
        btnmod.setOnAction((ActionEvent event) -> {
            //should read last written full number and then take next written full number
        });
        btnarrow.setOnAction((ActionEvent event) -> {
            //used to change certain operations in windows might be useless for us
        });
        btnce.setOnAction((ActionEvent event) -> {
            //should recognise last full number/operation and clear it
        });
        btnc.setOnAction((ActionEvent event) -> {
            textfield.setText("");
        });
        btndelete.setOnAction((ActionEvent event) -> {
            CharSequence string = textfield.getCharacters();
            if (string.length() > 0) {
                string = string.subSequence(0, string.length()-1);
                textfield.setText(string.toString());
            }
        });
        btndivide.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "÷");
        });
        btnpi.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "π");
        });
        btnmultiply.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "×");
        });
        btnn.setOnAction((ActionEvent event) -> {
            //add factorial
        });
        btnminus.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "-");
        });
        btnsign.setOnAction((ActionEvent event) -> {
            //should recognise a number and insert the sign-bit before it
        });
        btnplus.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "+");
        });
        btnlbracket.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + "(");
        });
        btnrbracket.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + ")");
        });
        btndot.setOnAction((ActionEvent event) -> {
            textfield.setText(textfield.getCharacters() + ".");
        });
        btnequal.setOnAction((ActionEvent event) -> {
            //should call a function that reads the string and converts it into understandable math for java
        });
        
        //position of buttons in grid
        //buttons 0-9
        gridpane.add(btn0, 2, 6);
        gridpane.add(btn1, 1, 5);
        gridpane.add(btn2, 2, 5);
        gridpane.add(btn3, 3, 5);
        gridpane.add(btn4, 1, 4);
        gridpane.add(btn5, 2, 4);
        gridpane.add(btn6, 3, 4);
        gridpane.add(btn7, 1, 3);
        gridpane.add(btn8, 2, 3);
        gridpane.add(btn9, 3, 3);
        //button operations
        gridpane.add(btnx2, 0, 0);
        gridpane.add(btnxy, 1, 0);
        gridpane.add(btnsin, 2, 0);
        gridpane.add(btncos, 3, 0);
        gridpane.add(btntan, 4, 0);
        gridpane.add(btnsqrt, 0, 1);
        gridpane.add(btn10x, 1, 1);
        gridpane.add(btnlog, 2, 1);
        gridpane.add(btnexp, 3, 1);
        gridpane.add(btnmod, 4, 1);
        gridpane.add(btnarrow, 0, 2);
        gridpane.add(btnce, 1, 2);
        gridpane.add(btnc, 2, 2);
        gridpane.add(btndelete, 3, 2);
        gridpane.add(btndivide, 4, 2);
        gridpane.add(btnpi, 0, 3);
        gridpane.add(btnmultiply, 4, 3);
        gridpane.add(btnn, 0, 4);
        gridpane.add(btnminus, 4, 4);
        gridpane.add(btnsign, 0, 5);
        gridpane.add(btnplus, 4, 5);
        gridpane.add(btnlbracket, 0, 6);
        gridpane.add(btnrbracket, 1, 6);
        gridpane.add(btndot, 3, 6);
        gridpane.add(btnequal, 4, 6);
        //input field
        gridpane.add(textfield, 0, 7, 5, 1);
        
        // set min width of all buttons
        int minWidth = 50;
        //buttons 0-9
        btn0.setMinWidth(minWidth);
        btn1.setMinWidth(minWidth);
        btn2.setMinWidth(minWidth);
        btn3.setMinWidth(minWidth);
        btn4.setMinWidth(minWidth);
        btn5.setMinWidth(minWidth);
        btn6.setMinWidth(minWidth);
        btn7.setMinWidth(minWidth);
        btn8.setMinWidth(minWidth);
        btn9.setMinWidth(minWidth);
        //button operations
        btnx2.setMinWidth(minWidth);
        btnxy.setMinWidth(minWidth);
        btnsin.setMinWidth(minWidth);
        btncos.setMinWidth(minWidth);
        btntan.setMinWidth(minWidth);
        btnsqrt.setMinWidth(minWidth);
        btn10x.setMinWidth(minWidth);
        btnlog.setMinWidth(minWidth);
        btnexp.setMinWidth(minWidth);
        btnmod.setMinWidth(minWidth);
        btnarrow.setMinWidth(minWidth);
        btnce.setMinWidth(minWidth);
        btnc.setMinWidth(minWidth);
        btndelete.setMinWidth(minWidth);
        btndivide.setMinWidth(minWidth);
        btnpi.setMinWidth(minWidth);
        btnmultiply.setMinWidth(minWidth);
        btnn.setMinWidth(minWidth);
        btnminus.setMinWidth(minWidth);
        btnsign.setMinWidth(minWidth);
        btnplus.setMinWidth(minWidth);
        btnlbracket.setMinWidth(minWidth);
        btnrbracket.setMinWidth(minWidth);
        btndot.setMinWidth(minWidth);
        btnequal.setMinWidth(minWidth);
        //input field
        textfield.setMinWidth(200);

        //set max width of all buttons
        int maxWidth = 50;
        //buttons 0-9
        btn0.setMaxWidth(maxWidth);
        btn1.setMaxWidth(maxWidth);
        btn2.setMaxWidth(maxWidth);
        btn3.setMaxWidth(maxWidth);
        btn4.setMaxWidth(maxWidth);
        btn5.setMaxWidth(maxWidth);
        btn6.setMaxWidth(maxWidth);
        btn7.setMaxWidth(maxWidth);
        btn8.setMaxWidth(maxWidth);
        btn9.setMaxWidth(maxWidth);
        //button operations
        btnx2.setMaxWidth(maxWidth);
        btnxy.setMaxWidth(maxWidth);
        btnsin.setMaxWidth(maxWidth);
        btncos.setMaxWidth(maxWidth);
        btntan.setMaxWidth(maxWidth);
        btnsqrt.setMaxWidth(maxWidth);
        btn10x.setMaxWidth(maxWidth);
        btnlog.setMaxWidth(maxWidth);
        btnexp.setMaxWidth(maxWidth);
        btnmod.setMaxWidth(maxWidth);
        btnarrow.setMaxWidth(maxWidth);
        btnce.setMaxWidth(maxWidth);
        btnc.setMaxWidth(maxWidth);
        btndelete.setMaxWidth(maxWidth);
        btndivide.setMaxWidth(maxWidth);
        btnpi.setMaxWidth(maxWidth);
        btnmultiply.setMaxWidth(maxWidth);
        btnn.setMaxWidth(maxWidth);
        btnminus.setMaxWidth(maxWidth);
        btnsign.setMaxWidth(maxWidth);
        btnplus.setMaxWidth(maxWidth);
        btnlbracket.setMaxWidth(maxWidth);
        btnrbracket.setMaxWidth(maxWidth);
        btndot.setMaxWidth(maxWidth);
        btnequal.setMaxWidth(maxWidth);

    }

    public static void main(String[] args) {
        launch(args);
    }

}