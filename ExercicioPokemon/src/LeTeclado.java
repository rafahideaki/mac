
import java.util.Scanner;


public class LeTeclado {
	int numero;
	String texto;
	
	public int leTeclado() {
		Scanner sc1 = new Scanner(System.in); 
		this.numero = sc1.nextInt();
		sc1.close();
		return this.numero;
	}
	
}
