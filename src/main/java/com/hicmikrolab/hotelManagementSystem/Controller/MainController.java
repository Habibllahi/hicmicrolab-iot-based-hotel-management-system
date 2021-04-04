/**
 * @Author Hamzat Habibllahi Adewale
 */
package com.hicmikrolab.hotelManagementSystem.Controller;

import com.hicmikrolab.hotelManagementSystem.Utility.Apartment;
import com.hicmikrolab.hotelManagementSystem.Utility.Network;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/**
 * <p>
 *     This controller is referenced in the <code>MainController.fxml</code> view file, using the
 *     property <code>fx:controller</code> and assigning it value <code>"com.hicmikrolab.hotelManagementSystem.Controller.MainController"</code>.
 *     By this association in the view file, The JavaFX application context can use this class bean (from the spring application context) to respond
 *     to client events on the associated view as programmed in this class.
 *
 *    This class bean is managed by Spring framework.
 * </p>
 */
@Controller
public class MainController {

    @FXML
    public Button klikBtn;

    @FXML
    public BorderPane rootView;

   @FXML
    public void initialize(){
       this.klikBtn.setOnAction(
               actionEvent-> {
                   try {
                       System.out.println(Network.getLocalHostIp());
                       if(Network.sendPingRequest(Apartment.ROOM_1.getIp()))
                           System.out.println(Apartment.ROOM_1.getIp()+" is online");
                       else
                           System.out.println(Apartment.ROOM_1.getIp()+" is offline");
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
       );
    }
}
