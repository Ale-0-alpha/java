package pokemon;

public class Combate {
	Pokemon p1;
	Pokemon p2;
	public Combate(Pokemon p1, Pokemon p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
public void iniciar() {
	int turno = 1; //1 p1, 2 p2
	while(true) {
		
		if(p1.nivelVida <= 0 || p2.nivelVida <= 0);
		if(p1.nivelVida > p2.nivelVida ) {
			System.out.println("Ganador: " + p1.nombre);
		}else if(p1.nivelVida < p2.nivelVida ) {
			System.out.println("Ganador: " + p2.nombre);
	}else {
		System.out.println("Empate");
	}
		break;
	}
	//realizar combate
	if(turno == 1) {
		System.out.println("Ataca " + p1.nombre);
		p1.nivelVida = p1.nivelVida - p2.atacar();
		turno = 2;
	}else {
		System.out.println("Ataca " + p2.nombre);
		p2.nivelVida = p2.nivelVida - p1.atacar();
		turno = 1;
	}
	//thread.sleep(1000);
}

}//fin while
