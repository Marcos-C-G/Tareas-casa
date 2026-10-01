package tareaTemas1y2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ****************EJERCICIO 1- Total 3 ptos****************
		 * Crear un programa en Java que utilice un array de tipo double de 10 posiciones y realice secuencialmente las siguientes operaciones: 
		 * Apartado A/	Asigna a la primera posición del array el valor:  Un número aleatorio entero entre 2 y 10 (ambos incluidos). 
		 * 		Asigna a la segunda posición del array el valor: Un número aleatorio entero entre 15 y 30 (ambos incluidos).
		 *  	Asigna a la tercera posición la suma de las dos anteriores
		 *  
		 * Apartado B/	Asigna a la cuarta posición del array el valor:
		 * 		posicion[3] = sin(posicion[0] ) * cos(posicion [1] )  + log(posicion[2] + 1).
		 * 
		 * Apartado C/	Asigna a la quinta posición del array el valor:  La media aritmética de las 4 posiciones anteriores, redondeada al entero más cercano usando.
		 * Apartado D/	Realizar una copia exacta de las primeras 5 posiciones en un segundo array de tamaño 5.
		 * Apartado E/	Ordenar el segundo array de menor a mayor.
		 * Apartado F/	Buscar en qué índice ha quedado el valor original generado en el apartado a) dentro del array ordenado (usando Arrays.binarySearch) y mostrar dicho índice por pantalla.
		 */
		Random aleatorio= new Random();
		
		double matriz[]= new double[10];
		
		//Ejercicio 1 Apartado A//
		matriz[0] = aleatorio.nextInt(2, 11);//primera posicion (Hasta el 11 porque el segundo valor limite no se incluye)
		matriz[1] = aleatorio.nextInt(15, 31);//Segunda posicion (Hasta el 31 porque el segundo valor limite no se incluye)
		matriz[2]= matriz[0] + matriz[1];//tercera posicion = Suma de las anteriores
		
		
		//Apartado B 
		matriz[3]= (Math.sin(Math.toRadians(matriz[0]))*Math.cos(Math.toRadians(matriz[1])) +Math.log(matriz[2])+1);
		//A GRADOS DE NUEVO?????????
		
		//Apartado C
		matriz [4]= Math.round(matriz[0] + matriz[1] + matriz[2] + matriz [3])/4;
		
		
		//Apartado D
		double copia []=  Arrays.copyOfRange(matriz, 0, 5);
		System.out.println(copia[0]+ " , "+ copia[1]+ " , " +copia[2]+ " , " +copia[3]+ " , "+ copia[4]);
		
		
		
		//Apartado E
		Arrays.sort(copia);
		System.out.println("Matriz ordenada: ");
		System.out.println(copia[0] + " , "+ copia[1] +" , " + copia[2] + " , " + copia[3] +" , " + copia[4]);		
		
		
		
		//Apartado F
		double suma= matriz[0] + matriz[1];
		System.out.println("La suma de "+ matriz[0] + " y " + matriz [1] +" es igual a " + suma);
		System.out.println(Arrays.binarySearch(copia, suma));
		//-------------------------------------------------------------------------------------------------------//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
