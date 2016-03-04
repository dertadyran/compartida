package Ej3;

public class Alumno {
	private String nombre;
	private float altura;
	
	public Alumno(String nombre, float altura){
		this.nombre=nombre;
		this.altura=altura;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getAltura(){
		return this.altura;
	}
	
	public String toString(){
		return "\nNombre: "+this.nombre+", Altura: "+this.altura;
	}

}
