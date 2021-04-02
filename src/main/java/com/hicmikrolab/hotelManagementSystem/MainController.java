package com.hicmikrolab.hotelManagementSystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @FXML
    public Button klikBtn;

    @FXML
    public BorderPane rootView;

   @FXML
    public void initialize(){
        this.klikBtn.setOnAction(actionEvent-> System.out.println("you clicked me"));
    }
}
