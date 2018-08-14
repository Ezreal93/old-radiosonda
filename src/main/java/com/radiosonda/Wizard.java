package com.radiosonda;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import javafx.scene.control.Dialog;

/**
 * @author manuel
 */
public class Wizard {
    private final List<Dialog<HashMap<String, String>>> dialogs;
    private final HashMap<String, String> results;
    
    public Wizard(List<Dialog<HashMap<String, String>>> dialogs){ 
        this.dialogs = dialogs;
        this.results = new HashMap<>();        
    }
    
    public Optional<HashMap<String, String>> start(){
        
        for(Dialog<HashMap<String, String>> dialog: dialogs){
            Optional<HashMap<String, String>> result = dialog.showAndWait();
            if(result.isPresent()){
                this.results.putAll(result.get());
            }else{
                return Optional.empty();
            }
        }
        return Optional.of(this.results);
    }
}
