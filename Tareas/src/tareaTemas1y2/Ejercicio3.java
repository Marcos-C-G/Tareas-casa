package tareaTemas1y2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector= new Scanner(System.in);
		System.out.println("Introduzca la direccion de correo electronico institucional asignada: ");
		String correoElectronico= lector.next();
		
		String partes []= correoElectronico.split("@");
		String usuario = partes[0];
		System.out.println("Su usario es: "+ usuario);
		String dominio= partes[1];
		System.out.println("Su dominio es: "+ dominio);
		boolean validacion= correoElectronico.endsWith(".com");
		System.out.println("La validacion de su correo electronico es: "+ validacion);
		int posicionArroba= correoElectronico.indexOf("@");
		int puntoArroba= dominio.indexOf(".") + (usuario.length()+1);
		System.out.println("El simbolo arroba de su correo electronico se encuentra en la posicion :"+ posicionArroba + "\nEl primer punto despues del arroba se encuentra en la posicion: " + puntoArroba) ;
		
		
		
		}
		
		
		
		

	}

