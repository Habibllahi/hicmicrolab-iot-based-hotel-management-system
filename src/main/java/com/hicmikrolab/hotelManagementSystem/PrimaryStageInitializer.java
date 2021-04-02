/**
 * @Author Hamzat Habibllahi Adewale
 */
package com.hicmikrolab.hotelManagementSystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URL;

/**
 * <p>
 *     This class is self called. Its a listener to respond to any published StageReadyEvent.
 *     <code>StageReadyEvent</code> is a custom ApplicationEvent for our JavaFX application and subclass of
 *     <code>org.springframework.context.ApplicationEvent</code>
 * </p>
 */
@Component
public class PrimaryStageInitializer implements ApplicationListener<StageReadyEvent> {

    @Value("${spring.application.ui.title}")
    private String applicationTitle;
    @Value("classpath:/MainController.fxml")
    private Resource fxml;

    @Autowired
    ApplicationContext applicationContext;


    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        try{
            Stage stage = event.getStage();

            URL url = this.fxml.getURL();
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            fxmlLoader.setControllerFactory(applicationContext::getBean);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root,1300,680);
            stage.setTitle(this.applicationTitle);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
