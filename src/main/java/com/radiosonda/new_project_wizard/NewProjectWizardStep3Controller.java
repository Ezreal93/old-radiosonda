package com.radiosonda.new_project_wizard;

import java.net.URL;
import java.util.ResourceBundle;
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
public class NewProjectWizardStep3Controller implements Initializable {

    @FXML
    private DialogPane pane;
    
    @FXML
    private TextField pressureField;
    @FXML
    private TextField humidityField;
    @FXML
    private TextField temperatureField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pane.getButtonTypes()
                .add(new ButtonType("Finalizar", ButtonBar.ButtonData.OK_DONE));
        pane.getButtonTypes()
                .add(new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE));
    }    
    
}
