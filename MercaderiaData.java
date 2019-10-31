package ProyectoApp.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MercaderiaData {
	
	HashMap<String,List<Datos>> datos = new HashMap<String,List<Datos>> ();
	
	public List<Datos> getDatos(String key) {
		return datos.get(key);
	}
	public void setMercaderia(String key) {
		datos.put(key, new ArrayList<Datos>());
	}
	
	public Boolean contains(String key) {
		return datos.containsKey(key);
	}
}
