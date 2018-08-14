package com.radiosonda;

import com.radiosonda.new_project_wizard.NewProjectWizardFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class FXMLController implements Initializable {

    @FXML
    void createNewProjectAction(ActionEvent event) throws IOException {
        Wizard wizard = NewProjectWizardFactory.create();
        wizard.start().ifPresent((results)->{
            System.out.println(results);
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
