package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginController {

    @FXML
    Label dbConlb;

    @FXML
    Label check;

    @FXML
    TextField username;

    @FXML
    PasswordField password;

    public void statusDB(ActionEvent e) throws IOException, SQLException {

        if(!AdminsDB.getConnection().isClosed()) {
            dbConlb.setText("Connected");
        }
        else {
            dbConlb.setText("Not Connected");
        }
    }


    public void enterCP(ActionEvent e) throws IOException, SQLException {

        List<Admins> list = AdminsDB.getAdmins(); //from mysql


        Map<String, String> map = new HashMap<String, String>();

        for(Admins a:list) {
            map.put(a.getUsername(), a.getPassword());
        }

        if(map.containsKey(username.getText())) {

            String val2 = map.get(username.getText());
            if(val2.equals(password.getText())) {
                check.setText("Success");

                AdminsDB.getConnection();

                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("ControlPanel.fxml"));

                Scene scene = new Scene(root, 760,570);
                String css = getClass().getResource("application.css").toExternalForm();
                scene.getStylesheets().add(css);

                primaryStage.setTitle("Dashboard");
                primaryStage.setScene(scene);
                primaryStage.show();
            }
            else {
                check.setText("Failed try again");
            }
        }
        else {
            check.setText("Failed try again");
        }
    }
}
