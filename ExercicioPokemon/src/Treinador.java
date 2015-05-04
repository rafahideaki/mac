


public class Treinador {
	private String nome;
	private Pokemon pokemons[]= new Pokemon[6];
	private Item itens[] = new Item[4];
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
		System.out.println(ativo.getNome() + " that's enough! Come back! Go " + novo.getNome());
	}
		
	public void usaItem (Item item,Pokemon pokemon){
		if (pokemon.getHp() != 0){
			item.usar(pokemon);
		} else {
			System.out.println(pokemon.getNome() + "is fainted! Choose another pokemon to heal");
		}	
	}
	
	
	
	
	public void escolheAtaque(Pokemon pokemon){
		System.out.println("Choose your move: " + pokemon.mostraAtaques());
	}
	
	public void escolheItem(){
		System.out.println("Choose your item: (1) " + Listas.HyperPotion.getNome() + " (2) " + Listas.SuperPotion.getNome()+
							" (3) " + Listas.Potion.getNome()  + " (4) " + Listas.FullRestore.getNome());
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
