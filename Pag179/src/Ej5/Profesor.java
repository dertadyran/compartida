package Ej5;

public class Profesor {
	private static int codprof;
	private int edad;
	
	static{
		codprof=1;
	}
	
	public Profesor(int edad){
		this.edad=edad;
		if(codprof<=6)
			codprof++;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString(){
		String cadena = "Numero de profesor: "+codprof+ "Edad: "+edad;
		
		return cadena;
	}

}
