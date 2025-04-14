package varios;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   Random random = new Random();
	   int numeroSecreto = random.nextInt(100) + 1;
	   int intento;
	   int intentosRealizados = 0;
	   
	   System.out.println("¡Welcome to the GUESS WHAT game!");
	   System.out.println("I m thinking in a number between 1 and 100. ¿Can you guess what number is?");
	   
	   do {
		   System.out.println("Introduce your number: ");
		   intento = scanner.nextInt();
		   intentosRealizados++;
		   
		   if(intento < numeroSecreto) {
			   System.out.println("Too low. Try again");
		   }else if (intento > numeroSecreto) {
			   System.out.println("Too high. Try again");
		   }else {
			   System.out.println("¡Congrats! You guess the number in "
					 + intentosRealizados + " Tries.");
		   }
	   }while (intento != numeroSecreto);
	   
	   scanner.close();
   }
   
}
