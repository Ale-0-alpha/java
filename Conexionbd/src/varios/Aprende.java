package varios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aprende {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int aciertos = 0;
		int errores = 0;
		
		System.out.println("¡Welcome to the multiply game!");
		System.out.println("You have to resolve the multiplication. Enter 0 to exit");
	
		while(true) {
			int numero1 = random.nextInt(9) + 1; //Numero entre 1 y 9
			int numero2 = random.nextInt(9) + 1; // Numero entre 1 y 9
			int resultadoCorrecto = numero1 * numero2;
			
			System.out.println("¿How much is " + numero1 +  " x " + numero2 + "?");
			int respuestaUsuario = scanner.nextInt();
			
			if(respuestaUsuario == 0) {
				break; //salir del juego
			}
			
			if(respuestaUsuario == resultadoCorrecto) {
				System.out.println(mensajeAciertos());
				aciertos++;
			}else {
				System.out.println("INCORRECT:( The correct answer was " + resultadoCorrecto + ".");
				errores++;
			}
		}
		
		System.out.println("\nEnd game.");
		System.out.println("Successes: " + aciertos);
		System.out.println("Mistakes: "+ errores);
		
		scanner.close();
	}
	private static String mensajeAciertos() {
		List<String> mensajes = new ArrayList<>();
		mensajes.add("You're smart :)");
		mensajes.add("Awesome you're a genius");
		mensajes.add("WOW. you are  a genius");
		mensajes.add("Let's go you're on fire");
		Random r = new Random();
		int indice = r.nextInt(0, mensajes.size());
		return mensajes.get(indice);
	}
}
