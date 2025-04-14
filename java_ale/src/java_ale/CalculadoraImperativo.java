package java_ale;

import java.util.Scanner;

public class CalculadoraImperativo {
	public static void main(String[] args) {
		float a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Operaciones con dos numeros");
		System.out.println("Primer numero: ");
		a = sc.nextFloat();
		System.out.println("Segundo numero: ");
		b = sc.nextFloat();
		System.out.println(a + " + " + b +" = " +  sumar(a,b));
		System.out.println(a + " - " + b +" = " +  restar(a,b));
		System.out.println(a + " * " + b +" = " +  multiplicar(a,b));
		System.out.println(a + " / " + b +" = " +  dividir(a,b));
	}
	//funcion sumar
public static double sumar(double x, double y ) {
	return x + y;
	}
public static double restar(double x, double y ) {
	return x - y;
    }
public static double multiplicar(double x, double y ) {
	return x * y;
	}
public static double dividir(double x, double y ) {
	if(y != 0) {
	return x / y;
	}else {
		System.out.println("Division por cero");
		return 0;
	}
	}
}
