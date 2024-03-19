package Modelo;

public class Usuario {
	private String nombre;
	private int edad;
	
	
	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getUsuario() {
		return nombre;
	}

	public void setUsuario(String usuario) {
		this.nombre = usuario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
