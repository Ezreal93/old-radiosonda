package com.radiosonda;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.util.Pair;

public class FXMLController implements Initializable {

    @FXML
    void createNewProjectAction(ActionEvent event) throws IOException {
        Dialog<Pair<String, String>> dialog = new NewProjectDialog();
     
        Optional<Pair<String, String>> result = dialog.showAndWait();
        result.ifPresent((pair)->{
            System.out.println("User:" + pair.getKey() + ", Probe:" + pair.getValue());
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
