package messager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField textField;
    @FXML
    public Button sendButton;
    @FXML
    private TextArea textArea;


    @FXML
    public void clickSend(ActionEvent actionEvent) {
        //отправляем сообщение, только при его наличии
        if (!textField.getText().isEmpty()) {
            textArea.appendText("Я:\n" + textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }
}
