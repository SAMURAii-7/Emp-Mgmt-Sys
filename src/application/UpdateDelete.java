package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.*;


public class UpdateDelete {

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
    private TextField date_of_birth1;
    @FXML
    private TextField gender1;
    @FXML
    private TextField education1;
    @FXML
    private TextField experience1;
    @FXML
    private TextField contract_start1;
    @FXML
    private TextField contract_end1;
    @FXML
    private TextField nationality1;
    @FXML
    private TextField mother_language1;
    @FXML
    private TextField other_language1;
    @FXML
    private TextField idEmp;

    public void getEmployeeById(ActionEvent e) {

        String sid = idEmp.getText();
        int id = Integer.parseInt(sid);

        Employee emp = DBInfo.getEmployeeId(id);

        fname1.setText(emp.getFname());
        lname1.setText(emp.getLname());
        salary1.setText(String.valueOf(emp.getSalary()));
        age1.setText(String.valueOf(emp.getAge()));
        department1.setText(emp.getDepartment());
        address1.setText(emp.getAddress());
        nationality1.setText(emp.getNationality());
        gender1.setText(emp.getGender());
        education1.setText(emp.getEducation());
        experience1.setText(emp.getExperience());
        mother_language1.setText(emp.getMother_language());
        other_language1.setText(emp.getOther_language());
        date_of_birth1.setText(emp.getDate_of_birth());
        contract_start1.setText(emp.getContract_start());
        contract_end1.setText(emp.getContract_end());
    }

    public void updateEmployee(ActionEvent e) {
        String sid = idEmp.getText();
        int id = Integer.parseInt(sid);

        String textfName = fname1.getText();
        String textlName = lname1.getText();
        float textSalary = Float.parseFloat(salary1.getText());
        int textAge = Integer.parseInt(age1.getText());
        String textDepart = department1.getText();
        String textaddress = address1.getText();
        String textNationality = nationality1.getText();
        String textGender = gender1.getText();
        String textEducation = education1.getText();
        String textExperience = experience1.getText();
        String textMother = mother_language1.getText();
        String textOther = other_language1.getText();
        String textBirth = date_of_birth1.getText();
        String textStart = contract_start1.getText();
        String textEnd = contract_end1.getText();

        Employee emp = new Employee();

        emp.setId(id);
        emp.setFname(textfName);
        emp.setLname(textlName);
        emp.setSalary(textSalary);
        emp.setAge(textAge);
        emp.setDepartment(textDepart);
        emp.setAddress(textaddress);
        emp.setDate_of_birth(textBirth);
        emp.setGender(textGender);
        emp.setEducation(textEducation);
        emp.setExperience(textExperience);
        emp.setContract_start(textStart);
        emp.setContract_end(textEnd);
        emp.setNationality(textNationality);
        emp.setMother_language(textMother);
        emp.setOther_language(textOther);

        int status = DBInfo.update(emp);
        if(status>0) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Data Update");
            alert.setHeaderText("Information Dialog");
            alert.setContentText("Record updated successfully");

            alert.showAndWait();

            System.out.println("Record saved successfully");
        }
        else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Data Update");
            alert.setHeaderText("ERROR Dialog");
            alert.setContentText("Sorry! Unable to update record");

            alert.showAndWait();

            System.out.println("Sorry! unable to update record");
        }
    }

    public void deleteEmployee(ActionEvent e) {
        String sid = idEmp.getText();
        int id = Integer.parseInt(sid);

        DBInfo.delete(id);

        int status = DBInfo.delete(id);
        if(status==0) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Data Delete");
            alert.setHeaderText("Information Dialog");
            alert.setContentText("Record deleted successfully");

            alert.showAndWait();

            System.out.println("Record deleted successfully");
        }

        else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Data delete");
            alert.setHeaderText("ERROR Dialog");
            alert.setContentText("Sorry! Unable to delete record");

            alert.showAndWait();

            System.out.println("Sorry! unable to update record");
        }
    }
}
