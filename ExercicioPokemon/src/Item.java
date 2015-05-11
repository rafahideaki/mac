import java.util.Random;




public class Item {
	private String nome;
	private int cura;
	
	
	
	public Item(String nome, int cura){
		this.nome = nome;
		this.cura = cura;
	}
	
	
	
	public void usar(Pokemon pokemon){
		int pt_cura;
		if ((this.cura + pokemon.getHp()) > pokemon.getHpMax()){
			pt_cura = pokemon.getHpMax() - pokemon.getHp();
		} else{
			pt_cura = this.cura;
		}
		pokemon.AumentaHp(this.cura);
		System.out.println(" ");
		System.out.println(pokemon.getNome()+"'s HP was restored by "+pt_cura+" point(s).");
		System.out.println(" ");
		System.out.println("--------------------------------------------");
	}
	
	public boolean capturaPok(Pokemon pokemon){
		Random gerador = new Random();
		int numRandom = gerador.nextInt(101);
		if(numRandom > (100-(pokemon.getHp()/pokemon.getHpMax())*100)){
			return false;
		} else {
			return true;
		}
	}
	

	
	public String getNome(){
		return this.nome;
	}
}

