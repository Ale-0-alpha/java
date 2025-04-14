package pokemon;

public class Test {
	public static void main(String[] args) {
		Tipo terra = new Tipo("Tierra");
		Tipo aqua = new Tipo("Agua");
		Pokemon groudon = new Pokemon(terra,"Groudon", 230,25,30,36);
		Pokemon kyogre = new Pokemon(aqua,"Kyogre", 235,23,30,24);
		
		//arranca el torneo
		Combate enfrentamientoMilenario = new Combate(groudon, kyogre);
		
		enfrentamientoMilenario.iniciar();
	}

}
