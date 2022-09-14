package Session5.uppercase.view.uppercase;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class UppercaseViewController {
    @FXML
    private TextField requestField;
    @FXML
    private TextField replyField;
    @FXML
    private void onSubmitButton()
    {
        System.out.println("The button has been pressed");
    }
    @FXML
    private Label errorLabel;


}
