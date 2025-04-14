package pokemon;

public class Pokemon {
//atributos
	String nombre;
	Tipo tipo;
	int nivelVida; // 0 nokeado, 1000 vida maxima 
	int velocidad; // 0 mas lento a 100 mas rapido
	int poderDaño;
	int poderDefensa;
//constructor
	public Pokemon(Tipo t,String n , int nv, int v, int pda, int pde) {
	this.nombre = n;
	this.tipo = t;
	this.nivelVida = nv;
	this.velocidad = v;
	this.poderDaño = pda;
	this.poderDefensa = pde;
	}
//metodos
	public int atacar() {
		int valor = (int) (Math.random()*100 % this.poderDaño) +1;
		return valor;
	}
	public boolean esquivar() {
		int valor = (int) (Math.random()*100 % 2) +1;
		if(valor == 0) {
			return true;
		}else {
			return false;
		}
	}
	public void setVida(int v) {
		this.nivelVida = v;
	}
	public int getVida() {
		return this.nivelVida;
	}
	public String pokedex() {
		return "Nombre: " + nombre 
				+ " Tipo: " + tipo
				+ " Nivel de vida: " + nivelVida
				+ " Velocidad: " + velocidad
				+ "Daño" + poderDaño
				+ "Defensa" + poderDefensa;
				
	}
}
