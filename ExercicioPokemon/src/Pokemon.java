import java.util.Random;




public class Pokemon {
	private String nome;
	private int hp,hpMax;
	private Ataque ataques[]= new Ataque[4];
	private boolean ativo = false;
	private String tipo[] = new String[2];
	
	
	
	public Pokemon(String nome,int hp, String tipo1, String tipo2, Ataque ataque1, Ataque ataque2, Ataque ataque3, Ataque ataque4){
		this.nome = nome;
		this.hp = hp;
		this.hpMax = hp;
		this.tipo[0] = tipo1;
		this.tipo[1] = tipo2;
		this.ataques[0] = ataque1;
		this.ataques[1] = ataque2;
		this.ataques[2] = ataque3;
		this.ataques[3] = ataque4;
	}
	
	public Pokemon(String nome,int hp, String tipo1, Ataque ataque1, Ataque ataque2, Ataque ataque3, Ataque ataque4){
		this.nome = nome;
		this.hp = hp;
		this.hpMax = hp;
		this.tipo[0] = tipo1;
		this.tipo[1] = " ";
		this.ataques[0] = ataque1;
		this.ataques[1] = ataque2;
		this.ataques[2] = ataque3;
		this.ataques[3] = ataque4;
	}
	
	
	
	public int getHp(){
		return hp;
	}
	
	public Ataque[] getAtaques(){
		return ataques;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getHpMax(){
		return hpMax;
	}
	
	public String getTipo(){
		return tipo[0];
	}
	
	public String getTipo2(){
		return tipo[1];
	}
	
	public boolean getAtivo(){
		return this.ativo;
	}
	
	
	
	public void AumentaHp(int cura){
		this.hp += cura;
		if (hp > hpMax){
			hp = hpMax;
		}
	}
	
	public void DiminuiHp(int dano, Pokemon pokemon, String tipoAtaque){
		int dano_total;
		if(pokemon.getTipo2() == " "){
			dano_total = (int)(dano*this.identificaFraqueza1(pokemon, tipoAtaque));
			if (identificaFraqueza1(pokemon, tipoAtaque) == 2){
				System.out.println("It's super effective!");
			}
			if (identificaFraqueza1(pokemon, tipoAtaque) == 1/2){
				System.out.println("It's not very effective...");
			}
		} else{ dano_total = (int)((dano*this.identificaFraqueza1(pokemon, tipoAtaque)*this.identificaFraqueza2(pokemon, tipoAtaque)));
		    if (identificaFraqueza1(pokemon, tipoAtaque) == 2 || identificaFraqueza2(pokemon, tipoAtaque) == 2){
			    System.out.println("It's super effective!");
		    }
		    if (identificaFraqueza1(pokemon, tipoAtaque) == 1/2 || identificaFraqueza2(pokemon, tipoAtaque) == 1/2){
			    System.out.println("It's not very effective...");
		    }
		}
		this.hp -= dano_total;
		if (hp < 0){
			hp = 0;
		}
	}	
	
	public void AtivaPokemon(){
		this.ativo = true;
	}
	
	public void DesativaPokemon(){
		this.ativo = false;
	}
	
	public String mostraAtaques(){
		String lista = ("(1)" + this.ataques[0].getNome() + " / (2) " + this.ataques[1].getNome() +
				        " / (3) " + this.ataques[2].getNome() + " / (4) " + this.ataques[3].getNome());
		return lista;
	}
	
	public boolean verificaMorte(Treinador treinador){
		if(this.hp <= 0){
			this.DesativaPokemon();
			System.out.println(this.nome + " fainted!");
			treinador.diminuiNumPokemon();
			return true;
		} else {
			return false;
		}
	}
	
	public Ataque escolheAtaqueAleatório(){
		Random gerador = new Random();
		int numAtaque = gerador.nextInt(4);
		return this.ataques[numAtaque];
		
	}
	
	
	
	
	public double identificaFraqueza1(Pokemon pokemon, String ataque){
			
		if (ataque == "Normal"){
			if (pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Steel"){
				return 0.5;
			} else if (pokemon.getTipo() == "Ghost"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Fighting"){
			if (pokemon.getTipo() == "Normal" || pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Steel" 
					                          || pokemon.getTipo() == "Ice" || pokemon.getTipo() == "Dark"){
				return 2;	
			} else if (pokemon.getTipo() == "Flying" || pokemon.getTipo() == "Poison" || pokemon.getTipo() == "Bug"
					                                 || pokemon.getTipo() == "Psychic" || pokemon.getTipo() == "Fairy"){
				return 0.5;
			} else if (pokemon.getTipo() == "Ghost"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Flying"){
			if (pokemon.getTipo() == "Fighting" || pokemon.getTipo() == "Bug" || pokemon.getTipo() == "Grass"){
				return 2;	
			} else if (pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Steel" || pokemon.getTipo() == "Electric"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Poison"){
			if (pokemon.getTipo() == "Grass" || pokemon.getTipo() == "Fairy"){
				return 2;	
			} else if (pokemon.getTipo() == "Poison" || pokemon.getTipo() == "Ground" || pokemon.getTipo() == "Rock"
					                                 || pokemon.getTipo() == "Ghost"){
				return 0.5;
			} else if (pokemon.getTipo() == "Steel"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Ground"){
			if (pokemon.getTipo() == "Poison" || pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Steel" 
					                          || pokemon.getTipo() == "Fire" || pokemon.getTipo() == "Electric"){
				return 2;	
			} else if (pokemon.getTipo() == "Bug" || pokemon.getTipo() == "Grass"){
				return 0.5;
			} else if (pokemon.getTipo() == "FLying"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Rock"){
			if (pokemon.getTipo() == "Flying" || pokemon.getTipo() == "Bug" || pokemon.getTipo() == "Fire" 
					                          || pokemon.getTipo() == "Ice"){
				return 2;	
			} else if (pokemon.getTipo() == "Fighting" || pokemon.getTipo() == "Ground" || pokemon.getTipo() == "Steel"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Bug"){
			if (pokemon.getTipo() == "Grass" || pokemon.getTipo() == "Psychic" || pokemon.getTipo() == "Dark"){
				return 2;	
			} else if (pokemon.getTipo() == "Fighting" || pokemon.getTipo() == "Flying" || pokemon.getTipo() == "Poison"
					                                   || pokemon.getTipo() == "Ghost" || pokemon.getTipo() == "Steel"
					                                   || pokemon.getTipo() == "Fire" || pokemon.getTipo() == "Fairy"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Ghost"){
			if (pokemon.getTipo() == "Ghost" || pokemon.getTipo() == "Psychic"){
				return 2;	
			} else if (pokemon.getTipo() == "Dark"){
				return 0.5;
			} else if (pokemon.getTipo() == "Normal"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Steel"){
			if (pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Ice" || pokemon.getTipo() == "Fairy"){
				return 2;	
			} else if (pokemon.getTipo() == "Steel" || pokemon.getTipo() == "Fire" || pokemon.getTipo() == "Water" 
					                                || pokemon.getTipo() == "Electric"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Fire"){
			if (pokemon.getTipo() == "Bug" || pokemon.getTipo() == "Steel" || pokemon.getTipo() == "Grass" 
					                          || pokemon.getTipo() == "Ice"){
				return 2;	
			} else if (pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Fire" || pokemon.getTipo() == "Water"
					                               || pokemon.getTipo() == "Dragon"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Water"){
			if (pokemon.getTipo() == "Ground" || pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Fire"){
				return 2;	
			} else if (pokemon.getTipo() == "Water" || pokemon.getTipo() == "Grass" || pokemon.getTipo() == "Dragon"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Grass"){
			if (pokemon.getTipo() == "Ground" || pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Water"){
				return 2;	
			} else if (pokemon.getTipo() == "Flying" || pokemon.getTipo() == "Poison" || pokemon.getTipo() == "Bug"
					                                 || pokemon.getTipo() == "Stell" || pokemon.getTipo() == "Fire"
					                                 || pokemon.getTipo() == "Grass" || pokemon.getTipo() == "Dragon"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Electric"){
			if (pokemon.getTipo() == "Flying" || pokemon.getTipo() == "Water"){
				return 2;	
			} else if (pokemon.getTipo() == "Grass" || pokemon.getTipo() == "Electric" || pokemon.getTipo() == "Dragon")
				return 0.5;
			} else if (pokemon.getTipo() == "Ground"){
				return 0;
			} else {
				return 1;
		}
		
		if (ataque == "Psychic"){
			if (pokemon.getTipo() == "Fighting" || pokemon.getTipo() == "Poison"){
				return 2;	
			} else if (pokemon.getTipo() == "Steel" || pokemon.getTipo() == "Psychic")
				return 0.5;
	        } else if (pokemon.getTipo() == "Dark"){
				return 0;
			} else {
				return 1;
		}
		
		if (ataque == "Ice"){
			if (pokemon.getTipo() == "Flying" || pokemon.getTipo() == "Ground" || pokemon.getTipo() == "Grass"
					                          || pokemon.getTipo() == "Dragon"){
				return 2;	
			} else if (pokemon.getTipo() == "Steel" || pokemon.getTipo() == "Fire" || pokemon.getTipo() == "Water"
					                                 || pokemon.getTipo() == "Ice"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Dragon"){
			if (pokemon.getTipo() == "Dragon"){
				return 2;	
			} else if (pokemon.getTipo() == "Steel"){
				return 0.5;
			} else if (pokemon.getTipo() == "Fairy"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Dark"){
			if (pokemon.getTipo() == "Ghost" || pokemon.getTipo() == "Psychic"){
				return 2;	
			} else if (pokemon.getTipo() == "Fighting" || pokemon.getTipo() == "Dark" || pokemon.getTipo() == "Fairy"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Fairy"){
			if (pokemon.getTipo() == "Fighting" || pokemon.getTipo() == "Dragon" || pokemon.getTipo() == "Dark"){
				return 2;	
			} else if (pokemon.getTipo() == "Poison" || pokemon.getTipo() == "Steel" || pokemon.getTipo() == "Fire"){
				return 0.5;
			} else {
				return 1;
			}
		}
		return 1;
	}
	
	
	
	
	
	public double identificaFraqueza2(Pokemon pokemon, String ataque){
		
		if (ataque == "Normal"){
			if (pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Steel"){
				return 0.5;
			} else if (pokemon.getTipo2() == "Ghost"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Fighting"){
			if (pokemon.getTipo2() == "Normal" || pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Steel" 
					                          || pokemon.getTipo2() == "Ice" || pokemon.getTipo2() == "Dark"){
				return 2;	
			} else if (pokemon.getTipo2() == "Flying" || pokemon.getTipo2() == "Poison" || pokemon.getTipo2() == "Bug"
					                                 || pokemon.getTipo2() == "Psychic" || pokemon.getTipo2() == "Fairy"){
				return 0.5;
			} else if (pokemon.getTipo2() == "Ghost"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Flying"){
			if (pokemon.getTipo2() == "Fighting" || pokemon.getTipo2() == "Bug" || pokemon.getTipo2() == "Grass"){
				return 2;	
			} else if (pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Steel" || pokemon.getTipo2() == "Electric"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Poison"){
			if (pokemon.getTipo2() == "Grass" || pokemon.getTipo2() == "Fairy"){
				return 2;	
			} else if (pokemon.getTipo2() == "Poison" || pokemon.getTipo2() == "Ground" || pokemon.getTipo2() == "Rock"
					                                 || pokemon.getTipo2() == "Ghost"){
				return 0.5;
			} else if (pokemon.getTipo2() == "Steel"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Ground"){
			if (pokemon.getTipo2() == "Poison" || pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Steel" 
					                          || pokemon.getTipo2() == "Fire" || pokemon.getTipo2() == "Electric"){
				return 2;	
			} else if (pokemon.getTipo2() == "Bug" || pokemon.getTipo2() == "Grass"){
				return 0.5;
			} else if (pokemon.getTipo2() == "FLying"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Rock"){
			if (pokemon.getTipo2() == "Flying" || pokemon.getTipo2() == "Bug" || pokemon.getTipo2() == "Fire" 
					                          || pokemon.getTipo2() == "Ice"){
				return 2;	
			} else if (pokemon.getTipo2() == "Fighting" || pokemon.getTipo2() == "Ground" || pokemon.getTipo2() == "Steel"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Bug"){
			if (pokemon.getTipo2() == "Grass" || pokemon.getTipo2() == "Psychic" || pokemon.getTipo2() == "Dark"){
				return 2;	
			} else if (pokemon.getTipo2() == "Fighting" || pokemon.getTipo2() == "Flying" || pokemon.getTipo2() == "Poison"
					                                   || pokemon.getTipo2() == "Ghost" || pokemon.getTipo2() == "Steel"
					                                   || pokemon.getTipo2() == "Fire" || pokemon.getTipo2() == "Fairy"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Ghost"){
			if (pokemon.getTipo2() == "Ghost" || pokemon.getTipo2() == "Psychic"){
				return 2;	
			} else if (pokemon.getTipo2() == "Dark"){
				return 0.5;
			} else if (pokemon.getTipo2() == "Normal"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Steel"){
			if (pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Ice" || pokemon.getTipo2() == "Fairy"){
				return 2;	
			} else if (pokemon.getTipo2() == "Steel" || pokemon.getTipo2() == "Fire" || pokemon.getTipo2() == "Water" 
					                                || pokemon.getTipo2() == "Electric"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Fire"){
			if (pokemon.getTipo2() == "Bug" || pokemon.getTipo2() == "Steel" || pokemon.getTipo2() == "Grass" 
					                          || pokemon.getTipo2() == "Ice"){
				return 2;	
			} else if (pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Fire" || pokemon.getTipo2() == "Water"
					                               || pokemon.getTipo2() == "Dragon"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Water"){
			if (pokemon.getTipo2() == "Ground" || pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Fire"){
				return 2;	
			} else if (pokemon.getTipo2() == "Water" || pokemon.getTipo2() == "Grass" || pokemon.getTipo2() == "Dragon"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Grass"){
			if (pokemon.getTipo2() == "Ground" || pokemon.getTipo2() == "Rock" || pokemon.getTipo2() == "Water"){
				return 2;	
			} else if (pokemon.getTipo2() == "Flying" || pokemon.getTipo2() == "Poison" || pokemon.getTipo2() == "Bug"
					                                 || pokemon.getTipo2() == "Stell" || pokemon.getTipo2() == "Fire"
					                                 || pokemon.getTipo2() == "Grass" || pokemon.getTipo2() == "Dragon"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Electric"){
			if (pokemon.getTipo2() == "Flying" || pokemon.getTipo2() == "Water"){
				return 2;	
			} else if (pokemon.getTipo2() == "Grass" || pokemon.getTipo2() == "Electric" || pokemon.getTipo2() == "Dragon")
				return 0.5;
			} else if (pokemon.getTipo2() == "Ground"){
				return 0;
			} else {
				return 1;
		}
		
		if (ataque == "Psychic"){
			if (pokemon.getTipo2() == "Fighting" || pokemon.getTipo2() == "Poison"){
				return 2;	
			} else if (pokemon.getTipo2() == "Steel" || pokemon.getTipo2() == "Psychic")
				return 0.5;
	        } else if (pokemon.getTipo2() == "Dark"){
				return 0;
			} else {
				return 1;
		}
		
		if (ataque == "Ice"){
			if (pokemon.getTipo2() == "Flying" || pokemon.getTipo2() == "Ground" || pokemon.getTipo2() == "Grass"
					                          || pokemon.getTipo2() == "Dragon"){
				return 2;	
			} else if (pokemon.getTipo2() == "Steel" || pokemon.getTipo2() == "Fire" || pokemon.getTipo2() == "Water"
					                                 || pokemon.getTipo2() == "Ice"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Dragon"){
			if (pokemon.getTipo2() == "Dragon"){
				return 2;	
			} else if (pokemon.getTipo2() == "Steel"){
				return 0.5;
			} else if (pokemon.getTipo2() == "Fairy"){
				return 0;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Dark"){
			if (pokemon.getTipo2() == "Ghost" || pokemon.getTipo2() == "Psychic"){
				return 2;	
			} else if (pokemon.getTipo2() == "Fighting" || pokemon.getTipo2() == "Dark" || pokemon.getTipo2() == "Fairy"){
				return 0.5;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Fairy"){
			if (pokemon.getTipo2() == "Fighting" || pokemon.getTipo2() == "Dragon" || pokemon.getTipo2() == "Dark"){
				return 2;	
			} else if (pokemon.getTipo2() == "Poison" || pokemon.getTipo2() == "Steel" || pokemon.getTipo2() == "Fire"){
				return 0.5;
			} else {
				return 1;
			}
		}
	    return 1;
	}
}
