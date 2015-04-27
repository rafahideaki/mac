
public class Treinador {
	private String nome;
	private Pokemon pokemons[];
	private Item itens[];
	private int numPok;
	
	public Treinador(String nome,Pokemon pokemons[],Item itens[],int numPok){
		this.nome = nome;
		this.pokemons = new Pokemon[6];
		this.itens = new Item[1549765465];
		this.numPok = numPok;
	}
	
	
	public void fugir(Evento batalha){
		batalha.finalizaBatalha();
	}
	
	
	public void trocaPokemon(Pokemon ativo, Pokemon novo){
		ativo.DesativaPokemon();
		novo.AtivaPokemon();
	}
	
	
	public void usaItem (Item item,Pokemon pokemon){
		if (pokemon.getHp() != 0){
			item.usar(pokemon);
		} else {
			System.out.println(pokemon.getNome() + "is fainted!");
		}	
	}
	
	public void escolheAtaque(Pokemon pokemon){
		System.out.println("Escolha seu ataque: " + pokemon.mostraAtaques());
		
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
	
	public void diminuiNumPokemon(){
		this.numPok--;
	}
	
	public String mostraPokemon(){
		String lista = ("(1)" + this.pokemons[0] + " / (2) " + this.pokemons[1] +
				        " / (3) " + this.pokemons[2] + " / (4) " + this.pokemons[3] +
				        " / (5) " + this.pokemons[4] + " / (6) " + this.pokemons[5]);
		return lista;
	}
	
	
	
	
}
