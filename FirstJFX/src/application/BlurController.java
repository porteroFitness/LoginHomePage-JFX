/**
 * author Sergy
 */

package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
// import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BlurController {

	private int contClick = 0;
	@FXML
    // private ImageView imageView;
	private Pane pane;

	
	// DESHACER DEGRADADO DE IMAGEN
	@FXML
    private void setblur() {
		
		pane.setEffect(new GaussianBlur(20));

    }
	
	// DEGRADAR IMAGEN
	@FXML
    private void setFocus() {           
             pane.setEffect(new GaussianBlur(0));

    }
	
	/*@FXML
    private void setblur() {
		contClick ++ ;
		pane.setEffect(new GaussianBlur(contClick));

    }
	
	// DEGRADAR IMAGEN
	@FXML
    private void setFocus() {  
		contClick--;
		pane.setEffect(new GaussianBlur(contClick));

    }*/
	
	// PARA CERRAR VENTANA
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
	// PARA ABRIR UNA VENTANA NUEVA
	@FXML
	private void openStage() {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Forest.fxml"));
			pane = (AnchorPane) loader.load();
			Scene scene = new Scene(pane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			
		} catch (Exception e) {
			
		}
	}
	
}
