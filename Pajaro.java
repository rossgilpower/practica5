package practica5;

public abstract class Pajaro {
	private String nombre;
	private String poder;
	private String color;
	private String ataque;
	
	public Pajaro(String nombre, String poder, String color, String ataque) {
		this.nombre = nombre;
		this.poder = poder;
		this.color = color;
		this.ataque = ataque;
}

	public String getNombre() {
		return nombre;
	}
	public String getPoder() {
		return poder;
	}
	public String getColor() {
		return color;
	}
	public String getAtaque() {
		return ataque;
	}
	
}
