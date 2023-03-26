package vehiculos;

import java.util.ArrayList;


public class Fabricante  {
	private String nombre;
	private Pais pais;
	public static ArrayList<String> fabricantes = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}

	
	public static Fabricante fabricaMayorVentas() {
		int maximo=0;
		for (int i=0; i<fabricantes.size(); i++ ) {
			if(i % 2 != 0) {
				if(Integer.parseInt(fabricantes.get(i))>maximo){
					maximo=Integer.parseInt(fabricantes.get(i));
				}
			}		
		}
		
		int indice_fabric_max = fabricantes.indexOf(String.valueOf(maximo))-1;
		
		return new Fabricante(fabricantes.get(indice_fabric_max),null);
		
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}
}
