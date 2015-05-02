
public class Item {
	private String nome;
	private int cura;
	
	
	public String getNome(){
		return this.nome;
	}
	
	public Item(String nome, int cura){
		this.nome = nome;
		this.cura = cura;
	}
	
	
	public void usar(Pokemon pokemon){
		pokemon.AumentaHp(this.cura);
		System.out.println(pokemon.getNome()+"'s HP was restored by "+this.cura+" point(s).");
	}
	

	

	

}
