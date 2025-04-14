package java_ale;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Bienvenido al sistema");
	System.out.println("1. Caculadora");
	System.out.println("2. Ejecutar navegador");
	System.out.println("3. Apagar computadora");
	System.out.println("o. Salir");
	int opcion = sc.nextInt();
	switch(opcion) {
	case 1 : 
		System.out.println("Abriendo calculadora");
		ProcessBuilder comandos = new ProcessBuilder("calc");
		comandos.start();
		break;
	case 2 :
		System.out.println("Banca estoy abriendo Google");
		Runtime.getRuntime().exec("notepad");
		break;
	case 3 :
		System.out.println("Adios Amigos:(");
		Runtime.getRuntime().exec("shutdwon -s -t 600");
		break;
	case 0 :
		System.out.println("¡Vuelva Pronto!");
		break;
		default :
			System.out.println("Opcion invalida");
			break;
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
