package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author ernesto
 * @version 1.0
 * @see BlurController
 *
 */
public class Main extends Application {

	private AnchorPane mypane;
	
	/**
	 * crea el Stage
	 */
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	/**
    	 * carga el controlador y la vista fxml 
    	 */
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "Forest.fxml"
            )
        );

        mypane = (AnchorPane) loader.load();

        /**
         * titula y coloca la escena en el stage
         */
        stage.setTitle("Where's the squirrel?");
        stage.setScene(new Scene(mypane));
        stage.show();
    }


    /**
     * arranca la aplicación
     * @param args
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}