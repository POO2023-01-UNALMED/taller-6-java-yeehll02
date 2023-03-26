package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		cantidadVehiculos++;
		
		if (Pais.paises.contains(fabricante.getPais().getNombre())) {
			int x=Pais.paises.indexOf(fabricante.getPais().getNombre())+1;
			int y=Integer.parseInt(Pais.paises.get(x))+1;
			Pais.paises.set(x,String.valueOf(y));
		}else {
			Pais.paises.add(fabricante.getPais().getNombre());
			Pais.paises.add("1");
		}
		
		if (Fabricante.fabricantes.contains(fabricante.getNombre())) {
			int x=Fabricante.fabricantes.indexOf(fabricante.getNombre())+1;
			int y=Integer.parseInt(Fabricante.fabricantes.get(x))+1;
			Fabricante.fabricantes.set(x,String.valueOf(y));
		}else {
			Fabricante.fabricantes.add(fabricante.getNombre());
			Fabricante.fabricantes.add("1");
		}
		
	}
	
	public static String vehiculosPorTipo() {
		int cantAut=Automovil.getcantidadAutomoviles();
		int cantCamionetas=Camioneta.getcantidadCamionetas();
		int cantCamiones=Camion.getcantidadCamiones();
		return "Automoviles: " +cantAut+"\nCamionetas: "+cantCamionetas+"\nCamiones: " + cantCamiones;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		cantidadVehiculos=cantidadVehiculos;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	
	
}
