/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radiosonda.new_project_wizard;

import com.radiosonda.Wizard;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javafx.scene.control.Dialog;

/**
 *
 * @author manuel
 */
public class NewProjectWizardFactory {
    public static Wizard create() throws IOException {
        List<Dialog<HashMap<String, String>>> dialogs = new ArrayList<>();
        dialogs.add(new NewProjectWizardStep1());
        dialogs.add(new NewProjectWizardStep2());
        dialogs.add(new NewProjectWizardStep3());
        return new Wizard(dialogs);
    }
    
}
