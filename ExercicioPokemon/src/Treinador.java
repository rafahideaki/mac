
public class Treinador {
	private String nome;
	private Pokemon pokemons[]= new Pokemon[6];
	private Item itens[] = new Item[4];
	private int numPok;
	
	public Treinador(String nome,Pokemon pokemons[],Item itens[],int numPok){
		this.nome = nome;
		this.pokemons = pokemons;
		this.itens = itens;
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
		System.out.println("Chegou");
		System.out.println(this.numPok);
		String lista;
		if (this.numPok == 1){
			lista = ("(1)" + this.pokemons[0].getNome());
		} else if (this.numPok == 2){
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome());
		} else if (this.numPok == 3){
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome() +
		        	" / (3) " + this.pokemons[2].getNome());
		} else if (this.numPok == 4){
			lista = ("(1)" + this.pokemons[0].getNome() + " / (2) " + this.pokemons[1].getNome() +
		        	" / (3) " + this.pokemons[2].getNome() + " / (4) " + this.pokemons[3].getNome());
		} else if (this.numPok == 5){
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
