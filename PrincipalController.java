package ProyectoApp.vista;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.mil.cideso.gui.magia.factory.MagiaFactory;
import ar.mil.cideso.gui.magia.ventana.MagiaWindow;
import ar.mil.cideso.gui.magia.ventana.MagiaWindowController;
import javafx.stage.Stage;

public class PrincipalController  implements MagiaWindowController{

	private static final String FXML_VISTA = "principal.fxml";
	private static Logger logger = LoggerFactory.getLogger(PrincipalController.class);

	@Override
	public URI getFXML() {
		try {
			return getClass().getResource(FXML_VISTA).toURI();
		} catch (Exception e) {
			logger.error("Error al obtener XML", e);
			return null; // eso espera MAGIA
		}
	}

	@Override
	public void start(MagiaWindow ventana, MagiaFactory factory, Stage primaryStage) {
		// TODO Auto-generated method stub
		
	}

}
