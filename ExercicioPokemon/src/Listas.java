
public class Listas {
	Ataque Ember = new Ataque(40,1,"Ember");
	Ataque Eruption = new Ataque(150,3,"Eruption");
	Ataque FireBlast = new Ataque(120,4,"Fire Blast");
	Ataque Flamethower = new Ataque(95,3,"Flamethower");
	Ataque BodySlam = new Ataque(85,2,"Body Slam");
	Ataque Facade = new Ataque(70,2,"Facade");
	Ataque Tackle = new Ataque(35,1,"Tackle");
	Ataque Headbutt = new Ataque(70,2,"Headbutt");
	Ataque Scratch = new Ataque(40,1,"Scratch");
	Ataque Rage = new Ataque(20,2,"Rage");
	Ataque QuickAttack = new Ataque(40,4,"Quick Atack");
	Ataque TriAttack = new Ataque(80,2,"TriAttack");
	Ataque ExtremeSpeed = new Ataque(80,5,"Extreme Speed");
	Ataque HyperBeam = new Ataque(150,4,"HyperBeam");
	Ataque SkullBash = new Ataque (60,2,"Skull Bash");
	Ataque Bubble = new Ataque(20,1,"Bubble");
	Ataque BubbleBeam = new Ataque(65,2,"Bubblebeam");
	Ataque HydroPump = new Ataque(120,4,"Hydro Pump");
	Ataque WaterGun = new Ataque(40,2,"Water Gun");
	Ataque Splash = new Ataque(0,1000000,"Splash");
	Ataque MagicalLeaf = new Ataque(60,2,"MagicalLeaf");
	Ataque PetalDance = new Ataque(70,3,"Petal Dance");
	Ataque SolarBeam = new Ataque(120,1,"Solar Beam");
	Ataque WingAttack = new Ataque(60,3,"Wing Atack");
	Ataque Peck = new Ataque(35,1,"Peck");
	Ataque Gust = new Ataque(40,2,"Gust");
	Ataque DrillPeck = new Ataque(80,3,"Drill Peck");
	Ataque SkyAttack = new Ataque(140,4,"Sky Attack");
	Ataque Spark = new Ataque(65,2,"Spark");
	Ataque ThunderBolt = new Ataque(95,2,"Thunderbolt");
	Ataque Thunder = new Ataque(120,3,"Thunder");
	Ataque IronTail = new Ataque(100,2,"Iron Tail");
	Ataque Dig = new Ataque(80,2,"Dig");
	Ataque Magnitude = new Ataque(90,3,"Magnitude");
	Ataque Earthquake = new Ataque(100,4,"Earthquake");
	Ataque MegaHorn = new Ataque(120,4,"Megahorn");
	Ataque DoubleKick = new Ataque(60,2,"Double Kick");
	Ataque FocusPunch = new Ataque(150,4,"Focus Punch");
	Ataque SkyUppercut = new Ataque(85,3,"Sky Uppercut");
	Ataque CrossChop = new Ataque(100,3,"CrossChop");
	Ataque Psychic = new Ataque(90,4,"Psychich");
	Ataque Psybeam = new Ataque (65,2,"Psybeam");
	Ataque LusterPurge = new Ataque(70,2,"Luster Purge");
	Ataque Crunch = new Ataque(80,3,"Crunch");
	Ataque DragonClaw = new Ataque(80,3,"Dragon Claw");
	Ataque RockTomb = new Ataque(50,2,"Rock Tomb");
	Ataque Sonicboom = new Ataque(20,1,"Sonic Boom");
	Ataque IceBeam = new Ataque(95,3,"Ice Beam");
	
	
	Pokemon Charmander = new Pokemon("Charmander",50,Ember,Tackle,Scratch,Rage);
	Pokemon Squirtle = new Pokemon ("Squirtle",55,WaterGun,Bubble,Scratch,Headbutt);
	Pokemon Bulbasaur = new Pokemon ("Bulbasaur",49,MagicalLeaf,PetalDance,Tackle,Headbutt);
	Pokemon Charizard = new Pokemon ("Charizard",240,Flamethower,FireBlast,DragonClaw,SkyUppercut);
	Pokemon Blastoise = new Pokemon ("Blastoise",265,HydroPump,Crunch,BubbleBeam,SkullBash);
	Pokemon Venusaur = new Pokemon("Venusaur",250,SolarBeam,MagicalLeaf,Earthquake,BodySlam);
	Pokemon Pidgeotto = new Pokemon ("Pidgeotto",60,WingAttack,QuickAttack,Peck,Gust);
	Pokemon Fearow = new Pokemon ("Fearow",110,SkyAttack, DrillPeck, WingAttack,QuickAttack);
	Pokemon Pikachu = new Pokemon ("Pikachu",70,ThunderBolt,QuickAttack,IronTail,Thunder);
	Pokemon Nidoking = new Pokemon ("Nidoking",230,Earthquake,DoubleKick,MegaHorn,HyperBeam);
	Pokemon Dugtrio = new Pokemon ("Dugtrio",160,Earthquake,Magnitude,TriAttack,Dig);
	Pokemon Psyduck = new Pokemon ("Psyduck",74, LusterPurge,WaterGun,BubbleBeam,Psychic);
	Pokemon Arcanine = new Pokemon ("Arcanine",150, Flamethower,FireBlast,ExtremeSpeed,Crunch);
	Pokemon Alakazam = new Pokemon ("Alakazam",200,Psychic,LusterPurge,Psybeam,FocusPunch);
	Pokemon Machamp = new Pokemon ("Machamp",250,SkyUppercut,DoubleKick,CrossChop,FocusPunch);
	Pokemon Graveler = new Pokemon ("Graveler",130,Earthquake,RockTomb,BodySlam,Magnitude);
	Pokemon Magnemite = new Pokemon ("Magnemite",70,ThunderBolt,Sonicboom,Spark,Headbutt);
	Pokemon Dodrio = new Pokemon ("Dodrio",120,SkyAttack,TriAttack,QuickAttack,DrillPeck);
	Pokemon Dewgong = new Pokemon ("Dewgong",140,IceBeam,HydroPump,BubbleBeam,BodySlam);
	Pokemon Onix = new Pokemon ("Onix",110,Earthquake,RockTomb,Magnitude,Dig);
	Pokemon Eletrode = new Pokemon ("Eletrode",90,ThunderBolt,Sonicboom,Spark,Thunder);
	Pokemon Hitmonchan = new Pokemon ("Hitmonchan",100,DoubleKick,SkyUppercut,CrossChop,FocusPunch);
	Pokemon Rhydon = new Pokemon ("Rhydon",200,Earthquake,RockTomb,MegaHorn,HyperBeam);
	Pokemon Electabuzz = new Pokemon ("Electabuzz",140,Thunder,ThunderBolt,FocusPunch,HyperBeam);
	Pokemon Magmar = new Pokemon ("Magmar",140,Flamethower,FireBlast,Earthquake,Eruption);
	Pokemon Magikarp = new Pokemon ("Magikarp",20,Splash,Splash,Splash,Splash);
	Pokemon Gyarados = new Pokemon("Gyarados",220,HydroPump,Crunch,HyperBeam,Earthquake);
	Pokemon Dragonite = new Pokemon("Dragonite", 290, WingAttack, HyperBeam, Thunder, Earthquake);
	Pokemon Mewtwo = new Pokemon("Mewtwo",220,Psychic,HyperBeam,Earthquake,Thunder);
	Pokemon Mew = new Pokemon("Mew",210,Psychic,HyperBeam,Earthquake,IceBeam);
	
	Item HyperPotion = new Item("Hyper Potion", 200);
	Item SuperPotion = new Item("SuperPotion", 150);
	Item Potion = new Item("Potion",50);
	Item FullRestore = new Item("Full Restore",403849);
	
	
	Pokemon[] listaPokemons = {
							  /*0*/Charmander,
							  /*1*/Squirtle,
							  /*2*/Bulbasaur,
							  /*3*/Charizard,
							  /*4*/Blastoise,
							  /*5*/Venusaur,
							  /*6*/Pidgeotto,
							  /*7*/Fearow,
							  /*8*/Pikachu,
							  /*9*/Nidoking,
							  /*10*/Dugtrio,
							  /*11*/Psyduck,
							  /*12*/Arcanine,
							  /*13*/Alakazam,
							  /*14*/Machamp,
							  /*15*/Graveler,
							  /*16*/Magnemite,
							  /*17*/Dodrio,
							  /*18*/Dewgong,
							  /*19*/Onix,
							  /*20*/Eletrode,
							  /*21*/Hitmonchan,
							  /*22*/Rhydon,
							  /*23*/Electabuzz,
							  /*24*/Magmar,
							  /*25*/Magikarp,
							  /*26*/Gyarados,
							  /*27*/Dragonite,
							  /*28*/Mewtwo,
							  /*29*/Mew
							  };
	
	Item[] listaItens = {
						/*0*/ HyperPotion,
						/*1*/ SuperPotion,
						/*2*/ Potion,
						/*3*/ FullRestore
						};
	
	Ataque[] listaAtaques = {
							/*0*/Ember,
							/*1*/Eruption,
							/*2*/FireBlast,
							/*3*/Flamethower,
							/*4*/BodySlam,
							/*5*/Facade,
							/*6*/Tackle,
							/*7*/Headbutt,
							/*8*/Scratch,
							/*9*/Rage,
							/*10*/QuickAttack,
							/*11*/TriAttack,
							/*12*/ExtremeSpeed,
							/*13*/HyperBeam,
							/*14*/SkullBash,
							/*15*/Bubble,
							/*16*/BubbleBeam,
							/*17*/HydroPump,
							/*18*/WaterGun,
							/*19*/Splash,
							/*20*/MagicalLeaf,
							/*21*/PetalDance,
							/*22*/SolarBeam,
							/*23*/WingAttack,
							/*24*/Peck,
							/*25*/Gust,
							/*26*/DrillPeck,
							/*27*/SkyAttack,
							/*28*/Spark,
							/*29*/ThunderBolt,
							/*30*/Thunder,
							/*31*/IronTail,
							/*32*/Dig,
							/*33*/Magnitude,
							/*34*/Earthquake,
							/*35*/MegaHorn,
							/*36*/DoubleKick,
							/*37*/FocusPunch,
							/*38*/SkyUppercut,
							/*39*/CrossChop,
							/*40*/Psychic,
							/*41*/Psybeam,
							/*42*/LusterPurge,
							/*43*/DragonClaw,
							/*44*/RockTomb,
							/*45*/Sonicboom,
							/*46*/IceBeam,
							};
	
	
	public void mostraListaPokemon() {
		int i;
		for (i = 0; i < listaPokemons.length; i ++)
		System.out.println("("+i+") "  +listaPokemons[i].getNome());
	}
	
	public void mostraListaItens() {
		int i;
		for (i = 0; i < listaItens.length; i++){
			System.out.println(listaItens[i].getNome());
		}
	}
	
	
	
	public static void main(String[] args){
		
	}
}
