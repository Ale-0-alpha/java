package Persona;

public class Persona {
//Comentario 1: Declaracion de atributos privados para encapsular los datos
	private int cedula;
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, int cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	//Comentario 2: Constructor que inicializa solo la cedula y agrega valores por defecto a nombre y apellido
	public Persona(int c) {
		setCedula(c);
		nombre = new String("Desconocido");
		apellido = new String("Desconocido");
	}
public Persona(int c, String n, String a)
{
	setCedula(c);
	setNombre(n);
	setApellido(a);
}

//comentario 3:Metodo para validar que la cedula es valida 
	public void setCedula(int c) {
		if(c > 500000) cedula = c;
		else c = 0;
	}

//Comentario 4: Metodo utilizado para validar que el nombre no esta vacio
	public void setNombre(String n) {
		if (n.equals(""))
	{
			System.out.println("Nombre no valido, se asigno Desconocido");
			nombre = new String("Desconocido");
	}
		else nombre =n;
}
public void setApellido(String a) {
	if (a.equals(""))
	{
		System.out.println("Apellido no valido, se asigno desconocido");
		apellido = new String("Desconocido");
	}
	else apellido = a;
}

public int getCedula() {return cedula;}

public String getNombre() {return nombre;}

public String getApellido() {return apellido;}
	
//Comentariio 5:Metodo toString, representa los datos como una cadena
@Override
	public String toString() {
		return cedula + "," + nombre + "," + apellido;
	}
}
	


