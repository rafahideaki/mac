import java.util.Scanner;

public class Main {

	public int leTeclado() {
		int numero;
		Scanner sc1 = new Scanner(System.in);
		numero = sc1.nextInt();
		sc1.close();
		return numero;
	}
}
