/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radiosonda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author manuel
 */
public class NewProjectDialogController implements Initializable {

    @FXML
    private DialogPane pane;

    @FXML
    private TextField userField;

    @FXML
    private TextField probeField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pane.getButtonTypes()
                .add(new ButtonType("Crear", ButtonBar.ButtonData.OK_DONE));
        pane.getButtonTypes()
                .add(new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE));
    }
    
    public StringProperty userProperty(){
        return userField.textProperty();
    }
    
    public StringProperty probeProperty(){
        return probeField.textProperty();
    }

}
