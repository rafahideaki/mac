


public class Treinador {
	private String nome;
	private Pokemon pokemons[]= new Pokemon[6];
	private Item itens[] = new Item[5];
	private int numPok;
	private int ownPok;
	private int posicaox = 0, posicaoy = 0;
	
	
	
	public Treinador(String nome,Pokemon pokemons[],Item itens[],int numPok){
		this.nome = nome;
		this.pokemons = pokemons;
		this.itens = itens;
		this.numPok = numPok;
		this.ownPok = numPok;
	}
	 
	
	
	public void fugir(Evento batalha){
		batalha.finalizaBatalha();
	}
		
	public void trocaPokemon(Pokemon ativo, Pokemon novo){
		ativo.DesativaPokemon();
		novo.AtivaPokemon();
		System.out.println(" ");
		System.out.println(ativo.getNome() + " that's enough! Come back! Go " + novo.getNome());
		System.out.println(" ");
		System.out.println("--------------------------------------------");
	}
		
	public void usaItem (Item item,Pokemon pokemon){
		if (pokemon.getHp() != 0){
			item.usar(pokemon);
		} else {
			System.out.println(" ");
			System.out.println(pokemon.getNome() + "is fainted! Choose another pokemon to heal");
			System.out.println(" ");
			System.out.println("--------------------------------------------");
		}	
	}
	
	
	public Pokemon getAtivo( Treinador treinador){
		int i;
		for(i = 0; i < treinador.getListaPok().length; i ++){
			if(treinador.getNumPokemon() > 0){
				if(treinador.getListaPok()[i].getAtivo() == true){
					return treinador.getListaPok()[i];
				}
		    }				
		}
		return Listas.Charizard;
	}
	
	
	public void escolheAtaque(Pokemon pokemon){
		System.out.println(" ");
		System.out.println("Choose your move: " + pokemon.mostraAtaques());
		System.out.println(" ");
		System.out.println("--------------------------------------------");
	}
	
	public void escolheItem(int tipoBatalha){
		if (tipoBatalha == 1){
			System.out.println("Choose your item: (1) " + Listas.HyperPotion.getNome() + " (2) " + Listas.SuperPotion.getNome()+
								" (3) " + Listas.Potion.getNome()  + " (4) " + Listas.FullRestore.getNome()+
								" (5) " + Listas.PokeBall.getNome());
		
		}
		if (tipoBatalha == 2){
			System.out.println(" ");
			System.out.println("Choose your item: ");
			System.out.println(" (1) " + Listas.HyperPotion.getNome() + " (2) " + Listas.SuperPotion.getNome());
			System.out.println(" (3) " + Listas.Potion.getNome()  + " (4) " + Listas.FullRestore.getNome());
			System.out.println(" ");
			System.out.println("--------------------------------------------");
		
		}
	}
	
	public void diminuiNumPokemon(){
		this.numPok--;
	}
	
	
	
	public int getNumPokemon(){
		return this.numPok;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Pokemon[] getListaPok(){
		return this.pokemons;
	}
	
	public int getPosicaoX(){
		return this.posicaox;
	}
	
	public int getPosicaoY() {
		return this.posicaoy;
	}
	
	public void andaDireita(){
		if (this.posicaox < 21) {
			this.posicaox ++;
		} else {
			System.out.println("You cannot do this!");
		}
	}
	
	public void andaEsquerda(){
		if (this.posicaox > 0) {
			this.posicaox --;
		} else {
			System.out.println("You cannot do this!");
		}
	}
	
	public void andaBaixo() {
		if (this.posicaoy < 14) {
			this.posicaoy ++;
		} else {
			System.out.println("You cannot do this!");
		}
	}
	
	public void andaCima() {
		if (this.posicaoy > 0) {
			this.posicaoy --;
		} else {
			System.out.println("You cannot do this!");
		}
	}
	
	
	
	public String mostraPokemon(){
		String lista;
		if (this.ownPok == 1){
			lista = ("(1)" + this.pokemons[0].getNome());
		} else if (this.ownPok == 2){
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome());
		} else if (this.ownPok == 3){
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome() +
		        	" / (3) " + this.pokemons[2].getNome());
		} else if (this.ownPok == 4){
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome() +
		        	" / (3) " + this.pokemons[2].getNome() + " / (4) " + this.pokemons[3].getNome());
		} else if (this.ownPok == 5){
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome() +
		        	" / (3) " + this.pokemons[2].getNome() + " / (4) " + this.pokemons[3].getNome() +
		        	" / (5) " + this.pokemons[4].getNome());
		} else {
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome() +
		        	" / (3) " + this.pokemons[2].getNome() + " / (4) " + this.pokemons[3].getNome() +
		        	" / (5) " + this.pokemons[4].getNome() + " / (6) " + this.pokemons[5].getNome());
		}
		
		System.out.println(lista);
		return lista;
	}
}
