package Ej5;

import LecturaTeclado.Entrada;

public class Departamento {
	private Profesor []depar;
	
	public Departamento(){
		depar=new Profesor[6];
	}
	
	public Profesor crearProf(){
		int edad;
		
		edad=Entrada.pedirEntero("Inserta una edad:");
		
		return new Profesor(edad);
	}
	
	public int getDept(){
		return depar.length;
	}
	
	public void insertar(){
		for(int cod=0;cod<depar.length;cod++){
			depar[cod]=crearProf();
		}
	}

}
