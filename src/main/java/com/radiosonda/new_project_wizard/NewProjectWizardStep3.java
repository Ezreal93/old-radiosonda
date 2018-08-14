package com.radiosonda.new_project_wizard;

import java.io.IOException;
import java.util.HashMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;

/**
 * @author manuel
 */
public class NewProjectWizardStep3 extends Dialog<HashMap<String, String>> {

    private final NewProjectWizardStep3Controller controller;

    public NewProjectWizardStep3() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/NewProjectWizardStep3.fxml"));
        controller = new NewProjectWizardStep3Controller();
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
