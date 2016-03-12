package Ej8;

public class Principal {
	
	public static int[][]copiar(int[][]matriz){
		int[][]maux = new int[matriz.length][matriz[matriz.length-1].length];
		for(int col=0;col<matriz.length;col++){
			for(int lin=0;lin<matriz[col].length;lin++){
				maux[col][lin]=matriz[col][lin];
			}
		}
		return maux;
	}
	
	public static void transponer(int[][]matriz){
		int[][]maux = copiar(matriz);
		matriz=new int[maux[maux.length-1].length][maux.length];
		for(int col=0;col<maux.length;col++){
			for(int lin=0;lin<maux[col].length;lin++){
				matriz[lin][col]=maux[col][lin];
			}
		}
	}
	
	public static void mostrar(int[][]matriz){
		for(int col=0;col<matriz.length;col++){
			for(int lin=0;lin<matriz[col].length;lin++){
				System.out.print(matriz[col][lin]+"	");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][]matriz={{2,3,4},{4,5,6}};
		
		mostrar(matriz);
		
		transponer(matriz);
//	    for (int x=0; x < matriz.length; x++) {
//	        for (int y=0; y < matriz[x].length; y++) {
//	          matrizT[y][x] = matriz[x][y];
//	        }
//	      }
		
		mostrar(matriz);
	}

}
