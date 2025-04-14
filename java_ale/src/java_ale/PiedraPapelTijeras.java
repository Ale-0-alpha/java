package java_ale;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
	public static void main(String[] args) {
		int aleatorio, opcion;
	Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		do {
		//piedra 1, papel 2, tijera 3
		System.out.println("Elige: ");
		System.out.println("1. Piedra/2. papel/3. tijera/0. Salir /no opcion:  ");
		opcion = sc.nextInt();
		aleatorio = rand.nextInt(1,4);
		switch(opcion) {
		case 1 :
			System.out.println("Elegiste PIEDRA");
			break;
		case 2:
			System.out.println("Elegiste PAPEL");
			break;
		case 3:
			System.out.println("Elegiste TIJERA");
			break;
			default:
				System.out.println("BYE BYE");
			}
		
		switch(aleatorio) {
		case 1:
			System.out.println("Yo elegi PIEDRA");
			break;
		case 2:
			System.out.println("Yo elegi PAPEL");
			break;
		case 3:
			System.out.println("Yo elegi TIJERA");
			break;
		default:
				System.out.println("QUE ME PASA >:(");
		}
			if(opcion == 2 && aleatorio == 1) {
				
				System.out.println("Ganaste por primera vez:O");
			}else if(opcion == 3 && aleatorio == 2) {
				System.out.println("Ganaste por primera vez:O");
			}else if(opcion == 1 && aleatorio == 3) {
				System.out.println("Ganaste por primera vez:O");
			}else if(opcion == 1 && aleatorio == 2) {
				System.out.println("Perdiste contra una maquina que tu mismo  codificaste jaja");
			}else if(opcion == 3 && aleatorio == 1) {
				System.out.println("Perdiste contra una maquina que tu mismo  codificaste jaja");
			}else if(opcion == 2 && aleatorio == 3) {
				System.out.println("Perdiste contra una maquina que tu mismo  codificaste jaja");
			}else if (opcion == aleatorio) {
				System.out.println("Empate, fue divertido");
			}
		}while(opcion != 0);
					
	}
}
	
	

		


