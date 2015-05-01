import java.util.Scanner;


public class Evento {
	private boolean fim = false;
	private int acao1,acao2;
	private int ataque1, ataque2;
	
	public static int leTeclado() {
		int numero;
		Scanner sc1 = new Scanner(System.in);
		numero = sc1.nextInt();
		sc1.close();
		return numero;
	}
	
	public void finalizaBatalha() {
		this.fim = true;
	}
	
	public void modificaAcao1(int escolha){
		this.acao1 = escolha;
	}
	
	public void modificaAcao2(int escolha){
		this.acao2 = escolha;
	}
	
	public void realizaAtaques (Ataque ataque1, Ataque ataque2,Pokemon pokemon1, 
			                    Pokemon pokemon2,Treinador treinador1, Treinador treinador2){
		
		if (ataque1.getPrioridade() >= ataque2.getPrioridade()) {
			ataque1.ataca(pokemon2);
			if(pokemon2.verificaMorte(treinador2) == true){
			    fim = this.verificaVitoria(treinador1, treinador2);
			} else {
				ataque2.ataca(pokemon1);
				pokemon1.verificaMorte(treinador1);
				fim = this.verificaVitoria(treinador2, treinador1);
			}
		} 
		else {
			ataque2.ataca(pokemon1);
			if (pokemon1.verificaMorte(treinador1) == true){
			    fim = this.verificaVitoria(treinador2, treinador1);
			} else {
				ataque1.ataca(pokemon2);
				pokemon2.verificaMorte(treinador2);
				fim = this.verificaVitoria(treinador1, treinador2);
			}
		}	
	}
	
	public boolean verificaVitoria(Treinador winner, Treinador looser){
		LeTeclado A = new LeTeclado();
		int num;
		if (looser.getNumPokemon() == 0){
			System.out.println(winner.getNome() + " wins the battle!");
			return true;
		} else {
			System.out.println(looser.getNome() + ", choose another pokemon: ");
			System.out.println(looser.mostraPokemon());
			num = A.leTeclado();
			looser.getListaPok()[num].AtivaPokemon();
			return false;
		}
	}
	
	
	public static void main(String[] args){
		Evento batalha = new Evento();
		Listas lista = new Listas();
		System.out.println("Trainer 1,Choose 6 pokemon !");
		lista.mostraListaPokemon();
		batalha.modificaAcao1(leTeclado());
		System.out.println("Trainer 2,Choose 6 pokemon");
		lista.mostraListaPokemon();
		batalha.modificaAcao2(leTeclado());
		
		
	}

	
	
	
}
