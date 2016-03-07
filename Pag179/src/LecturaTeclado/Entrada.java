package LecturaTeclado;

// Comentario de prueba 07-03-2016

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	private static Scanner entrada;
	static{
		entrada=new Scanner(System.in);
	}
	
	/**PIDE UNA CADENA Y TE LA DEVUELVE*/
	public static String pedirCadena(String cadena){
		String asd=null;
		try{
			System.out.println(cadena);
			asd= entrada.nextLine();
		}
		catch(Exception e){
			System.out.println("Se ha producido algun error.");
		}
		return asd;
	}
	
	/**PIDE UN NUMERO ENTERO(INT) Y LO DEVUELVE. EN CASO DE ERROR VUELVE A PEDIRLO. NO SALE HASTA QUE SE INTRODUZCA UN ENTERO*/
	public static int pedirEntero(String cadena){
		int num=0;
		boolean salir;
		do{
			salir=true;
			try{
				System.out.println(cadena);
				num=entrada.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Ha introducido letras.");
				salir=false;
			}
			catch(Exception e){
				System.out.println("Se ha producido algun error.");
				salir=false;
			}
			finally{
				entrada.nextLine();
			}
		}while(!salir);
		return num;
	}

	/**PIDE UN NUMERO ENTERO CON DECIMALES(FLOAT) Y LO DEVUELVE. EN CASO DE ERROR VUELVE A PEDIRLO. NO SALE HASTA QUE SE INTRODUZCA UN ENTERO*/
	public static float pedirFloat(String cadena){
		float num=0;
		boolean salir;
		do{
			salir=true;
			try{
				System.out.println(cadena);
				num=entrada.nextFloat();
			}
			catch(InputMismatchException e){
				System.out.println("Ha introducido letras.");
				salir=false;
			}
			catch (Exception e) {
				System.out.println("Se ha producido algun error.");
				salir=false;
			}
			finally{
				entrada.nextLine();
			}
		}while(!salir);
		return num;
	}

	/**PIDE UN NUMERO ENTERO CON DECIMALES(DOUBLE) Y LO DEVUELVE. EN CASO DE ERROR VUELVE A PEDIRLO. NO SALE HASTA QUE SE INTRODUZCA UN ENTERO*/
	public static double pedirDouble(String cadena){
		double num=0;
		boolean salir;
		do{
			salir=true;
			try{
				System.out.println(cadena);
				num=entrada.nextDouble();
			}
			catch(InputMismatchException e){
				System.out.println("Ha introducido letras.");
				salir=false;
			}
			catch(Exception e){
				System.out.println("Se ha producido algun error.");
				salir=false;
			}
			finally{
				entrada.nextLine();
			}
		}while(!salir);
		return num;
	}

	/**PIDE UN CARACTER(CHAR) Y LO DEVUELVE*/
	public static char pedirChar(String cadena){
		char asd = 0;
		try{
			System.out.println(cadena);
			asd=entrada.nextLine().charAt(0);
		}
		catch(Exception e){
			System.out.println("Se ha producido algun error.");
		}
		return asd;

	}
	
	/**PIDE UN CARACTER(CHAR) Y LO DEVUELVE EN MINUSCULAS*/
	public static char pedirChartoLowerCase(String cadena){
		char asd = 0;
		try{
			System.out.println(cadena);
			asd=entrada.nextLine().toLowerCase().charAt(0);
		}
		catch(Exception e){
			System.out.println("Se ha producido algun error.");
		}
		return asd;

	}

	/**PIDE UN NUMERO ENTERO(LONG) Y LO DEVUELVE. EN CASO DE ERROR VUELVE A PEDIRLO. NO SALE HASTA QUE SE INTRODUZCA UN ENTERO*/
	public static long pedirLong(String cadena){
		long num=0;
		boolean salir;
		do{
			salir=true;
			try{
				System.out.println(cadena);
				num=entrada.nextLong();
			}
			catch(InputMismatchException e){
				System.out.println("Ha introducido letras.");
				salir=false;
			}
			catch(Exception e){
				System.out.println("Se ha producido algun error.");
				salir=false;
			}
			finally{
				entrada.nextLine();
			}
		}while(!salir);
		return num;
	}

}
