import java.util.Scanner;


public class Evento {
	static Scanner sc = new Scanner(System.in);
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
			num = A.leTecladoInteiro();
			looser.getListaPok()[num].AtivaPokemon();
			return false;
		}
	}
	
	public int[] stringParaListaInteiros(String string){
		int i;
		
		String certa[];
		certa = string.split(" ");
		int listaInteiros[] = new int[certa.length];
		
		for (i = 0;i<certa.length;i++){
			listaInteiros[i] =Integer.parseInt(certa[i]);
		}
		return listaInteiros;
	}
		
	public Treinador pegaDados(){
		String texto,nome;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println(nome + ",Choose 6 pokemon!");
		Listas.mostraListaPokemon(Listas.listaPokemons);
		texto = sc.nextLine();
		int listaInteiros[] = this.stringParaListaInteiros(texto);
		Pokemon[] listaPokTreinador = new Pokemon[6];
		this.putPokemons(listaInteiros, listaPokTreinador, Listas.listaPokemons);
		Treinador treinador1 = new Treinador("Ash",listaPokTreinador,Listas.listaItens,listaInteiros.length);
		return treinador1;
	
	}
	
	public void putPokemons(int[] listaEscolhas,Pokemon[] listaPokTreinador,Pokemon[] lista){
		int i;
		for(i = 0; i < listaEscolhas.length && listaEscolhas[i] != -1;i++ ){
			listaPokTreinador[i] = lista[listaEscolhas[i]];
		}
	}
	
	public void zerarLista(int[] listaEscolhas){
		int i;
		for (i = 0; i < listaEscolhas.length;i++){
			listaEscolhas[i] = -1;
		}
	}
	
	public void putItens(int[]listaEscolhas,Item[]listaItensTreinador,Item[] lista){
		int i;
		for(i = 0; i < listaEscolhas.length && listaEscolhas[i] != -1; i ++){
			listaItensTreinador[i] = lista[listaEscolhas[i]];
		}
	}
	
	


	public static void main(String[] args){
		Evento batalha = new Evento();
		
		
		Treinador treinador1 = batalha.pegaDados();
		Treinador treinador2 = batalha.pegaDados();

		
		sc.close();
		
		
	}

	
	
	
}
