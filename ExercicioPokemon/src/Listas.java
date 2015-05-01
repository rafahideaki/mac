public class Listas {

	static Ataque Ember = new Ataque(40, 1, "Ember");
	static Ataque Eruption = new Ataque(150, 3, "Eruption");
	static Ataque FireBlast = new Ataque(120, 4, "Fire Blast");
	static Ataque Flamethower = new Ataque(95, 3, "Flamethower");
	static Ataque BodySlam = new Ataque(85, 2, "Body Slam");
	static Ataque Facade = new Ataque(70, 2, "Facade");
	static Ataque Tackle = new Ataque(35, 1, "Tackle");
	static Ataque Headbutt = new Ataque(70, 2, "Headbutt");
	static Ataque Scratch = new Ataque(40, 1, "Scratch");
	static Ataque Rage = new Ataque(20, 2, "Rage");
	static Ataque QuickAttack = new Ataque(40, 4, "Quick Atack");
	static Ataque TriAttack = new Ataque(80, 2, "TriAttack");
	static Ataque ExtremeSpeed = new Ataque(80, 5, "Extreme Speed");
	static Ataque HyperBeam = new Ataque(150, 4, "HyperBeam");
	static Ataque SkullBash = new Ataque(60, 2, "Skull Bash");
	static Ataque Bubble = new Ataque(20, 1, "Bubble");
	static Ataque BubbleBeam = new Ataque(65, 2, "Bubblebeam");
	static Ataque HydroPump = new Ataque(120, 4, "Hydro Pump");
	static Ataque WaterGun = new Ataque(40, 2, "Water Gun");
	static Ataque Splash = new Ataque(0, 1000000, "Splash");
	static Ataque MagicalLeaf = new Ataque(60, 2, "MagicalLeaf");
	static Ataque PetalDance = new Ataque(70, 3, "Petal Dance");
	static Ataque SolarBeam = new Ataque(120, 1, "Solar Beam");
	static Ataque WingAttack = new Ataque(60, 3, "Wing Atack");
	static Ataque Peck = new Ataque(35, 1, "Peck");
	static Ataque Gust = new Ataque(40, 2, "Gust");
	static Ataque DrillPeck = new Ataque(80, 3, "Drill Peck");
	static Ataque SkyAttack = new Ataque(140, 4, "Sky Attack");
	static Ataque Spark = new Ataque(65, 2, "Spark");
	static Ataque ThunderBolt = new Ataque(95, 2, "Thunderbolt");
	static Ataque Thunder = new Ataque(120, 3, "Thunder");
	static Ataque IronTail = new Ataque(100, 2, "Iron Tail");
	static Ataque Dig = new Ataque(80, 2, "Dig");
	static Ataque Magnitude = new Ataque(90, 3, "Magnitude");
	static Ataque Earthquake = new Ataque(100, 4, "Earthquake");
	static Ataque MegaHorn = new Ataque(120, 4, "Megahorn");
	static Ataque DoubleKick = new Ataque(60, 2, "Double Kick");
	static Ataque FocusPunch = new Ataque(150, 4, "Focus Punch");
	static Ataque SkyUppercut = new Ataque(85, 3, "Sky Uppercut");
	static Ataque CrossChop = new Ataque(100, 3, "CrossChop");
	static Ataque Psychic = new Ataque(90, 4, "Psychich");
	static Ataque Psybeam = new Ataque(65, 2, "Psybeam");
	static Ataque LusterPurge = new Ataque(70, 2, "Luster Purge");
	static Ataque Crunch = new Ataque(80, 3, "Crunch");
	static Ataque DragonClaw = new Ataque(80, 3, "Dragon Claw");
	static Ataque RockTomb = new Ataque(50, 2, "Rock Tomb");
	static Ataque Sonicboom = new Ataque(20, 1, "Sonic Boom");
	static Ataque IceBeam = new Ataque(95, 3, "Ice Beam");

	static Pokemon Charmander = new Pokemon("Charmander", 50, Ember, Tackle,
			Scratch, Rage);
	static Pokemon Squirtle = new Pokemon("Squirtle", 55, WaterGun, Bubble,
			Scratch, Headbutt);
	static Pokemon Bulbasaur = new Pokemon("Bulbasaur", 49, MagicalLeaf,
			PetalDance, Tackle, Headbutt);
	static Pokemon Charizard = new Pokemon("Charizard", 240, Flamethower,
			FireBlast, DragonClaw, SkyUppercut);
	static Pokemon Blastoise = new Pokemon("Blastoise", 265, HydroPump, Crunch,
			BubbleBeam, SkullBash);
	static Pokemon Venusaur = new Pokemon("Venusaur", 250, SolarBeam,
			MagicalLeaf, Earthquake, BodySlam);
	static Pokemon Pidgeotto = new Pokemon("Pidgeotto", 60, WingAttack,
			QuickAttack, Peck, Gust);
	static Pokemon Fearow = new Pokemon("Fearow", 110, SkyAttack, DrillPeck,
			WingAttack, QuickAttack);
	static Pokemon Pikachu = new Pokemon("Pikachu", 70, ThunderBolt,
			QuickAttack, IronTail, Thunder);
	static Pokemon Nidoking = new Pokemon("Nidoking", 230, Earthquake,
			DoubleKick, MegaHorn, HyperBeam);
	static Pokemon Dugtrio = new Pokemon("Dugtrio", 160, Earthquake, Magnitude,
			TriAttack, Dig);
	static Pokemon Psyduck = new Pokemon("Psyduck", 74, LusterPurge, WaterGun,
			BubbleBeam, Psychic);
	static Pokemon Arcanine = new Pokemon("Arcanine", 150, Flamethower,
			FireBlast, ExtremeSpeed, Crunch);
	static Pokemon Alakazam = new Pokemon("Alakazam", 200, Psychic,
			LusterPurge, Psybeam, FocusPunch);
	static Pokemon Machamp = new Pokemon("Machamp", 250, SkyUppercut,
			DoubleKick, CrossChop, FocusPunch);
	static Pokemon Graveler = new Pokemon("Graveler", 130, Earthquake,
			RockTomb, BodySlam, Magnitude);
	static Pokemon Magnemite = new Pokemon("Magnemite", 70, ThunderBolt,
			Sonicboom, Spark, Headbutt);
	static Pokemon Dodrio = new Pokemon("Dodrio", 120, SkyAttack, TriAttack,
			QuickAttack, DrillPeck);
	static Pokemon Dewgong = new Pokemon("Dewgong", 140, IceBeam, HydroPump,
			BubbleBeam, BodySlam);
	static Pokemon Onix = new Pokemon("Onix", 110, Earthquake, RockTomb,
			Magnitude, Dig);
	static Pokemon Eletrode = new Pokemon("Eletrode", 90, ThunderBolt,
			Sonicboom, Spark, Thunder);
	static Pokemon Hitmonchan = new Pokemon("Hitmonchan", 100, DoubleKick,
			SkyUppercut, CrossChop, FocusPunch);
	static Pokemon Rhydon = new Pokemon("Rhydon", 200, Earthquake, RockTomb,
			MegaHorn, HyperBeam);
	static Pokemon Electabuzz = new Pokemon("Electabuzz", 140, Thunder,
			ThunderBolt, FocusPunch, HyperBeam);
	static Pokemon Magmar = new Pokemon("Magmar", 140, Flamethower, FireBlast,
			Earthquake, Eruption);
	static Pokemon Magikarp = new Pokemon("Magikarp", 20, Splash, Splash,
			Splash, Splash);
	static Pokemon Gyarados = new Pokemon("Gyarados", 220, HydroPump, Crunch,
			HyperBeam, Earthquake);
	static Pokemon Dragonite = new Pokemon("Dragonite", 290, WingAttack,
			HyperBeam, Thunder, Earthquake);
	static Pokemon Mewtwo = new Pokemon("Mewtwo", 220, Psychic, HyperBeam,
			Earthquake, Thunder);
	static Pokemon Mew = new Pokemon("Mew", 210, Psychic, HyperBeam,
			Earthquake, IceBeam);

	static Item HyperPotion = new Item("Hyper Potion", 200);
	static Item SuperPotion = new Item("SuperPotion", 150);
	static Item Potion = new Item("Potion", 50);
	static Item FullRestore = new Item("Full Restore", 403849);

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
	/* 3 */FullRestore };

	static Ataque[] listaAtaques = new Ataque[] {
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

	public static void mostraListaItens(Item[] listaItem) {
		int i;
		for (i = 0; i < listaItem.length && listaItem[i] != null; i++) {
			System.out.println(listaItem[i].getNome());
		}
	}

	public static void main(String[] args) {
		Listas lista = new Listas();
		System.out.println("Chegou");
	}
}
