package lk.ijse.dep.hms.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IssuePrescriptionFormController {



    @FXML
    private AnchorPane AnchrPaneIssuePres;

    @FXML
    private TableView<?> tblViewMedicineDetails;

    @FXML
    private TextField txtFieldPrescriptionID;

    @FXML
    private TextField txtFieldDate;

    @FXML
    private JFXComboBox<String> cmbAppoinmentID;

    @FXML
    private TextField txtFieldMedName;

    @FXML
    private TextField txtFieldBrandName;

    @FXML
    private TextField txtFieldDrugType;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnNewPrescription;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnIssuePrescription;

    @FXML
    private TextField txtFieldPatientID;

    @FXML
    private JFXComboBox<String> cmbMedicineID;

    @FXML
    private TextField txtFieldDocID;

    @FXML
    void btnAdd_OnAction(ActionEvent event) {

    }

    @FXML
    void btnDelete_OnAction(ActionEvent event) {

    }

    @FXML
    void btnIssuePrescription_OnAction(ActionEvent event) {

    }

    @FXML
    void btnNewPrescription_OnAction(ActionEvent event) {

    }




    public void btnBacktoDashboard_OnAction(MouseEvent mouseEvent) throws IOException {
        URL resource = this.getClass().getResource("/lk/ijse/dep/hms/view/DoctorDashBoardForm.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) (this.AnchrPaneIssuePres.getScene().getWindow());
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }
}
