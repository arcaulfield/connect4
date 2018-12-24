package sample;

import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.scene.control.CheckBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;


public class LoginController {
    public CheckBox check1;
    public CheckBox check2;
    public CheckBox targetCheck;


    private Stage stage;


    public void check(ActionEvent e){
        targetCheck = (CheckBox) e.getTarget();
        if(targetCheck.equals(check1)){
            check2.setSelected(false);
        }else if(targetCheck.equals(check2)){
            check1.setSelected(false);
        }

    }
    public void play(ActionEvent e) throws IOException{

        if(targetCheck.isSelected() && targetCheck.equals(check1)){
            stage = (Stage) check1.getScene().getWindow();
            GridPane root = FXMLLoader.load(getClass().getResource("OnePlayer.fxml"));
            Scene scene = new Scene(root, 300, 275);
            stage.setScene(scene);
        }else if(targetCheck.isSelected() && targetCheck.equals(check2)){
            stage = (Stage) check1.getScene().getWindow();
            GridPane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root, 300, 275);
            stage.setScene(scene);
        }
    }

}
