/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicreicheltinventorysystemv2.view_controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nicre
 */
public class ModifyProductsController implements Initializable {

    @FXML
    void ModifyProductsCancelClicked (ActionEvent event) throws IOException {
        System.out.println("Cancel Modify Product Clicked");
        
        //Load Add Products Screen
        Parent modifyProductCancel = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene scene = new Scene(modifyProductCancel);
        
        //Loads stage information from main file
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        //Load scene onto stage
        window.setScene(scene);
        window.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
