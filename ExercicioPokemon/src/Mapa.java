import java.util.Random;


public class Mapa {
	static int mapa[][]= new int[][] {
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
							{0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1},
							{0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1},
							{0,0,1,1,1,1,1,1,1,1,1,0,0,0,1,1,0,0,0,0,1,1},
							{0,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,0,0,1,1},
							{0,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,0,0,0,0},
							{0,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,0,0,0,0},
							{0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0},
							{0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0},
							{0,0,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
							{0,0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0},
							{0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	public boolean taNoMato (int x, int y){
		if (mapa[x][y] == 1){
			return true;
		} else {
			return false;
		}
	}
	
	public void mostraMapa(int x,int y){
		int antigo = mapa[x][y];
		mapa[x][y]=2;
		int i,j;
		for (i = 0; i < 15; i++){
			if (i > 0){
				System.out.println("");
			}
			for (j = 0;j < 22;j++){
				if (mapa[i][j] == 0){
					System.out.print("█");
				} else if (mapa[i][j] == 1){
					System.out.print("*");
				} else {
					System.out.print("T");
				}
			}
		}

		System.out.println("");
		System.out.println("");
		mapa[x][y] = antigo;
	}
	
	public boolean achaPokemon(){
		Random gerador = new Random();
		int numero = gerador.nextInt(101);
		if (numero < 50){
			return true;
		} else {
			return false;
		}
	}
	
	public Pokemon definePokemon(){
		Random gerador = new Random();
		int numero = gerador.nextInt(29);
		Pokemon pokemon = Listas.listaPokemons[numero];
		return pokemon;
	}
	
	
	
}