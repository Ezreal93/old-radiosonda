/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radiosonda;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.util.Pair;

/**
 *
 * @author manuel
 */
public class NewProjectDialog extends Dialog<Pair<String, String>> {

    private final NewProjectDialogController controller;

    public NewProjectDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/NewProjectDialog.fxml"));
        controller = new NewProjectDialogController();
        loader.setController(controller);
        DialogPane pane = loader.load();

        this.setDialogPane(pane);
        this.setResultConverter((param) -> {
            if (param.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                return new Pair<>(
                        controller.userProperty().get(),
                        controller.probeProperty().get());
            } else {
                return null;
            }

        });
    }
}
