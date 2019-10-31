package ProyectoApp.ProyectoApp;

import ProyectoApp.vista.PrincipalController;
import ar.mil.cideso.gui.fx.GestorAplicacionFX;
import ar.mil.cideso.gui.magia.factory.MagiaFactoryGenerico;
import ar.mil.cideso.gui.magia.ventana.MagiaWindowStyle;
import ar.mil.cideso.sitea.integrador.gui.SiteaApplication;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Hello world!
 *
 */
public class App extends Application {
	private Stage stage;
    
	public App() {
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		//stage.initStyle(StageStyle.UTILITY);
		
		
		//stage.setOnCloseRequest(event -> listener.onCanceled());
		
		PrincipalController controlador = new PrincipalController();

		// Creo el estilo de la ventana MAGIA
		MagiaWindowStyle estilo = new MagiaWindowStyle("Datos APP","Datos",
				this.getClass().getClassLoader().getResource("love.svg").toURI(), false,
				MagiaWindowStyle.PaletaColor.ADMINISTRADOR);
		MagiaFactoryGenerico magiaFactory = new MagiaFactoryGenerico();
		GestorAplicacionFX gestorAplicacionFx = new GestorAplicacionFX();

		SiteaApplication sitea = new SiteaApplication(controlador, estilo, magiaFactory, gestorAplicacionFx);

		sitea.iniciar();
	}
}
