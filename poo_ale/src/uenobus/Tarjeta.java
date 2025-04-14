package uenobus;

public class Tarjeta {
//atributos
	String idTarjeta;
	Usuario usuario;
	long saldo;
	
	//constructor
	public Tarjeta(String id, Usuario u) {
		idTarjeta = id;
		usuario = u;
		saldo = 0;
	}
	//metodos
	public void cargarSaldo(long monto) {
		saldo = saldo + monto;
	}
	public void descontarSaldo(long monto) {
		saldo = saldo - monto;
	}
	public long getSaldo() {
		return saldo;
	}
}
