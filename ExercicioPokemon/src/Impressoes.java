import java.util.Scanner;


public class Impressoes {
	public void imprimeOpcoes(Pokemon pokemon){
		int i;
		System.out.println("+----------------------------------+----------------------+");
		System.out.println("|What will                         |(1)FIGHT     (2)BAG   |");
		System.out.print("|" + pokemon.getNome() + " do?");
		for (i = 0;i < 30-pokemon.getNome().length();i++){
			System.out.print(" ");
		}
		System.out.println("|(3)POKEMON   (4)RUN   |");
		System.out.println("+----------------------------------+----------------------+");
	}

	public void imprimePokemon(Pokemon pokemon){
		int i,numDigHp = 0,numDigHpMax = 0;
		int hpAux = pokemon.getHp();
		int hpMaxAux = pokemon.getHpMax();
		
		while (hpAux != 0){
			hpAux /= 10;
			numDigHp ++;
		}
		while (hpMaxAux != 0){
			hpMaxAux /= 10;
			numDigHpMax++;
		}
		System.out.println("                                   +----------------------+");
		System.out.printf("                                   |"+pokemon.getNome());
		for (i = 0;i <  18-pokemon.getNome().length();i++){
			System.out.printf(" ");
		}
		System.out.println("Lv.X|");
		
		System.out.printf("                                   |");
		for (i = 0;i< 17-numDigHp-numDigHpMax;i++){
			System.out.printf(" ");
		}
		System.out.println("HP("+pokemon.getHp()+"/"+pokemon.getHpMax()+")|");
	}
	
	public void imprimePokemonSelvagem(Pokemon pokemon){
		int i;
		System.out.println("+---------------------------------------------------------+");
		System.out.printf("|Wild "+ pokemon.getNome()+" appeared!");
		for (i = 0; i < 42 - pokemon.getNome().length(); i ++){
			System.out.printf(" ");
		}
		System.out.println("|");
		System.out.println("|                                                         |");
		System.out.println("+---------------------------------------------------------+");
	}
	
	public void imprimePokemonTreinador(Pokemon pokemon){
		int i;
		System.out.println("+---------------------------------------------------------+");
		System.out.printf("|Go "+ pokemon.getNome()+"!");
		for (i = 0; i < 53 - pokemon.getNome().length(); i ++){
			System.out.printf(" ");
		}
		System.out.println("|");
		System.out.println("|                                                         |");
		System.out.println("+---------------------------------------------------------+");
	}
	
	
	public void imprimeAtaques(Pokemon pokemon){
		int i;
		System.out.println("+----------------------------------+----------------------+");
		System.out.printf("|(1)"+pokemon.getAtaques()[0].getNome());
		for (i = 0;i < 14-pokemon.getAtaques()[0].getNome().length();i++){
			System.out.printf(" ");
		}
		System.out.printf("(2)"+pokemon.getAtaques()[1].getNome());
		for (i = 0;i < 14-pokemon.getAtaques()[1].getNome().length();i++){
			System.out.printf(" ");
		}
		System.out.println("|   FIGHT        BAG   |");
		System.out.printf("|(3)"+pokemon.getAtaques()[2].getNome());
		for (i = 0;i < 14-pokemon.getAtaques()[2].getNome().length();i++){
			System.out.printf(" ");
		}
		System.out.printf("(4)"+pokemon.getAtaques()[3].getNome());
		for (i = 0;i < 14-pokemon.getAtaques()[3].getNome().length();i++){
			System.out.printf(" ");
		}
		System.out.println("|   POKEMON      RUN   |");
		System.out.println("+----------------------------------+----------------------+");
	}
	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String texto;
		
		Impressoes im = new Impressoes();
		im.imprimeAtaques(Listas.Alakazam);
		im.imprimePokemonSelvagem(Listas.Magikarp);
		texto = sc.nextLine();
		im.imprimePokemonTreinador(Listas.Alakazam);
		texto = sc.nextLine();
		im.imprimePokemon(Listas.Alakazam);
		im.imprimeOpcoes(Listas.Alakazam);
		
	}
}
