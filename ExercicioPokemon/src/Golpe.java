


public class Golpe {
	private int dano;    
	private int prioridade;
	private String nome;
	private String tipo;
	
	
	
	public Golpe(int dano,int prioridade,String nome, String tipo){
		this.dano = dano;
		this.prioridade = prioridade;
		this.nome = nome;
		this.tipo = tipo;
	}
	

	
	public void ataca(Pokemon ativo,Pokemon adversario){
		System.out.println(" ");
		System.out.println(ativo.getNome() + " used "+this.nome+ "!");
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		adversario.DiminuiHp(dano, adversario, tipo);
		

	}
	
	
	
	public int getPrioridade(){
		return this.prioridade;
	}
	
	public String getNome(){
		return this.nome;
	}

	public String getTipo(){
		return this.tipo;
	}
}
