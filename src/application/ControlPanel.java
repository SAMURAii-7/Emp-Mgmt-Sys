package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ControlPanel {

    public void viewEmployee(ActionEvent e) throws IOException {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ViewEmployees.fxml"));

        Scene scene = new Scene(root, 1080,550);
        String css = getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);

        primaryStage.setTitle("View Employees");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void insertEmployee(ActionEvent e) throws IOException {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("InsertEmployees.fxml"));

        Scene scene = new Scene(root, 1080,550);
        String css = getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);

        primaryStage.setTitle("Insert Employees");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void updateDeleteEmployee(ActionEvent e) throws IOException {

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("UpdateDelete.fxml"));

        Scene scene = new Scene(root, 1080,550);
        String css = getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);

        primaryStage.setTitle("Update/Delete Employees");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
