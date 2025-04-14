package uenobus;

public class Transaccion {
//
	String tipo; //viaje o recarga
	long monto;
	String fecha;
	Tarjeta tarjeta;
	
	//constructor
	public Transaccion(String t, long  m, String f, Tarjeta tj) {
		tipo = t;
		monto = m;
		fecha = f;
		tarjeta = tj;
	}
	
	public boolean procesar() {
		//viaje: hay que restar, recarga: hay que sumar
		if(tipo.equals("recarga")) {
			tarjeta.cargarSaldo(monto);
			
		}else if(tipo.equals("viaje")) {
			if(tarjeta.getSaldo() >= monto) {
			tarjeta.descontarSaldo(monto);
		
			}else {
				return false;
			}
		}
		return true;// si se pudo cobrar es true, si no, es false
	}
	
}
