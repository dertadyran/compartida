package Ej1;

public class Principal {

	public static void main(String[] args) {
		Loteria primitiva = new Loteria();
///*Ej2*/		Loteria [] primitiva = new Loteria[8];
		
///*Ej2*/		for(int cont=0;cont<primitiva.length;cont++){
///*Ej2*/			primitiva[cont]=new Loteria();
///*Ej2*/			primitiva[cont].generarPrimitiva();
///*Ej2*/		}
		
///*Ej2*/		for(int cont=0;cont<primitiva.length;cont++){
///*Ej2*/			primitiva[cont].mostrarPrimitiva();
///*Ej2*/			System.out.println();
///*Ej2*/		}
		
		primitiva.generarPrimitiva();
		primitiva.mostrarPrimitiva();

//		Comentario para el ejercicio de GitHub
		
	}

}
