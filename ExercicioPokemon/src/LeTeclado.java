
import java.util.Scanner;


public class LeTeclado {
	int numero;
	String texto;
	
	public int leTecladoInteiro() {
		Scanner sc1 = new Scanner(System.in); 
		this.numero = sc1.nextInt();
	
		return numero;
	}
	
	public String leTecladoString() {
		Scanner sc1 = new Scanner(System.in);
		this.texto = sc1.nextLine();
		return texto;
	}
	
	
}
