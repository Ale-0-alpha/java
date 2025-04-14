package uenobus;

public class TestUenoBus {
	public static void main(String[] args) {
		
		//tipo nombre = new Constructor
		Usuario pasajero = new Usuario("Kurt");
		pasajero.setNombre("Kurt");
		pasajero.setCedula(5654321);
		pasajero.setTelefono("0993258140");
		System.out.println("Pasajero: " + pasajero.getNombre());
		
		//crear tarjeta
		Tarjeta tarjeta007 = new Tarjeta("007", pasajero);
		
		//cargar saldo 
		Transaccion t1 = new Transaccion("recarga", 10000, "02/20/2025", tarjeta007);
		
		if(t1.procesar()) {
			System.out.println("Transaccion aceptada");
		}else {
			System.out.println("No se pudo procesar");
			}
		System.out.println("Tu saldo actual es: " + tarjeta007.getSaldo());
		
		System.out.println("--------------------------");
		
		//segunda etapa
		Transaccion t2 = new Transaccion("viaje", 20000, "02/20/2025", tarjeta007);
		
		if(t2.procesar()) {
			System.out.println("Transaccion aceptada");
		}else {
			System.out.println("No se pudo procesar");
			}
		System.out.println("Tu saldo actual es: " + tarjeta007.getSaldo());
	}
}
