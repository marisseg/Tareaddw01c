package senati.ddw.ciclo3.tareaddw01c;

public class ImplementarPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Dni \t Nombre Apellido Sexo Edad");
		System.out.println("\n --------------------------------");
		Ejercicio001 p=new Ejercicio001 ("25782211","Jorge","Luque",'M',44);
		Ejercicio001 p1=new Ejercicio001 ("25782211","Freddy","Morgan",'M',22);
		Ejercicio001 p2 = new Ejercicio001(p);
		Ejercicio001 p3 = new Ejercicio001();
		System.out.println(" " + p.toString());
		System.out.println(" " + p1.toString());
		System.out.println(" " + p2.toString());
		System.out.println(" " + p3.toString());
	}

}
