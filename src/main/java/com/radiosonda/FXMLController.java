package com.radiosonda;

import com.radiosonda.new_project_wizard.NewProjectWizardFactory;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    
    private File currentFile;
    
    @FXML
    private MenuBar barMenu;
      
    @FXML
    void createNewProjectAction(ActionEvent event) throws IOException {
        Wizard wizard = NewProjectWizardFactory.create();
        wizard.start().ifPresent((results)->{
            System.out.println(results);
        });
    }
    
    @FXML
    public void openAction(ActionEvent event)  throws IOException{
        chooseFile();
        if(currentFile != null){
            System.out.println("File: " + currentFile.getAbsolutePath());
            FileReader fileReader = new FileReader(currentFile);
            String content = new String(Files.readAllBytes(currentFile.toPath()));            
        }
        if(currentFile != null){
            setWindowTitle(currentFile.getName());
        }
    }
    
    @FXML
    void onCloseAction(ActionEvent event) {
        Platform.exit();
    }
    
    private void chooseFile() {
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        currentFile = fileChooser.showOpenDialog(barMenu.getScene().getWindow());
        if(currentFile != null){
            setWindowTitle(currentFile.getName());
        }
    }
 
    private void setWindowTitle(String title){
        Stage stage = (Stage) barMenu.getScene().getWindow();
        stage.setTitle(title);        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
