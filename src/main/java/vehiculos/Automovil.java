package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso,"FWD", fabricante);
		this.puestos=puestos;
		cantidadAutomoviles++;
	}
	
	public String getPlaca() {
		return super.getPlaca();
	}
	public void setPlaca(String placa) {
		super.setPlaca(placa);
	}
	
	
	public int getPuertas() {
		return super.getPuertas();
	}
	public void setPuertas(int puertas) {
		super.setPuertas(puertas);
	}
	
	
	public int getVelocidadMaxima() {
		return super.getVelocidadMaxima();
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		super.setVelocidadMaxima(velocidadMaxima);
	}
	
	
	public String getNombre() {
		return super.getNombre();
	}
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	
	public int getPrecio() {
		return super.getPrecio();
	}
	public void setPrecio(int precio) {
		super.setPrecio(precio);
	}
	
	
	public int getPeso() {
		return super.getPeso();
	}
	public void setPeso(int peso) {
		super.setPeso(peso);
	}
	
	
	public String getTraccion() {
		return super.getTraccion();
	}
	public void setTraccion(String traccion) {
		super.setTraccion(traccion);
	}
	
	
	public Fabricante getFabricante() {
		return super.getFabricante();
	}
	public void setFabricante(Fabricante fabricante) {
		super.setFabricante(fabricante);
	}
	
	
	public int getpuestos() {
		return puestos;
	}
	public void setpuestos(int puestos) {
		this.puestos=puestos;
	}
	
	
	public static int getcantidadAutomoviles() {
		return cantidadAutomoviles;
	}
	public void setcantidadAutomoviles(int cantidadAutomoviles) {
		this.cantidadAutomoviles=cantidadAutomoviles;
	}


}
