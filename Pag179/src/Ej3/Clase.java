package Ej3;

public class Clase {
	private Alumno[] clase;
	
	public Clase(int tam){
		clase=new Alumno[tam];
	}
	
	private void cambiar(Alumno a, Alumno b){
		a.setNombre(b.getNombre());
		a.setAltura(b.getAltura());
	}
	
	public void ordenar(){
		Alumno a = null;
		for(int cont=0;cont<clase.length;cont++){
			for(int cont2=0;cont2<clase.length-1-cont;cont2++){
				if(clase[cont2].getAltura()>clase[cont2+1].getAltura()){
					cambiar(a,clase[cont2]);
					cambiar(clase[cont2],clase[cont2+1]);
					cambiar(clase[cont2+1],a);
				}
			}
		}
	}

}
