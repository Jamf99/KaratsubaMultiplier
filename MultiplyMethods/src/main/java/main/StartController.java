package main;

import java.math.BigInteger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import methods.Karatsuba;

public class StartController {

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button zero;

    @FXML
    private Button karatsuba;

    @FXML
    private Label operation;

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private Button remove;

    @FXML
    private Button reset;

    @FXML
    private RadioButton butNumber2;

    @FXML
    private ToggleGroup type;

    @FXML
    private RadioButton butNumber1;

    @FXML
    void eight(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"8");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"8");
    	}
    }

    @FXML
    void five(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"5");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"5");
    	}
    }

    @FXML
    void four(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"4");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"4");
    	}
    }
    
    @FXML
    void nine(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"9");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"9");
    	}
    }

    @FXML
    void one(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"1");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"1");
    	}
    }
    
    @FXML
    void seven(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"7");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"7");
    	}
    }

    @FXML
    void six(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"6");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"6");
    	}
    }

    @FXML
    void three(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"3");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"3");
    	}
    }

    @FXML
    void two(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"2");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"2");
    	}
    }

    @FXML
    void zero(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText(number1.getText()+"0");
    	}else if(butNumber2.isSelected()) {
    		number2.setText(number2.getText()+"0");
    	}
    }
    
    @FXML
    void remove(ActionEvent event) {
    	if(butNumber1.isSelected()) {
    		number1.setText("");
    	}else if(butNumber2.isSelected()) {
    		number2.setText("");
    	}
    }

    @FXML
    void reset(ActionEvent event) {
    	number1.setText("");
    	number2.setText("");
    }

    @FXML
    void karatsuba(ActionEvent event) {
    	Karatsuba model = new Karatsuba();
    	try {
    		BigInteger number1 = new BigInteger(this.number1.getText());
    		BigInteger number2 = new BigInteger(this.number2.getText());
    		Alert message = new Alert(Alert.AlertType.INFORMATION);
			message.setTitle("Multiply Result");
			message.setContentText(model.karatsuba(number1, number2).toString());
			message.setHeaderText("This numbers have been multipled by Karatsuba method\n\n"+number1.toString()+" x "+number2.toString()+" =\n");
			message.show();
    	}catch(NumberFormatException e) {
    		Alert message = new Alert(Alert.AlertType.ERROR);
			message.setTitle("Error");
			message.setContentText("Please fill in all fields");
			message.setHeaderText("Some fields are empty");
			message.show();
    	}
    
    }
  
}
