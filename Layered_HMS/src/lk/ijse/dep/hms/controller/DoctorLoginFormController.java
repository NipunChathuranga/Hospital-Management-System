package lk.ijse.dep.hms.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DoctorLoginFormController {
    public AnchorPane AnchrPaneDoctor;
    @FXML
    private TextField txtFieldDoctorID;

    @FXML
    private TextField txtFieldDoctorPassword;

    @FXML
    private JFXButton btnDoctorLogin;

    @FXML
    void btnBacktoDashboard_OnAction(MouseEvent event) throws IOException {
        URL resource = this.getClass().getResource("/lk/ijse/dep/hms/view/DashBoardForm.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) (this.AnchrPaneDoctor.getScene().getWindow());
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

    @FXML
    void btnDoctorLogin_OnAction(ActionEvent event) throws IOException {
        URL resource = this.getClass().getResource("/lk/ijse/dep/hms/view/DoctorDashBoardForm.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) (this.AnchrPaneDoctor.getScene().getWindow());
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

}
