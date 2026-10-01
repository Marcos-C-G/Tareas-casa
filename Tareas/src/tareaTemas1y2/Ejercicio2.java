package tareaTemas1y2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ************Ejercicio 2************
		 * Crear un programa que, utilizando la clase Scanner, solicite al usuario el número de bastidor
		 * (VIN) de un vehículo (debe introducirse como una única cadena de 17 caracteres en mayúsculas
		 * , por ejemplo: 1HGCR2F83HA000123 
		 * El programa debe procesar la cadena y mostrar mediante mensajes claros por consola:
		 * Número de caracteres introducidos (0,5 ptos)
		 * Mostrar posición de carácter I, O, Q y Ñ , si no están mostrará el valor -1 (indexOf ya lo hace automáticamente). (1  ptos)
		 * El WMI , el VDS y el VIS (1  ptos)
		 * Validación de EEUU: Mostrar true si la cadena comienza por "1", y false si no es así. (1  ptos)
		 * Nº de producción del fabricante (1 ptos)
		 * 
		 */
		
		//SI QUEREMOS QUE EL USUARIO INTRODUZCA EL NUMERO SE UTILIZARIA EL CODIGO A CONTINUACION
		/*Scanner lector= new Scanner(System.in);//iniciar lector
		
		System.out.println("Introduzca el numero de bastidor de su vehiculo : ");//Solicitar n bastidor
		
		//Asignar el n introducido a variable
		String numeroBastidor= lector.next();
		*/
		String numeroBastidor= "1HGCR2F83HA000123";//Utilizando el n de bastidor proporcionado
		
		int longitudCadena= numeroBastidor.length();//Calcula la longitud y la muestra por consola
		System.out.println("El numro de bastidor introducido tiene "+ longitudCadena +" caracteres");
		
		
		//Busca los caracteres solicitados en la cadena dada
		int posicionI= numeroBastidor.indexOf('I');
		int posicionO= numeroBastidor.indexOf('O');
		int posicionQ= numeroBastidor.indexOf('Q');
		int posicionÑ= numeroBastidor.indexOf('Ñ');
		System.out.println("El caracter I se encuentra en la posicion "+ posicionI + ","+ " el caracter O se encuentra en la posicion "+ posicionO);
		System.out.println("el caracter Q se encuentra en la posicion "+ posicionQ+ ","+ " el caracter Ñ se encuentra en la posicion "+ posicionÑ +".");
		//Ningun caracter esta en la cadena porque los caracteres pedidios nunca se incluyen en el n de bastidor
		//Por lo que siempre darán -1
		
		
		//Separamos la cadena en los distintos subcadenas que conforman el numero de bastidor
		//1ª subcadena
		String wmi= numeroBastidor.substring(0, 3);
		System.out.println("El numero WMI del numero de batidor es: " +wmi);
		
		//2ª subcadena
		String vds= numeroBastidor.substring(3, 9);
		System.out.println("El numero VDS del numeropo de bastidor es : "+ vds);
		
		//3ª subcadena
		String vis= numeroBastidor.substring(9, 17);
		System.out.println("El numero VIS del numero de bastidor es : "+ vis);
		
		//Comprobamos con un boolean si el cohe se ha hecho en los EEUU y lo mostramos por consola
		boolean eeuu = numeroBastidor.startsWith("1");
		System.out.println("El vehiculo fue fabricado en Estados Unidos = "+ eeuu);
		
		//Buscamos dentro del n de bastidor el numero de fabricante 
		//(una subcadena distinta de las anteriores) y mostramos por consola
		String nProduccionFabricante= numeroBastidor.substring(11);
		System.out.println("El numero de produccion del fabricante es: "+ nProduccionFabricante);
		
		
		
		}
		
		
				
		
		
		
		
		
		

	}

