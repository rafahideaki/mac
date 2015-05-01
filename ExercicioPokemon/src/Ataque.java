
public class Ataque {
	private int dano;
	private int prioridade;
	private String nome;
	
	public Ataque(int dano,int prioridade,String nome){
		this.dano = dano;
		this.prioridade = prioridade;
		this.nome = nome;
		System.out.println("Mudei");
	}
	
	
	public void ataca(Pokemon adversario){
		adversario.DiminuiHp(this.dano);
		System.out.println(adversario.getNome() + " used "+this.nome+ "!");
	}
	
	public int getPrioridade(){
		return this.prioridade;
	}
	


}
