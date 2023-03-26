package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		super(placa, puertas, 90, nombre, precio, peso,"4X4", fabricante);
		this.volco=volco;
		cantidadCamionetas++;
		
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
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco=volco;
	}
	
	public static int getcantidadCamionetas() {
		return cantidadCamionetas;
	}
	public void setcantidadCamionetas(int cantidadCamionetas) {
		this.cantidadCamionetas=cantidadCamionetas;
	}
}
