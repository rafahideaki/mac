


public class Ataque {
	private int dano;
	private int prioridade;
	private String nome;
	private String tipo;
	
	
	
	public Ataque(int dano,int prioridade,String nome, String tipo){
		this.dano = dano;
		this.prioridade = prioridade;
		this.nome = nome;
		this.tipo = tipo;
	}
	

	
	public void ataca(Pokemon ativo,Pokemon adversario){
		adversario.DiminuiHp(dano, adversario, tipo);

		System.out.println(ativo.getNome() + " used "+this.nome+ "!");
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
