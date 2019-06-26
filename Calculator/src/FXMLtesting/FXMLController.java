package FXMLtesting;

import Domain.Calculator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FXMLController implements Initializable {

    @FXML
    private Button buttonZero;
    @FXML
    private Button buttonOne;
    @FXML
    private Button buttonTwo;
    @FXML
    private Button buttonThree;
    @FXML
    private Button buttonFour;
    @FXML
    private Button buttonFive;
    @FXML
    private Button buttonSix;
    @FXML
    private Button buttonSeven;
    @FXML
    private Button buttonEight;
    @FXML
    private Button buttonNine;
    @FXML
    private Button buttonLeftParentathis;
    @FXML
    private Button buttonRightParenthathis;
    @FXML
    private Button buttonComma;
    @FXML
    private Button buttonEquals;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonMultiplication;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonPI;
    @FXML
    private Pane centerPane;
    @FXML
    private Label labelResult;
    @FXML
    private TextField inputTF;
    @FXML
    private TextField resultTF;
    @FXML
    private TextField inputTF2;

    Calculator cal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cal = new Calculator();
    }

    @FXML
    private void handleButtonZeroAction(ActionEvent event) {
        inputTF.appendText("0");
    }

    @FXML
    private void handleButtonOneAction(ActionEvent event) {
        inputTF.appendText("1");
    }

    @FXML
    private void handleButtonTwoAction(ActionEvent event) {
        inputTF.appendText("2");
    }

    @FXML
    private void handleButtonThreeAction(ActionEvent event) {
        inputTF.appendText("3");
    }

    @FXML
    private void handleButtonFourAction(ActionEvent event) {
        inputTF.appendText("4");
    }

    @FXML
    private void handleButtonFiveAction(ActionEvent event) {
        inputTF.appendText("5");
    }

    @FXML
    private void handleButtonSixAction(ActionEvent event) {
        inputTF.appendText("6");
    }

    @FXML
    private void handleButtonSevenAction(ActionEvent event) {
        inputTF.appendText("7");
    }

    @FXML
    private void handleButtonEightAction(ActionEvent event) {
        inputTF.appendText("8");
    }

    @FXML
    private void handleButtonNineAction(ActionEvent event) {
        inputTF.appendText("9");
    }

    @FXML
    private void handleButtonLeftParenthathisAction(ActionEvent event) {
        inputTF.appendText("'('");
    }

    @FXML
    private void handleButtonEqualsAction(ActionEvent event) {
    }

    @FXML
    private void handleButtonPlusAction(ActionEvent event) {

        double value = cal.add(Integer.parseInt(inputTF.getText()), Integer.parseInt(inputTF2.getText()));
        resultTF.setText(String.valueOf(value));
    }

    @FXML
    private void handleButtonMinusAction(ActionEvent event) {

        double value = cal.subtract(Integer.parseInt(inputTF.getText()), Integer.parseInt(inputTF2.getText()));
        resultTF.setText(String.valueOf(value));
    }

    @FXML
    private void handleButtonMultiplicationAction(ActionEvent event) {

        double value = cal.multiplication(Integer.parseInt(inputTF.getText()), Integer.parseInt(inputTF2.getText()));
        resultTF.setText(String.valueOf(value));
    }

    @FXML
    private void handleButtonDivideAction(ActionEvent event) {

        double value = cal.divide(Integer.parseInt(inputTF.getText()), Integer.parseInt(inputTF2.getText()));
        resultTF.setText(String.valueOf(value));
    }

    @FXML
    private void handleButtonPIAction(ActionEvent event) {
        inputTF.appendText(String.valueOf(Math.PI));
    }

}