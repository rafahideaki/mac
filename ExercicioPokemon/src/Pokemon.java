
public class Pokemon {
	private String nome;
	private int hp,hpMax;
	private Ataque ataques[]= new Ataque[4];
	private boolean ativo = false;
	
	
	public Pokemon(String nome,int hp, Ataque ataque1, Ataque ataque2, Ataque ataque3, Ataque ataque4){
		this.nome = nome;
		this.hp = hp;
		this.hpMax = hp;
		this.ataques[0] = ataque1;
		this.ataques[1] = ataque2;
		this.ataques[2] = ataque3;
		this.ataques[3] = ataque4;
	}
	public int getHp(){
		return hp;
	}
	
	public void AumentaHp(int cura){
		this.hp += cura;
	}
	
	public void DiminuiHp(int dano){
		this.hp -= dano;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void AtivaPokemon(){
		this.ativo = true;
	}
	
	public void DesativaPokemon(){
		this.ativo = false;
	}
	
	public String mostraAtaques(){
		String lista = ("(1)" + this.ataques[0] + " / (2) " + this.ataques[1] +
				        " / (3) " + this.ataques[2] + " / (4) " + this.ataques[3]);
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
	
}
