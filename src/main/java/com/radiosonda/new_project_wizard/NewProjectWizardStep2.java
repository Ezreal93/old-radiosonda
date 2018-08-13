/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radiosonda.new_project_wizard;

import com.radiosonda.*;
import java.io.IOException;
import java.util.HashMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.util.Pair;

/**
 *
 * @author manuel
 */
public class NewProjectWizardStep2 extends Dialog<HashMap<String, String>> {

    private final NewProjectWizardStep2Controller controller;

    public NewProjectWizardStep2() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/NewProjectWizardStep2.fxml"));
        controller = new NewProjectWizardStep2Controller();
        loader.setController(controller);
        DialogPane pane = loader.load();

        this.setDialogPane(pane);
        this.setResultConverter((param) -> {
            if (param.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                return new HashMap<>();
            } else {
                return null;
            }

        });
    }
}
