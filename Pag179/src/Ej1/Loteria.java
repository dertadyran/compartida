package Ej1;

import java.util.Random;

public class Loteria {
	private int [] primitiva;

	public Loteria(){
		primitiva= new int [6];
	}

	private int getRandom(){
		Random rand = new Random();
		return rand.nextInt(49)+1;
	}

	public void generarPrimitiva(){
		for(int cont=0;cont<primitiva.length;cont++){
			do{
				primitiva[cont]=getRandom();
		
			}while(comprobar(primitiva[cont],cont));
		}
	}
	
    private boolean comprobar(int numero, int rellenos) {
        boolean resultado = false;

        for (int cont=0; cont<rellenos;cont++) {
            if (numero == primitiva[cont]) {
                resultado = true;
            }
        }
        
        return resultado;
    }

	public void mostrarPrimitiva(){
		for(int cont=0;cont<primitiva.length;cont++){
			System.out.print(primitiva[cont]+"	");
		}
	}

}
