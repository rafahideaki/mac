


public class Item {
	private String nome;
	private int cura;
	
	
	
	public Item(String nome, int cura){
		this.nome = nome;
		this.cura = cura;
	}
	
	
	
	public void usar(Pokemon pokemon){
		int pt_cura;
		if (cura + pokemon.getHp() > pokemon.getHpMax()){
			pt_cura = pokemon.getHpMax() - pokemon.getHp();
		} else{
			pt_cura = cura;
		}
		pokemon.AumentaHp(this.cura);
		System.out.println(pokemon.getNome()+"'s HP was restored by "+pt_cura+" point(s).");
	}
	

	
	public String getNome(){
		return this.nome;
	}
}

