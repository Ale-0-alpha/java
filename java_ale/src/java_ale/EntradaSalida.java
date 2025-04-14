package java_ale;

import java.util.Scanner;

public class EntradaSalida {
public static void main (String[] args) {
//entrada estandar 
Scanner sc; //declaracion 
sc = new Scanner(System.in);
float imc, estaturaMetros, pesoKg;
System.out.println("Calculadora de imc");
System.out.println("Ingrese su peso en Kg");
pesoKg = sc.nextFloat();
System.out.println("Ingrese su estatura en metros");
estaturaMetros = sc.nextFloat();
//operacion aritmetica
imc = pesoKg / (estaturaMetros * estaturaMetros);
System.out.println("Tu IMC es " + imc);



	
	
}
}