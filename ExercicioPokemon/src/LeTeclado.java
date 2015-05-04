import java.util.Scanner;


public class LeTeclado {
	int numero;
	String texto;

	
	
	public int leTecladoInteiro() {
		Scanner A = new Scanner(System.in); 
		this.numero = A.nextInt();
	    A.close();
		return numero;
	}
	   
	public String leTecladoString() {
		Scanner A = new Scanner(System.in);
		this.texto = A.nextLine();
		A.close();
		return texto;
	}
}
