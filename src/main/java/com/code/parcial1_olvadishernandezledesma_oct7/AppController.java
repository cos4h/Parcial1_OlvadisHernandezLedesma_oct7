package com.code.parcial1_olvadishernandezledesma_oct7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
  Cls_trabajadores[] workers = new Cls_trabajadores[99999];
  int posiciones = 0, pos;
  private boolean sw = false;
  Cls_trabajadores worker = new Cls_trabajadores();

  public void initialize() {
    idTextField.setFocusTraversable(true);
  }

  private void clean() {
    idTextField.clear();
    nameTextField.clear();
    lastNameTextField.clear();
    contactTextField.clear();
    emailTextField.clear();
    addressTextField.clear();
    salaryTextField.clear();
    sexTextField.clear();
  }
  @FXML
  private TextField sexTextField;

  @FXML
  private TextField addressTextField;

  @FXML
  private TextField contactTextField;

  @FXML
  private TextField emailTextField;

  @FXML
  private TextField idTextField;

  @FXML
  private TextField lastNameTextField;

  @FXML
  private TextField nameTextField;

  @FXML
  private TextField salaryTextField;

  @FXML
  void RegisterOnButton(ActionEvent event) {

    if(validation()) {
       try {
         worker = createObject();

         workers[posiciones] = worker;
         showAlert(Alert.AlertType.INFORMATION, "Empleado creado!!");
         posiciones++;
         clean();
       } catch (Exception exception) {
         showAlert(Alert.AlertType.ERROR, "Informacion invalida");
       }
    }
  }

  private boolean validation() {
    if (idTextField.getText().equals("") || nameTextField.getText().equals("") ||
        lastNameTextField.getText().equals("") || contactTextField.getText().equals("") ||
        emailTextField.getText().equals("") || addressTextField.getText().equals("") ||
        salaryTextField.getText().equals("") || salaryTextField.getText().equals("")) {
      showAlert(Alert.AlertType.ERROR, "Datos invalidos");
      return false;
    } else {
      return true;
    }
  }

  private int exist(String id) {
    for (int i = 0; i < posiciones; i++) {
      if(workers[i].getId().equals(id)) {
        sw = true;
        return i;
      }
    }
    return -1;
  }

  private void showAlert(Alert.AlertType type, String message) {
    Alert alert = new Alert(type, message);
    alert.show();
  }

  @FXML
  void SearchOnButton(ActionEvent event) {
    if (exist(idTextField.getText()) != -1) {
      worker = workers[exist(idTextField.getText())];
      nameTextField.setText(worker.getNombres());
      lastNameTextField.setText(worker.getApellidos());
      contactTextField.setText(worker.getContact());
      emailTextField.setText(worker.getCorreo());
      addressTextField.setText(worker.getDireccion());
      sexTextField.setText(worker.getSexo());
      salaryTextField.setText(String.valueOf(worker.getSalario()));
      showAlert(Alert.AlertType.CONFIRMATION, "Se encontro un registro");
    } else {
      showAlert(Alert.AlertType.WARNING, "No se encontro ningun empleado");
    }
  }


  @FXML
  void UpdateOnButton(ActionEvent event) {
    idTextField.setEditable(false);
    if(exist(idTextField.getText()) != -1) {
      validation();
      workers[exist(idTextField.getText())] = createObject();
      showAlert(Alert.AlertType.INFORMATION, "Empleado actualizado!!");
      clean();
      idTextField.setEditable(true);
    } else {
      showAlert(Alert.AlertType.ERROR, "No se pudo actualizar el empleado");
    }


  }

  private Cls_trabajadores createObject() {
    worker = new Cls_trabajadores(idTextField.getText(), nameTextField.getText(),
        lastNameTextField.getText(), contactTextField.getText(),
        emailTextField.getText(), addressTextField.getText(),
        sexTextField.getText(), Double.parseDouble(salaryTextField.getText()));
    return worker;
  }
}