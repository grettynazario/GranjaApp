package ProyectoApp.modelo;

import java.util.Date;

public class Datos {
	
	private Date date;
	private int precioGanancia;
	private int precioInversion;

	public Datos(){
		this.date = new Date();
	}

	public void setGanancia (int precio) {
		this.precioGanancia += precio;
	}
	
	public void setInversion(int precio) {
		this.precioInversion = precio;
	}
}
