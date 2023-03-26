package vehiculos;

import java.util.ArrayList;

public class Pais  {
	private String nombre;
	public static ArrayList<String> paises = new ArrayList<>();
	
	
	public Pais(String nombre) {
		this.nombre=nombre;	
	}
	
	public static Pais paisMasVendedor() {
		int maximo=0;
		for (int i=0; i<paises.size(); i++ ) {
			if(i % 2 != 0) {
				if(Integer.parseInt(paises.get(i))>maximo){
					maximo=Integer.parseInt(paises.get(i));
				}
			}		
		}
		
		int indice_pais_max = paises.indexOf(String.valueOf(maximo))-1;
		
		return new Pais(paises.get(indice_pais_max));
		
		
	}
	
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
}

