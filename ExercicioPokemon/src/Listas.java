public class Listas {

	static Golpe Ember = new Golpe(40, 1, "Ember", "Fire");
	static Golpe Eruption = new Golpe(150, 3, "Eruption", "Fire");
	static Golpe FireBlast = new Golpe(120, 4, "Fire Blast", "Fire");
	static Golpe Flamethower = new Golpe(95, 3, "Flamethower", "Fire");
	static Golpe BodySlam = new Golpe(85, 2, "Body Slam", "Normal");
	static Golpe Facade = new Golpe(70, 2, "Facade", "Normal");
	static Golpe Tackle = new Golpe(35, 1, "Tackle", "Normal");
	static Golpe Headbutt = new Golpe(70, 2, "Headbutt", "Normal");
	static Golpe Scratch = new Golpe(40, 1, "Scratch", "Normal");
	static Golpe Rage = new Golpe(20, 2, "Rage", "Normal");
	static Golpe QuickAttack = new Golpe(40, 4, "Quick Atack", "Normal");
	static Golpe TriAttack = new Golpe(80, 2, "TriAttack", "Normal");
	static Golpe ExtremeSpeed = new Golpe(80, 5, "Extreme Speed", "Normal");
	static Golpe HyperBeam = new Golpe(150, 4, "HyperBeam", "Normal");
	static Golpe SkullBash = new Golpe(60, 2, "Skull Bash", "Normal");
	static Golpe Bubble = new Golpe(20, 1, "Bubble", "Water");
	static Golpe BubbleBeam = new Golpe(65, 2, "Bubblebeam", "Water");
	static Golpe HydroPump = new Golpe(120, 4, "Hydro Pump", "Water");
	static Golpe WaterGun = new Golpe(40, 2, "Water Gun", "Water");
	static Golpe Splash = new Golpe(0, 1000000, "Splash", "Normal");
	static Golpe MagicalLeaf = new Golpe(60, 2, "Magical Leaf", "Grass");
	static Golpe PetalDance = new Golpe(70, 3, "Petal Dance", "Grass");
	static Golpe SolarBeam = new Golpe(120, 1, "Solar Beam", "Grass");
	static Golpe WingAttack = new Golpe(60, 3, "Wing Atack", "Flying");
	static Golpe Peck = new Golpe(35, 1, "Peck", "Flying");
	static Golpe Gust = new Golpe(40, 2, "Gust", "Flying");
	static Golpe DrillPeck = new Golpe(80, 3, "Drill Peck", "Flying");
	static Golpe SkyAttack = new Golpe(140, 4, "Sky Attack", "Flying");
	static Golpe Spark = new Golpe(65, 2, "Spark", "Electric");
	static Golpe ThunderBolt = new Golpe(95, 2, "Thunderbolt", "Electric");
	static Golpe Thunder = new Golpe(120, 3, "Thunder", "Electric");
	static Golpe IronTail = new Golpe(100, 2, "Iron Tail", "Steel");
	static Golpe Dig = new Golpe(80, 2, "Dig", "Ground");
	static Golpe Magnitude = new Golpe(90, 3, "Magnitude", "Ground");
	static Golpe Earthquake = new Golpe(100, 4, "Earthquake", "Ground");
	static Golpe MegaHorn = new Golpe(120, 4, "Megahorn", "Bug");
	static Golpe DoubleKick = new Golpe(60, 2, "Double Kick", "Fighting");
	static Golpe FocusPunch = new Golpe(150, 4, "Focus Punch", "Fighting");
	static Golpe SkyUppercut = new Golpe(85, 3, "Sky Uppercut", "Fighting");
	static Golpe CrossChop = new Golpe(100, 3, "CrossChop", "Fighting");
	static Golpe Psychic = new Golpe(90, 4, "Psychich", "Psychic");
	static Golpe Psybeam = new Golpe(65, 2, "Psybeam", "Psychic");
	static Golpe LusterPurge = new Golpe(70, 2, "Luster Purge", "Psychic");
	static Golpe Crunch = new Golpe(80, 3, "Crunch", "Dark");
	static Golpe DragonClaw = new Golpe(80, 3, "Dragon Claw", "Dragon");
	static Golpe RockTomb = new Golpe(50, 2, "Rock Tomb", "Rock");
	static Golpe Sonicboom = new Golpe(20, 1, "Sonic Boom", "Normal");
	static Golpe IceBeam = new Golpe(95, 3, "Ice Beam", "Ice");
	
	
	static Pokemon Charmander = new Pokemon("Charmander", 50, "Fire", Ember, Tackle,
			Scratch, Rage);
	static Pokemon Squirtle = new Pokemon("Squirtle", 55, "Water", WaterGun, Bubble,
			Scratch, Headbutt);
	static Pokemon Bulbasaur = new Pokemon("Bulbasaur", 49, "Grass", "Poison", MagicalLeaf,
			PetalDance, Tackle, Headbutt);
	static Pokemon Charizard = new Pokemon("Charizard", 240, "Fire", "Flying", Flamethower,
			FireBlast, DragonClaw, SkyUppercut);
	static Pokemon Blastoise = new Pokemon("Blastoise", 265, "Water", HydroPump, Crunch,
			BubbleBeam, SkullBash);
	static Pokemon Venusaur = new Pokemon("Venusaur", 250, "Fire", "Flying", SolarBeam,
			MagicalLeaf, Earthquake, BodySlam);
	static Pokemon Pidgeotto = new Pokemon("Pidgeotto", 60, "Normal", "Flying", WingAttack,
			QuickAttack, Peck, Gust);
	static Pokemon Fearow = new Pokemon("Fearow", 110, "Normal", "Flying", SkyAttack, DrillPeck,
			WingAttack, QuickAttack);
	static Pokemon Pikachu = new Pokemon("Pikachu", 70, "Electric", ThunderBolt,
			QuickAttack, IronTail, Thunder);
	static Pokemon Nidoking = new Pokemon("Nidoking", 230, "Ground", "Poison", Earthquake,
			DoubleKick, MegaHorn, HyperBeam);
	static Pokemon Dugtrio = new Pokemon("Dugtrio", 160, "Ground", Earthquake, Magnitude,
			TriAttack, Dig);
	static Pokemon Psyduck = new Pokemon("Psyduck", 74, "Water", LusterPurge, WaterGun,
			BubbleBeam, Psychic);
	static Pokemon Arcanine = new Pokemon("Arcanine", 150, "Fire", Flamethower,
			FireBlast, ExtremeSpeed, Crunch);
	static Pokemon Alakazam = new Pokemon("Alakazam", 200, "Psychic", Psychic,
			LusterPurge, Psybeam, FocusPunch);
	static Pokemon Machamp = new Pokemon("Machamp", 250, "Fighting",SkyUppercut,
			DoubleKick, CrossChop, FocusPunch);
	static Pokemon Graveler = new Pokemon("Graveler", 130, "Rock", "Ground", Earthquake,
			RockTomb, BodySlam, Magnitude);
	static Pokemon Magnemite = new Pokemon("Magnemite", 70, "Steel", "Electric", ThunderBolt,
			Sonicboom, Spark, Headbutt);
	static Pokemon Dodrio = new Pokemon("Dodrio", 120, "Normal", "Flying", SkyAttack, TriAttack,
			QuickAttack, DrillPeck);
	static Pokemon Dewgong = new Pokemon("Dewgong", 140, "Water", "Ice", IceBeam, HydroPump,
			BubbleBeam, BodySlam);
	static Pokemon Onix = new Pokemon("Onix", 110, "Rock", "Ground", Earthquake, RockTomb,
			Magnitude, Dig);
	static Pokemon Eletrode = new Pokemon("Eletrode", 90, "Electric", ThunderBolt,
			Sonicboom, Spark, Thunder);
	static Pokemon Hitmonchan = new Pokemon("Hitmonchan", 100, "Fighting", DoubleKick,
			SkyUppercut, CrossChop, FocusPunch);
	static Pokemon Rhydon = new Pokemon("Rhydon", 200, "Rock", "Ground", Earthquake, RockTomb,
			MegaHorn, HyperBeam);
	static Pokemon Electabuzz = new Pokemon("Electabuzz", 140, "Electric", Thunder,
			ThunderBolt, FocusPunch, HyperBeam);
	static Pokemon Magmar = new Pokemon("Magmar", 140, "Fire", Flamethower, FireBlast,
			Earthquake, Eruption);
	static Pokemon Magikarp = new Pokemon("Magikarp", 20, "Water", Splash, Splash,
			Splash, Splash);
	static Pokemon Gyarados = new Pokemon("Gyarados", 220, "Water", "Flying", HydroPump, Crunch,
			HyperBeam, Earthquake);
	static Pokemon Dragonite = new Pokemon("Dragonite", 290, "Flying", "Dragon", WingAttack,
			HyperBeam, Thunder, Earthquake);
	static Pokemon Mewtwo = new Pokemon("Mewtwo", 220, "Psychic", Psychic, HyperBeam,
			Earthquake, Thunder);
	static Pokemon Mew = new Pokemon("Mew", 210, "Psychic",  Psychic, HyperBeam,
			Earthquake, IceBeam);

	static Item HyperPotion = new Item("Hyper Potion", 200);
	static Item SuperPotion = new Item("SuperPotion", 150);
	static Item Potion = new Item("Potion", 50);
	static Item FullRestore = new Item("Full Restore", 403849);
	static Item PokeBall = new Item("Poké Ball",0);

	static Pokemon[] listaPokemons = {
	/* 0 */Charmander,
	/* 1 */Squirtle,
	/* 2 */Bulbasaur,
	/* 3 */Charizard,
	/* 4 */Blastoise,
	/* 5 */Venusaur,
	/* 6 */Pidgeotto,
	/* 7 */Fearow,
	/* 8 */Pikachu,
	/* 9 */Nidoking,
	/* 10 */Dugtrio,
	/* 11 */Psyduck,
	/* 12 */Arcanine,
	/* 13 */Alakazam,
	/* 14 */Machamp,
	/* 15 */Graveler,
	/* 16 */Magnemite,
	/* 17 */Dodrio,
	/* 18 */Dewgong,
	/* 19 */Onix,
	/* 20 */Eletrode,
	/* 21 */Hitmonchan,
	/* 22 */Rhydon,
	/* 23 */Electabuzz,
	/* 24 */Magmar,
	/* 25 */Magikarp,
	/* 26 */Gyarados,
	/* 27 */Dragonite,
	/* 28 */Mewtwo,
	/* 29 */Mew };
	
	
	
	 
	static Item[] listaItens = new Item[] {
	/* 0 */HyperPotion,
	/* 1 */SuperPotion,
	/* 2 */Potion,
	/* 3 */FullRestore,
	/* 4 */PokeBall};

	static Golpe[] listaAtaques = new Golpe[] {
	/* 0 */Ember,
	/* 1 */Eruption,
	/* 2 */FireBlast,
	/* 3 */Flamethower,
	/* 4 */BodySlam,
	/* 5 */Facade,
	/* 6 */Tackle,
	/* 7 */Headbutt,
	/* 8 */Scratch,
	/* 9 */Rage,
	/* 10 */QuickAttack,
	/* 11 */TriAttack,
	/* 12 */ExtremeSpeed,
	/* 13 */HyperBeam,
	/* 14 */SkullBash,
	/* 15 */Bubble,
	/* 16 */BubbleBeam,
	/* 17 */HydroPump,
	/* 18 */WaterGun,
	/* 19 */Splash,
	/* 20 */MagicalLeaf,
	/* 21 */PetalDance,
	/* 22 */SolarBeam,
	/* 23 */WingAttack,
	/* 24 */Peck,
	/* 25 */Gust,
	/* 26 */DrillPeck,
	/* 27 */SkyAttack,
	/* 28 */Spark,
	/* 29 */ThunderBolt,
	/* 30 */Thunder,
	/* 31 */IronTail,
	/* 32 */Dig,
	/* 33 */Magnitude,
	/* 34 */Earthquake,
	/* 35 */MegaHorn,
	/* 36 */DoubleKick,
	/* 37 */FocusPunch,
	/* 38 */SkyUppercut,
	/* 39 */CrossChop,
	/* 40 */Psychic,
	/* 41 */Psybeam,
	/* 42 */LusterPurge,
	/* 43 */DragonClaw,
	/* 44 */RockTomb,
	/* 45 */Sonicboom,
	/* 46 */IceBeam, };

	public static void mostraListaPokemon(Pokemon[] listaPok) {
		int i;
		for (i = 0; i < listaPok.length; i++)
			System.out.println("(" + i + ") " + listaPok[i].getNome());
	}
	
	public static void mostraListaCompleta(){
		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+");
		System.out.println("|(0) Charmander |(1) Squirtle   |(2) Bulbasaur  |(3) Charizard  |(4) Blastoise  |(5) Venusaur   |");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+");
		System.out.println("|(6) Pidgeotto  |(7) Fearow     |(8) Pikachu    |(9) Nidoking   |(10) Dugtrio   |(11) Psyduck   |");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+");
		System.out.println("|(12) Arcanine  |(13) Alakazam  |(14) Machamp   |(15) Graveler  |(16) Magnemite |(17) Dodrio    |");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+");
		System.out.println("|(18) Dewgong   |(19) Onix      |(20) Eletrode  |(21) Hitmonchan|(22) Rhydon    |(23) Electabuzz|");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+");
		System.out.println("|(24) Magmar    |(25) Magikarp  |(26) Gyarados  |(27) Dragonite |(28) Mewtwo    |(29) Mew       |");
		System.out.println("+---------------+---------------+---------------+---------------+---------------+---------------+");
	}

	public void mostraListaItens(Item[] listaItem) {
		int i;
		for (i = 0; i < listaItem.length && listaItem[i] != null; i++) {
			System.out.println(listaItem[i].getNome());
		}
	}

}
