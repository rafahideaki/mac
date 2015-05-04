


public class Pokemon {
	private String nome;
	private int hp,hpMax;
	private Ataque ataques[]= new Ataque[4];
	private boolean ativo = false;
	private String tipo[];
	
	
	
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
	
	
	
	public int getHp(){
		return hp;
	}
	
	public Ataque[] getAtaques(){
		return ataques;
	}
	
	public void AumentaHp(int cura){
		this.hp += cura;
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
	
	
	
	public void AumentaHp(int cura){
		this.hp += cura;
		if (hp > hpMax){
			hp = hpMax;
		}
	}
	
	public void DiminuiHp(int dano, Pokemon pokemon, String tipoAtaque){
		int dano_total;
		if(pokemon.getTipo2() == " "){
			dano_total = dano*this.identificaFraqueza1(pokemon, tipoAtaque);
		} else{ dano_total = dano*this.identificaFraqueza1(pokemon, tipoAtaque)*this.identificaFraqueza2(pokemon, tipoAtaque);
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
	
	
	
	public int identificaFraqueza1(Pokemon pokemon, String ataque){
		if (ataque == "Normal"){
			if (pokemon.getTipo() == "Rock" || pokemon.getTipo() == "Steel"){
				return 1/2;
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
				return 1/2;
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
				return 1/2;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Poison"){
			if (pokemon.getTipo() == "Grass" || pokemon.getTipo() == "Fairy"){
				return 2;	
			} else if (pokemon.getTipo() == "Poison" || pokemon.getTipo() == "Ground" || pokemon.getTipo() == "Rock"
					                                 || pokemon.getTipo() == "Ghost"){
				return 1/2;
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
				return 1/2;
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
				return 1/2;
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
				return 1/2;
			} else {
				return 1;
			}
		}
		
		if (ataque == "Ghost"){
			if (pokemon.getTipo() == "Ghost" || pokemon.getTipo() == "Psychic"){
				return 2;	
			} else if (pokemon.getTipo() == "Dark"){
				return 1/2;
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
				return 1/2;
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
				return 1/2;
			} else {
				return 1;
			}
		}
	}
}
