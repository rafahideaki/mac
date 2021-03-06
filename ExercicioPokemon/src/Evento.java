import java.util.Scanner;

public class Evento {
	static Scanner sc = new Scanner(System.in);
	private static boolean fim = false;
	private static int acao1, acao2;
	private static int ataque1, ataque2;
	private static Pokemon ativo1, ativo2;

	public static int leTeclado() {
		int numero;
		Scanner sc1 = new Scanner(System.in);
		numero = sc1.nextInt();
		sc1.close();
		return numero;
	}

	public void finalizaBatalha() {
		Evento.fim = true;
	}

	public void modificaAcao1(int escolha) {
		Evento.acao1 = escolha;
	}

	public void modificaAcao2(int escolha) {
		Evento.acao2 = escolha;
	}

	public void realizaAtaques(Golpe ataque1, Golpe ataque2, Pokemon pokemon1,
			Pokemon pokemon2, Treinador treinador1, Treinador treinador2) {

		if (ataque1.getPrioridade() >= ataque2.getPrioridade()) {
			ataque1.ataca(pokemon1, pokemon2);
			if (pokemon2.verificaMorte(treinador2) == true) {
				fim = Evento.verificaVitoria(treinador1, treinador2);
			} else {
				ataque2.ataca(pokemon2, pokemon1);
				if (pokemon1.verificaMorte(treinador1)) {
					fim = Evento.verificaVitoria(treinador2, treinador1);
				}
			}
		} else {
			ataque2.ataca(pokemon2, pokemon1);
			if (pokemon1.verificaMorte(treinador1) == true) {
				fim = Evento.verificaVitoria(treinador2, treinador1);
			} else {
				ataque1.ataca(pokemon1, pokemon2);
				if (pokemon2.verificaMorte(treinador2) == true) {
					fim = Evento.verificaVitoria(treinador1, treinador2);
				}
			}
		}
	}

	public static boolean verificaVitoria(Treinador winner, Treinador looser) {
		int num;
		if (looser.getNumPokemon() == 0) {
			System.out.println(" ");
			System.out.println(winner.getNome() + " wins the battle!");
			return true;
		} else {
			System.out.println(" ");
			System.out.println(looser.getNome() + ", choose another pokemon: ");
			System.out.println("--------------------------------------------");
			System.out.println(looser.mostraPokemon());
			System.out.println(" ");
			System.out.println("--------------------------------------------");
			num = sc.nextInt();
			looser.getListaPok()[num - 1].AtivaPokemon();
			return false;
		}
	}

	public int[] stringParaListaInteiros(String string) {
		int i;

		String certa[];
		certa = string.split(" ");
		int listaInteiros[] = new int[certa.length];

		for (i = 0; i < certa.length; i++) {
			listaInteiros[i] = Integer.parseInt(certa[i]);
		}
		return listaInteiros;
	}

	public Treinador pegaDados() {
		String texto, nome;

		System.out.println("What's your name?: ");
		nome = sc.nextLine();
		System.out.println(nome + ",Choose up to 6 pokemon!");
		Listas.mostraListaCompleta();
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		System.out.println("Ex 1: 1 2 3 4 5 6");
		System.out.println("Ex 2: 12 23 1 10 0");
		System.out.println("Ex 3: 17 21 1");
		System.out.println("Ex 4: 0 1 29 18 17");
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		texto = sc.nextLine();
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		int listaInteiros[] = this.stringParaListaInteiros(texto);
		Pokemon[] listaPokTreinador = new Pokemon[6];
		this.putPokemons(listaInteiros, listaPokTreinador, Listas.listaPokemons);
		Treinador treinador1 = new Treinador(nome, listaPokTreinador,
				Listas.listaItens, listaInteiros.length);
		return treinador1;

	}

	public Pokemon escolhePrimeiroPok(Treinador treinador) {
		System.out.println(" ");
		System.out.println(treinador.getNome() + ",choose your first Pokemon!");
		treinador.mostraPokemon();
		int escolha = sc.nextInt() - 1;
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		treinador.getListaPok()[escolha].AtivaPokemon();
		return treinador.getListaPok()[escolha];
	}

	public void putPokemons(int[] listaEscolhas, Pokemon[] listaPokTreinador,
			Pokemon[] lista) {
		int i;
		for (i = 0; i < listaEscolhas.length && listaEscolhas[i] != -1; i++) {
			listaPokTreinador[i] = lista[listaEscolhas[i]];
		}
	}

	public void zerarLista(int[] listaEscolhas) {
		int i;
		for (i = 0; i < listaEscolhas.length; i++) {
			listaEscolhas[i] = -1;
		}
	}

	public void putItens(int[] listaEscolhas, Item[] listaItensTreinador,
			Item[] lista) {
		int i;
		for (i = 0; i < listaEscolhas.length && listaEscolhas[i] != -1; i++) {
			listaItensTreinador[i] = lista[listaEscolhas[i]];
		}
	}

	public static void main(String[] args) {
		String texto;
		int escolha;
		Evento batalha = new Evento();
		Impressoes imp = new Impressoes();

		System.out.println("What do you want to play ?");
		System.out.println("(1) Single Player");
		System.out.println("(2) Multi Player");
		escolha = sc.nextInt();

		if (escolha == 1) {
			Mapa matriz = new Mapa();
			texto = sc.nextLine();
			Treinador treinador1 = batalha.pegaDados();
			while (escolha == 1) {
				matriz.mostraMapa(treinador1.getPosicaoY(),
						treinador1.getPosicaoX());
				System.out.println("What do you want to do ?");
				System.out.println("    +---+");
				System.out.println("    | W |    ");
				System.out.println("+---+---+---+");
				System.out.println("| A | S | D |");
				System.out.println("+---+---+---+");
				texto = sc.nextLine();
				if (texto.contains("A") || texto.contains("a")) {
					treinador1.andaEsquerda();
				}
				if (texto.contains("S") || texto.contains("s")) {
					treinador1.andaBaixo();
				}
				if (texto.contains("D") || texto.contains("d")) {
					treinador1.andaDireita();
				}
				if (texto.contains("W") || texto.contains("w")) {
					treinador1.andaCima();
				}
				if (matriz.taNoMato(treinador1.getPosicaoX(),
						treinador1.getPosicaoY())) {
					if (matriz.achaPokemon()) {
						matriz.mostraMapa(treinador1.getPosicaoY(),
								treinador1.getPosicaoX());
						Pokemon selvagem = matriz.definePokemon();
						Pokemon listaSelv[] = new Pokemon[] { selvagem };
						Item listaItem[] = new Item[0];

						Treinador treinador2 = new Treinador(
								selvagem.getNome(), listaSelv, listaItem, 1);
						int novo1 = 0, item1 = 0;

						int i = 0;
						while (treinador1.getListaPok()[i].getHp() == 0
								&& i < treinador1.getNumPokemon()) {
							i++;
						}
						ativo1 = treinador1.getListaPok()[i];
						ativo1.AtivaPokemon();
						// System.out.println("Wild " + selvagem.getNome()
						// + " appeared!");
						// System.out.println("Go! " + ativo1.getNome() + "!");
						imp.imprimePokemonSelvagem(selvagem);
						texto = sc.nextLine();
						imp.imprimePokemonTreinador(ativo1);
						texto = sc.nextLine();

						while (batalha.fim != true) {
							int k;

							for (k = 0; treinador1.getListaPok()[k].getAtivo() == false; k++)
								;
							ativo1 = treinador1.getListaPok()[k];
							// System.out.println(treinador1.getNome()
							// + ", What will " + Evento.ativo1.getNome() + "("
							// + Evento.ativo1.getHpMax() + "/" +
							// Evento.ativo1.getHp()
							// + ") do ?");
							// System.out.println("(1)FIGHT / (2)BAG / (3)POKEMON / (4)RUN ");

							imp.imprimePokemon(ativo1);
							imp.imprimeOpcoes(ativo1);
							Evento.acao1 = sc.nextInt();

							if (Evento.acao1 == 1) {
								// treinador1.escolheAtaque(Evento.ativo1);
								imp.imprimePokemon(ativo1);
								imp.imprimeAtaques(ativo1);

								Evento.ataque1 = sc.nextInt() - 1;
								batalha.realizaAtaques(
										Evento.ativo1.getAtaques()[Evento.ataque1],
										selvagem.escolheAtaqueAleatório(),
										ativo1, selvagem, treinador1,
										treinador2);
							} else if (Evento.acao1 == 2) {
								treinador1.escolheItem(1);
								item1 = sc.nextInt();
								if (item1 != 5) {
									System.out.println(treinador1.getNome()
											+ ", choose the pokemon to heal: ");
									treinador1.mostraPokemon();
									novo1 = sc.nextInt() - 1;
									Listas.listaItens[item1 - 1]
											.usar(treinador1.getListaPok()[novo1]);
								} else if (item1 == 5) {
									if (Listas.PokeBall.capturaPok(selvagem)) {
										System.out.println("Gotcha!");
										System.out.println(selvagem.getNome()
												+ " was caught!");
										batalha.finalizaBatalha();
										i = 0;
										while (treinador1.getListaPok()[i] != null
												&& i < 6) {
											i++;
										}
										if (i != 6) {
											treinador1.getListaPok()[i] = selvagem;
											Listas.FullRestore.usar(selvagem);
										}
									} else {
										System.out.println("Aww!");
										System.out
												.println("It appeared to be caught!");
										selvagem.escolheAtaqueAleatório().ataca(
												selvagem, ativo1);
									}

								}

								
								if (ativo1.verificaMorte(treinador1) == true) {
									Evento.fim = Evento.verificaVitoria(
											treinador2, treinador1);
								}

							} else if (Evento.acao1 == 3) {
								System.out
										.println(treinador1.getNome()
												+ ", choose another pokemon to battle: ");
								treinador1.mostraPokemon();
								novo1 = sc.nextInt() - 1;
								treinador1.trocaPokemon(ativo1,
										treinador1.getListaPok()[novo1]);
								ativo1 = treinador1.getListaPok()[novo1];
								selvagem.escolheAtaqueAleatório().ataca(
										selvagem, ativo1);
								if (ativo1.verificaMorte(treinador1) == true) {
									Evento.fim = Evento.verificaVitoria(
											treinador2, treinador1);
								}
							} else {
								System.out.println("Got away safely!");
								batalha.finalizaBatalha();
							}
						}
						batalha.fim = false;
						texto = sc.nextLine();

					}
				}

			}

		} else {
			texto = sc.nextLine();

			int novo1 = 0, novo2 = 0, item1 = 0, item2 = 0;
			Pokemon ativo1 = new Pokemon("Inicial", 100, "Normal,", " ",
					Listas.BodySlam, Listas.Bubble, Listas.BubbleBeam,
					Listas.CrossChop);
			Pokemon ativo2 = new Pokemon("Inicial", 100, "Normal,", " ",
					Listas.BodySlam, Listas.Bubble, Listas.BubbleBeam,
					Listas.CrossChop);

			Treinador treinador1 = batalha.pegaDados();
			Treinador treinador2 = batalha.pegaDados();

			ativo1 = batalha.escolhePrimeiroPok(treinador1);
			ativo2 = batalha.escolhePrimeiroPok(treinador2);

			System.out.println(treinador1.getNome() + " and "
					+ treinador2.getNome() + " would like to battle!");
			System.out.println(" ");
			System.out.println(treinador1.getNome() + " sent out "
					+ ativo1.getNome() + "!");
			System.out.println(" ");
			System.out.println(treinador2.getNome() + " sent out "
					+ ativo2.getNome() + "!");
			System.out.println("");
			System.out.println("--------------------------------------------");

			while (Evento.fim != true) {

				System.out
						.println("--------------------------------------------");
				System.out.println(" ");
				System.out.println(treinador1.getNome() + ", What will "
						+ ativo1.getNome() + "(" + ativo1.getHpMax() + "/"
						+ ativo1.getHp() + ") do ?");
				System.out.println("(1)FIGHT / (3)POKEMON");
				System.out.println("(2) BAG   / (4)RUN");
				Evento.acao1 = sc.nextInt();
				System.out
						.println("--------------------------------------------");

				if (Evento.acao1 == 1) {
					treinador1.escolheAtaque(ativo1);
					Evento.ataque1 = sc.nextInt() - 1;
				} else if (Evento.acao1 == 2) {
					treinador1.escolheItem(2);
					item1 = sc.nextInt();
					System.out.println(treinador1.getNome()
							+ ", choose a pokemon to heal: ");
					treinador1.mostraPokemon();
					novo1 = sc.nextInt() - 1;
				} else if (Evento.acao1 == 3) {
					System.out.println(treinador1.getNome()
							+ ", choose another pokemon to battle: ");
					treinador1.mostraPokemon();
					novo1 = sc.nextInt() - 1;
				} else {
					batalha.finalizaBatalha();
				}

				System.out
						.println("--------------------------------------------");
				System.out.println(" ");
				System.out.println(treinador2.getNome() + ", What will "
						+ ativo2.getNome() + "(" + ativo2.getHpMax() + "/"
						+ ativo2.getHp() + ") do ?");
				System.out.println("(1)FIGHT / (3)POKEMON");
				System.out.println("(2)BAG   / (4)RUN");
				Evento.acao2 = sc.nextInt();
				System.out
						.println("--------------------------------------------");

				if (Evento.acao2 == 1) {
					treinador2.escolheAtaque(ativo2);
					Evento.ataque2 = sc.nextInt() - 1;
				} else if (Evento.acao2 == 2) {
					treinador2.escolheItem(2);
					item2 = sc.nextInt();
					System.out.println(" ");
					System.out.println(treinador2.getNome()
							+ ", choose a pokemon to heal: ");
					treinador2.mostraPokemon();
					System.out.println(" ");
					System.out
							.println("--------------------------------------------");
					novo2 = sc.nextInt() - 1;
				} else if (Evento.acao2 == 3) {
					System.out.println(" ");
					System.out.println(treinador2.getNome()
							+ ", choose another pokemon to battle: ");
					treinador2.mostraPokemon();
					System.out.println(" ");
					System.out
							.println("--------------------------------------------");
					novo2 = sc.nextInt() - 1;
					treinador2.trocaPokemon(ativo2,
							treinador2.getListaPok()[novo2]);
				} else {
					batalha.finalizaBatalha();
					System.out.println(treinador2.getNome()
							+ " fled from the battle!");
				}

				if (acao1 == 4 && acao2 != 4) {
					System.out.println(treinador1.getNome()
							+ " fled from the battle!");
				}

				if (acao1 != 4 && acao2 != 4) {
					if (acao1 == 3) {
						treinador1.trocaPokemon(ativo1,
								treinador1.getListaPok()[novo1]);
						ativo1 = treinador1.getListaPok()[novo1];
					}
					if (acao2 == 3) {
						treinador2.trocaPokemon(ativo2,
								treinador2.getListaPok()[novo2]);
						ativo2 = treinador2.getListaPok()[novo2];
					}
					if (acao1 == 2) {
						Listas.listaItens[item1 - 1].usar(treinador1
								.getListaPok()[novo1]);
					}
					if (acao2 == 2) {
						Listas.listaItens[item2 - 1].usar(treinador2
								.getListaPok()[novo2]);
					}
					if (acao1 == 1 && acao2 == 1) {
						batalha.realizaAtaques(
								ativo1.getAtaques()[Evento.ataque1],
								ativo2.getAtaques()[Evento.ataque2], ativo1,
								ativo2, treinador1, treinador2);
					}
					if (acao1 == 1 && acao2 != 1) {
						ativo1.getAtaques()[Evento.ataque1].ataca(ativo1,
								ativo2);
						if (ativo2.verificaMorte(treinador2) == true) {
							Evento.fim = Evento.verificaVitoria(treinador1,
									treinador2);
						}
					}
					if (acao2 == 1 && acao1 != 1
							&& !ativo1.verificaMorte(treinador2)) {
						ativo2.getAtaques()[Evento.ataque2].ataca(ativo2,
								ativo1);
						if (ativo1.verificaMorte(treinador1) == true) {
							Evento.fim = Evento.verificaVitoria(treinador2,
									treinador1);
						}

					}
				}

				ativo1 = treinador1.getAtivo(treinador1);
				ativo2 = treinador2.getAtivo(treinador2);
			}

			sc.close();
		}

	}

}
