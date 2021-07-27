package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class InsertEmployee {
    @FXML
    private TextField fname1;
    @FXML
    private TextField lname1;
    @FXML
    private TextField salary1;
    @FXML
    private TextField age1;
    @FXML
    private TextField department1;
    @FXML
    private TextField address1;
    @FXML
    private DatePicker date_of_birth1;
    @FXML
    private TextField gender1;
    @FXML
    private TextField education1;
    @FXML
    private TextField experience1;
    @FXML
    private DatePicker contract_start1;
    @FXML
    private DatePicker contract_end1;
    @FXML
    private TextField nationality1;
    @FXML
    private TextField mother_language1;
    @FXML
    private TextField other_language1;

    public void insertData(ActionEvent e) {
        LocalDate datebirth = date_of_birth1.getValue();
        LocalDate datecontract_start = contract_start1.getValue();
        LocalDate datecontract_end = contract_end1.getValue();

        String firstName = fname1.getText();
        String lastName  = lname1.getText();
        String textSalary  = salary1.getText();
        String textAge  = age1.getText();
        String textDepartment  = department1.getText();
        String textAddress  = address1.getText();
        String textGender  = gender1.getText();
        String textEducation  = education1.getText();
        String textExperience  = experience1.getText();
        String nationality  = nationality1.getText();
        String motherLanguage  = mother_language1.getText();
        String otherLanguage  = other_language1.getText();

        String dateOfBirth  = datebirth.toString();
        String textContractStart  = datecontract_start.toString();
        String textContractEnd  = datecontract_end.toString();

        float fSalary = Float.parseFloat(textSalary);
        int iAge = Integer.parseInt(textAge);

        Employee emp = new Employee();

        emp.setFname(firstName);
        emp.setLname(lastName);
        emp.setSalary(fSalary);
        emp.setAge(iAge);
        emp.setDepartment(textDepartment);
        emp.setAddress(textAddress);
        emp.setDate_of_birth(dateOfBirth);
        emp.setGender(textGender);
        emp.setEducation(textEducation);
        emp.setExperience(textExperience);
        emp.setContract_start(textContractStart);
        emp.setContract_end(textContractEnd);
        emp.setNationality(nationality);
        emp.setMother_language(motherLanguage);
        emp.setOther_language(otherLanguage);

        int status = DBInfo.save(emp);

        if(status>0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data Insert");
            alert.setHeaderText("Information Dialog");
            alert.setContentText("Record saved successfully!");

            alert.showAndWait();

            System.out.println("Record saved successfully!");

        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Data Insert");
            alert.setHeaderText("ERROR Dialog");
            alert.setContentText("Sorry! unable to save record");

            alert.showAndWait();
        }

    }


}
