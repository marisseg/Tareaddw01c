package senati.ddw.ciclo3.tareaddw01c;

public class Numero {
	public double Num;
	public Numero() {
		super();
	}
	public Numero(double num) {
		super();
		Num = num;
		}
	public String Primo() {
		String men;
		int a=0;
		for(double i=1;i<=Num;i++) {
			if (Num % i  == 0) {
				a++;
		}
		}
		if (a==2) {
			men="N�mero es primo";
			}else {
				men="N�mero no es primo";
				}
		return men;
		}
	public String Perfecto() {
		String men;
		double a=0;
		for (double i=1;i<Num;i++) {
			if (Num % i == 0) {
				a = a + i;
				}
			}
		if (a==Num) 
		{men="N�mero es perfecto";}
		else {men="N�mero no es perfecto";
		}
		return men;}
	public double Factorial() {
		double fac=1;
		while (Num != 0) {
			fac = fac * Num;
			Num--;
		}
		return fac;
		}
}
