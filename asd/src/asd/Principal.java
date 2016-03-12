package asd;

public class Principal {

	public static void main(String[] args) {
		int altura=10;
		
		for(int linea=altura;linea>0;linea--){
			
			for(int espacio=altura-linea;espacio>0;espacio--){
				System.out.print(" ");
			}
			
			for(int descendente=(altura+2)-linea;descendente>=3;descendente--){
				System.out.print(descendente%10);
			}
			for(int ascendente=4;ascendente<(altura+3)-linea;ascendente++){
				System.out.print(ascendente%10);
			}
			System.out.println();
		}
	}

}
