package senati.ddw.ciclo3.tareaddw01c;

public class Ejercicio001 {
	public String dni;
	public String nombre;
	public String apellido;
	public char sexo;
	public int edad;
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param sexo
	 * @param edad
	 */
	
	public Ejercicio001(String dni, String nombre, String apellido, char sexo, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
	}
	/**
	 * 
	 */
	
	public Ejercicio001() {
		this.dni = "-------------";
		this.nombre = "-------------";
		this.apellido = "-------------";
		this.sexo = '-';
		this.edad = 0;
	}
	/**
	 * 
	 * @param p
	 */
	public Ejercicio001(Ejercicio001 p) {
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.apellido = p.apellido;
		this.sexo = p.sexo;
		this.edad = p.edad;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Ejercicio001 [dni=" + dni+ ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad="+ edad + "]";
	}
}
