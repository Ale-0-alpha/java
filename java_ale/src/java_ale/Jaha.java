package java_ale;

public class Jaha {
public static void main(String[] args){
String tipoPasajero;
int saldo;
tipoPasajero = "p"; //particular p, estudiante e
saldo = 1300;
if(tipoPasajero == "p") {
	if(saldo >= 3600) {
		saldo = saldo - 3600;
		System.out.println("Pasaje cobrado. Su saldo es " + saldo);
	}else {
		System.out.println("Saldo insuficiente. Recargue su tarjeta");
	}
}else if(tipoPasajero == "e") {
	if(saldo >= 1300) {
		saldo = saldo - 1300;
		System.out.println("Pasaje estudiantil cobrado. Su saldo es" + saldo);
	}else {
		System.out.println("Saldo insuficiente. Recargue su tarjeta");
	}
	
	
}	
}
}

