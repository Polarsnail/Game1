package Adverbs;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class mainClassAdverbs {
	public static String locationOne = "error";
	static void getLocation(){
		
		String desiredTerrain = "Random";
		
		String outputTwo = "error";
		String outputThr = "error";
		String outputFou = "error";
		String outputFiv = "error";
		String outputSix = "error";
		String outputSev = "error";
		String outputEig = "error";
		String outputNin = "error";
		String outputTen = "error";
		int wordAmount = 0;
		String wordOne = "";
		String wordTwo = "";
		String word1 = "";
		String word2 = "";
		String word3 = "";
		int starterWord = 0;
		int starterWord2 = 0;
		int starterWord3 = 0;
		int finalWord = 0;
		boolean finish = false;
		boolean newTerrain = true;
		String userInp ="";
		boolean random = false;
		int randomTerrain = 0;
		Scanner userInput = new Scanner(System.in);
		boolean singleName = false;
		boolean dualName = false;
		boolean newSelection = true;
		int randomNumber = 0;
		
		//while(finish == false){
	  //if(newSelection == true){
		   
		//}
		//else
		//{
		// newSelection = false;
		// singleName = false;
		// dualName = false;
		//}
	  //}
		//if(newTerrain == true){
		//	System.out.println("Select a terrain!");
		//	System.out.println("1.Desert");
		//	System.out.println("2.Forest");
		//	System.out.println("3.Hills");
		//	System.out.println("4.Mountains");
		//	System.out.println("5.Beach/Water");
		//	System.out.println("6.Plains");
		//	System.out.println("7.River");
		//	System.out.println("8.Swamp");
		//	System.out.println("9.Underground");
		//	System.out.println("10.Urban");
		//	System.out.println("r.Random");
		//	userInp = userInput.nextLine();
		
		//}
	//if(userInp.equals("1") || userInp.equals("2") || userInp.equals("3") || userInp.equals("4")
	//|| userInp.equals("5") || userInp.equals("6") || userInp.equals("7") || userInp.equals("8")
	//|| userInp.equals("9") || userInp.equals("10") || userInp.equals("r")){
		//Scanner userInput2 = new Scanner(System.in);{
			//randomNumber = 1 + (int) (Math.random() * 10);
			//switch(randomNumber){
			//case 1: desiredTerrain = "Desert"; break;
			//case 2: desiredTerrain = "Forest"; break;
			//case 3: desiredTerrain = "Hills"; break;
			//case 4: desiredTerrain = "Mountains"; break;
			//case 5: desiredTerrain = "Beach/Water"; break;
			//case 6: desiredTerrain = "Plains"; break;
			//case 7: desiredTerrain = "River"; break;
			//case 8: desiredTerrain = "Swamp"; break;
			//case 9: desiredTerrain = "Underground"; break;
			//case 10: desiredTerrain = "Urban"; break;
			//case r: random = true; break;
			//}
			//Randomizer starts here
			//while(outputTen == "error"){
				//if(random == true){
					randomTerrain = 1 + (int) (Math.random() * 10);
					switch(randomTerrain){
					case 1: desiredTerrain = "Desert"; break;
					case 2: desiredTerrain = "Forest"; break;
					case 3: desiredTerrain = "Hills"; break;
					case 4: desiredTerrain = "Mountains"; break;
					case 5: desiredTerrain = "Beach/Water"; break;
					case 6: desiredTerrain = "Plains"; break;
					case 7: desiredTerrain = "River"; break;
					case 8: desiredTerrain = "Swamp"; break;
					case 9: desiredTerrain = "Underground"; break;
					case 10: desiredTerrain = "Urban"; break;
					}
				//}
				if(singleName == true){
					wordAmount = 1;
				}
				else if(dualName == true){
					wordAmount = 2;
				}
				else wordAmount  = 1 + (int) (Math.random() * 2);
				//Only two words
				if(wordAmount == 1){
					starterWord = 1 + (int) (Math.random() * 171);
					switch(starterWord){
					case 1: wordOne = "Molten"; break;
					case 2: wordOne = "Frosted"; break;
					case 3: wordOne = "Continual"; break;
					case 4: wordOne = "Glacial"; break;
					case 5: wordOne = "Glowing"; break;
					case 6: wordOne = "Igneous"; break;
					case 7: wordOne = "Stormy"; break;
					case 8: wordOne = "Flooded"; break;
					case 9: wordOne = "Shattered"; break;
					case 10: wordOne = "Splintered"; break;
					case 11: wordOne = "Abandoned"; break;
					case 12: wordOne = "Isolated"; break;
					case 13: wordOne = "Forsaken"; break;
					case 14: wordOne = "Death's"; break;
					case 15: wordOne = "Fool's"; break;
					case 16: wordOne = "Titan's"; break;
					case 17: wordOne = "Hunter's"; break;
					case 18: wordOne = "Dawn's"; break;
					case 19: wordOne = "Dusk's"; break;
					case 20: wordOne = "Cursed"; break;
					case 21: wordOne = "Harrowed"; break;
					case 22: wordOne = "Haunted"; break;
					case 23: wordOne = "Drowned"; break;
					case 24: wordOne = "Blighted"; break;
					case 25: wordOne = "Crippled"; break;
					case 26: wordOne = "Scorched"; break;
					case 27: wordOne = "Whispering"; break;
					case 28: wordOne = "Thundering"; break;
					case 29: wordOne = "Shimmering"; break;
					case 30: wordOne = "Shadowed"; break;
					case 31: wordOne = "Enlightening"; break;
					case 32: wordOne = "Silent"; break;
					case 33: wordOne = "Arcane"; break;
					case 34: wordOne = "Corrupt"; break;
					case 35: wordOne = "Calming"; break;
					case 36: wordOne = "Sparkling"; break;
					case 37: wordOne = "Steaming"; break;
					case 38: wordOne = "Crystal"; break;
					case 39: wordOne = "Mirroring"; break;
					case 40: wordOne = "Golden"; break;
					case 41: wordOne = "Barrier"; break;
					case 42: wordOne = "Ransacked"; break;
					case 43: wordOne = "Dreamer's"; break;
					case 44: wordOne = "Artisan's"; break;
					case 45: wordOne = "Corrupting"; break;
					case 46: wordOne = "Corrupted"; break;
					case 47: wordOne = "Charred"; break;
					case 48: wordOne = "Singed"; break;
					case 49: wordOne = "Scorching"; break;
					case 50: wordOne = "Isolating"; break;
					case 51: wordOne = "Flooding"; break;
					case 52: wordOne = "Shattering"; break;
					case 53: wordOne = "Splintering"; break;
					case 54: wordOne = "Harrowing"; break;
					case 55: wordOne = "Haunting"; break;
					case 56: wordOne = "Drowning"; break;
					case 57: wordOne = "Blighting"; break;
					case 58: wordOne = "Crippling"; break;
					case 59: wordOne = "Enlightened"; break;
					case 60: wordOne = "Silencing"; break;
					case 61: wordOne = "Crystalizing"; break;
					case 62: wordOne = "Mirrored"; break;
					case 63: wordOne = "Scarred"; break;
					case 64: wordOne = "Scarring"; break;
					case 65: wordOne = "Daunting"; break;
					case 66: wordOne = "Weathered"; break;
					case 67: wordOne = "Weathering"; break;
					case 68: wordOne = "Sapphire"; break;
					case 69: wordOne = "Amber"; break;
					case 70: wordOne = "Amethyst"; break;
					case 71: wordOne = "Pearl"; break;
					case 72: wordOne = "Emerald"; break;
					case 73: wordOne = "Jade"; break;
					case 74: wordOne = "Opal"; break;
					case 75: wordOne = "Moonstone"; break;
					case 76: wordOne = "Topaz"; break;
					case 77: wordOne = "Onyx"; break;
					case 78: wordOne = "Peridot"; break;
					case 79: wordOne = "Ruby"; break;
					case 80: wordOne = "Diamond"; break;
					case 81: wordOne = "Quartz"; break;
					case 82: wordOne = "Broken"; break;
					case 83: wordOne = "Breaking"; break;
					case 84: wordOne = "Tempest"; break;
					case 85: wordOne = "Bleak"; break;
					case 86: wordOne = "Mysterious"; break;
					case 87: wordOne = "Cryptic"; break;
					case 88: wordOne = "Mystical"; break;
					case 89: wordOne = "Mystifying"; break;
					case 90: wordOne = "Obscuring"; break;
					case 91: wordOne = "Obscured"; break;
					case 92: wordOne = "Singing"; break;
					case 93: wordOne = "Hero's"; break;
					case 94: wordOne = "Champion's"; break;
					case 95: wordOne = "Victor's"; break;
					case 96: wordOne = "Crushing"; break;
					case 97: wordOne = "Crushed"; break;
					case 98: wordOne = "Unstable"; break;
					case 99: wordOne = "Scalding"; break;
					case 100: wordOne = "Unkempt"; break;
					case 101: wordOne = "Glistening"; break;
					case 102: wordOne = "Ancient"; break;
					case 103: wordOne = "Ruined"; break;
					case 104: wordOne = "Enchanted"; break;
					case 105: wordOne = "Spellbound"; break;
					case 106: wordOne = "Magical"; break;
					case 107: wordOne = "Sorcerous"; break;
					case 108: wordOne = "Ethereal"; break;
					case 109: wordOne = "Celestial"; break;
					case 110: wordOne = "Beast's"; break;
					case 111: wordOne = "Dragon's"; break;
					case 112: wordOne = "Expanding"; break;
					case 113: wordOne = "Collapsing"; break;
					case 114: wordOne = "Contested"; break;
					case 115: wordOne = "Foreboding"; break;
					case 116: wordOne = "Enchanting"; break;
					case 117: wordOne = "Spellbinding"; break;
					case 118: wordOne = "Fallen"; break;
					case 119: wordOne = "Collapsed"; break;
					case 120: wordOne = "Crumbling"; break;
					case 121: wordOne = "Crumbled"; break;
					case 122: wordOne = "Toppled"; break;
					case 123: wordOne = "Disappeard"; break;
					case 124: wordOne = "Devastated"; break;
					case 125: wordOne = "Destroyed"; break;
					case 126: wordOne = "Sunken"; break;
					case 127: wordOne = "Sinking"; break;
					case 128: wordOne = "Dismantled"; break;
					case 129: wordOne = "Despoiled"; break;
					case 130: wordOne = "Tattered"; break;
					case 131: wordOne = "War-torn"; break;
					case 132: wordOne = "Desolate"; break;
					case 133: wordOne = "Burnished"; break;
					case 134: wordOne = "Shining"; break;
					case 135: wordOne = "Radiant"; break;
					case 136: wordOne = "Blazing"; break;
					case 137: wordOne = "Gilded"; break;
					case 138: wordOne = "Tarnished"; break;
					case 139: wordOne = "Distorted"; break;
					case 140: wordOne = "Distorting"; break;
					case 141: wordOne = "Eroded"; break;
					case 142: wordOne = "Eroding"; break;
					case 143: wordOne = "Iron"; break;
					case 144: wordOne = "Copper"; break;
					case 145: wordOne = "Bronze"; break;
					case 146: wordOne = "Brass"; break;
					case 147: wordOne = "Platinum"; break;
					case 148: wordOne = "Cobalt"; break;
					case 149: wordOne = "Titanium"; break;
					case 150: wordOne = "Silver"; break;
					case 151: wordOne = "Tin"; break;
					case 152: wordOne = "Lead"; break;
					case 153: wordOne = "Mercurial"; break;
					case 154: wordOne = "Quicksilver"; break;
					case 155: wordOne = "Chaining"; break;
					case 156: wordOne = "Chained"; break;
					case 157: wordOne = "Disorienting"; break;
					case 158: wordOne = "Perplexing"; break;
					case 159: wordOne = "Puzzling"; break;
					case 160: wordOne = "Bewildering"; break;
					case 161: wordOne = "Chaotic"; break;
					case 162: wordOne = "Unsettling"; break;
					case 163: wordOne = "Swarmed"; break;
					case 164: wordOne = "Twilight"; break;
					case 165: wordOne = "Sunrise"; break;
					case 166: wordOne = "Moonlight"; break;
					case 167: wordOne = "Towering"; break;
					case 168: wordOne = "Climbing"; break;
					case 169: wordOne = "Ascending"; break;
					case 170: wordOne = "Summiting"; break;
					case 171: wordOne = "Warding"; break;	
				}
					//Desert
					if(desiredTerrain == "Desert"){
						finalWord = 1 + (int) (Math.random() *20);
						switch(finalWord){
						case 1: wordTwo = "Desert"; break;
						case 2: wordTwo = "Oasis"; break;
						case 3: wordTwo = "Desolation"; break;
						case 4: wordTwo = "Solitude"; break;
						case 5: wordTwo = "Wastes"; break;
						case 6: wordTwo = "Wilds"; break;
						case 7: wordTwo = "Expanse"; break;
						case 8: wordTwo = "Dunes"; break;
						case 9: wordTwo = "Straights"; break;
						case 10: wordTwo = "Gulch"; break;
						case 11: wordTwo = "Sanctuary"; break;
						case 12: wordTwo = "Barren"; break;
						case 13: wordTwo = "Badlands"; break;
						case 14: wordTwo = "Flats"; break;
						case 15: wordTwo = "Wasteland"; break;
						case 16: wordTwo = "Devastation"; break;
						case 17: wordTwo = "Seclusion"; break;
						case 18: wordTwo = "Withdrawal"; break;
						case 19: wordTwo = "Isolation"; break;
						case 20: wordTwo = "Sands"; break;
					}
					}
					//Forest
					else if(desiredTerrain == "Forest"){
						finalWord = 1 + (int) (Math.random() *29);
						switch(finalWord){
						case 1: wordTwo = "Forest"; break;
						case 2: wordTwo = "Backwoods"; break;
						case 3: wordTwo = "Bramble"; break;
						case 4: wordTwo = "Briar"; break;
						case 5: wordTwo = "Chapparel"; break;
						case 6: wordTwo = "Hinterland"; break;
						case 7: wordTwo = "Thicket"; break;
						case 8: wordTwo = "Wilds"; break;
						case 9: wordTwo = "Wilderness"; break;
						case 10: wordTwo = "Timber"; break;
						case 11: wordTwo = "Jungle"; break;
						case 12: wordTwo = "Wood"; break;
						case 13: wordTwo = "Woods"; break;
						case 14: wordTwo = "Woodland"; break;
						case 15: wordTwo = "Timberland"; break;
						case 16: wordTwo = "Grove"; break;
						case 17: wordTwo = "Outback"; break;
						case 18: wordTwo = "Orchard"; break;
						case 19: wordTwo = "Plantation"; break;
						case 20: wordTwo = "Undergrowth"; break;
						case 21: wordTwo = "Maze"; break;
						case 22: wordTwo = "Labyrinth"; break;
						case 23: wordTwo = "Tangle"; break;
						case 24: wordTwo = "Web"; break;
						case 25: wordTwo = "Brushwood"; break;
						case 26: wordTwo = "Bosk"; break;
						case 27: wordTwo = "Alcove"; break;
						case 28: wordTwo = "Arbor"; break;
						case 29: wordTwo = "Nest"; break;
					}
					}
					//Hills
					else if(desiredTerrain == "Hills"){	
						finalWord = 1 + (int) (Math.random() *26);
						switch(finalWord){
						case 1: wordTwo = "Highlands"; break;
						case 2: wordTwo = "Hills"; break;
						case 3: wordTwo = "Hill"; break;
						case 4: wordTwo = "Uplands"; break;
						case 5: wordTwo = "Downs"; break;
						case 6: wordTwo = "Inclines"; break;
						case 7: wordTwo = "Slopes"; break;
						case 8: wordTwo = "Hillside"; break;
						case 9: wordTwo = "Rise"; break;
						case 10: wordTwo = "Headlands"; break;
						case 11: wordTwo = "Slumps"; break;
						case 12: wordTwo = "Foothills"; break;
						case 13: wordTwo = "Mounds"; break;
						case 14: wordTwo = "Heaps"; break;
						case 15: wordTwo = "Swells"; break;
						case 16: wordTwo = "Embankments"; break;
						case 17: wordTwo = "Hillocks"; break;
						case 18: wordTwo = "Lumps"; break;
						case 19: wordTwo = "Cascades"; break;
						case 20: wordTwo = "Dunes"; break;
						case 21: wordTwo = "Valleys"; break;
						case 22: wordTwo = "Crescendos"; break;
						case 23: wordTwo = "Ripples"; break;
						case 24: wordTwo = "Plateaus"; break;
						case 25: wordTwo = "Outskirts"; break;
						case 26: wordTwo = "Steppes"; break;
						}
					}
					//Mountains
					else if(desiredTerrain == "Mountains"){	
						finalWord = 1 + (int) (Math.random() *50);
						switch(finalWord){
						case 1: wordTwo = "Mountains"; break;
						case 2: wordTwo = "Mount"; break;
						case 3: wordTwo = "Cliff"; break;
						case 4: wordTwo = "Peak"; break;
						case 5: wordTwo = "Knoll"; break;
						case 6: wordTwo = "Ridge"; break;
						case 7: wordTwo = "Terrace"; break;
						case 8: wordTwo = "Ridgeline"; break;
						case 9: wordTwo = "Ravine"; break;
						case 10: wordTwo = "Mountaintop"; break;
						case 11: wordTwo = "Clifftop"; break;
						case 12: wordTwo = "Alpines"; break;
						case 13: wordTwo = "Volcano"; break;
						case 14: wordTwo = "Hike"; break;
						case 15: wordTwo = "Climb"; break;
						case 16: wordTwo = "Ledges"; break;
						case 17: wordTwo = "Aretes"; break;
						case 18: wordTwo = "Crest"; break;
						case 19: wordTwo = "Spire"; break;
						case 20: wordTwo = "Bridge"; break;
						case 21: wordTwo = "Snowcap"; break;
						case 22: wordTwo = "Crag"; break;
						case 23: wordTwo = "Butte"; break;
						case 24: wordTwo = "Gorge"; break;
						case 25: wordTwo = "Grotto"; break;
						case 26: wordTwo = "Pike"; break;
						case 27: wordTwo = "Arch"; break;
						case 28: wordTwo = "Range"; break;
						case 29: wordTwo = "Pass"; break;
						case 30: wordTwo = "Domain"; break;
						case 31: wordTwo = "Passage"; break;
						case 32: wordTwo = "Scales"; break;
						case 33: wordTwo = "Towers"; break;
						case 34: wordTwo = "Overlook"; break;
						case 35: wordTwo = "Dominion"; break;
						case 36: wordTwo = "Slopes"; break;
						case 37: wordTwo = "Canyon"; break;
						case 38: wordTwo = "Trailhead"; break;
						case 39: wordTwo = "Gulch"; break;
						case 40: wordTwo = "Drop-off"; break;
						case 41: wordTwo = "Bluffs"; break;
						case 42: wordTwo = "Precipice"; break;
						case 43: wordTwo = "Outcroppings"; break;
						case 44: wordTwo = "Crevasse"; break;
						case 45: wordTwo = "Gully"; break;
						case 46: wordTwo = "Hollows"; break;
						case 47: wordTwo = "Chasm"; break;
						case 48: wordTwo = "Rift"; break;
						case 49: wordTwo = "Divide"; break;
						case 50: wordTwo = "Breaks"; break;
						}
					}
					//Open Water
					else if(desiredTerrain == "Beach/Water"){
						finalWord = 1 + (int) (Math.random() *43);
						switch(finalWord){
						case 1: wordTwo = "Ocean"; break;
						case 2: wordTwo = "Depths"; break;
						case 3: wordTwo = "Deep"; break;
						case 4: wordTwo = "Sea"; break;
						case 5: wordTwo = "Lake"; break;
						case 6: wordTwo = "Pond"; break;
						case 7: wordTwo = "Shoals"; break;
						case 8: wordTwo = "Reef"; break;
						case 9: wordTwo = "Iceberg"; break;
						case 10: wordTwo = "Waters"; break;
						case 11: wordTwo = "Seafloor"; break;
						case 12: wordTwo = "Coast"; break;
						case 13: wordTwo = "Shores"; break;
						case 14: wordTwo = "Seaway"; break;
						case 15: wordTwo = "Expanse"; break;
						case 16: wordTwo = "Brine"; break;
						case 17: wordTwo = "Shallows"; break;
						case 18: wordTwo = "Shelf"; break;
						case 19: wordTwo = "Bank"; break;
						case 20: wordTwo = "Sandbar"; break;
						case 21: wordTwo = "Sandbank"; break;
						case 22: wordTwo = "Floes"; break;
						case 23: wordTwo = "Whitecaps"; break;
						case 24: wordTwo = "Tides"; break;
						case 25: wordTwo = "Currents"; break;
						case 26: wordTwo = "Abyss"; break;
						case 27: wordTwo = "Sink"; break;
						case 28: wordTwo = "Drink"; break;
						case 29: wordTwo = "Blue"; break;
						case 30: wordTwo = "Tradewinds"; break;
						case 31: wordTwo = "Seabed"; break;
						case 32: wordTwo = "Basin"; break;
						case 33: wordTwo = "Resevoir"; break;
						case 34: wordTwo = "Pool"; break;
						case 35: wordTwo = "Shoreline"; break;
						case 36: wordTwo = "Puddle"; break;
						case 37: wordTwo = "Dive"; break;
						case 38: wordTwo = "Bounding Main"; break;
						case 39: wordTwo = "Dark"; break;
						case 40: wordTwo = "Unknown"; break;
						case 41: wordTwo = "Bay"; break;
						case 42: wordTwo = "Inlet"; break;
						case 43: wordTwo = "Fjord"; break;
						}
					}
					//Plains
					else if(desiredTerrain == "Plains"){
						finalWord = 1 + (int) (Math.random() *30);
						switch(finalWord){
						case 1: wordTwo = "Fields"; break;
						case 2: wordTwo = "Flats"; break;
						case 3: wordTwo = "Shrubland"; break;
						case 4: wordTwo = "Flats"; break;
						case 5: wordTwo = "Grassland"; break;
						case 6: wordTwo = "Glades"; break;
						case 7: wordTwo = "Clearing"; break;
						case 8: wordTwo = "Meadow"; break;
						case 9: wordTwo = "Pasture"; break;
						case 10: wordTwo = "Prairie"; break;
						case 11: wordTwo = "Hayfield"; break;
						case 12: wordTwo = "Savanna"; break;
						case 13: wordTwo = "Plains"; break;
						case 14: wordTwo = "Grazelands"; break;
						case 15: wordTwo = "Meadowland"; break;
						case 16: wordTwo = "Battlefield"; break;
						case 17: wordTwo = "Rangelands"; break;
						case 18: wordTwo = "Trek"; break;
						case 19: wordTwo = "Path"; break;
						case 20: wordTwo = "Midway"; break;
						case 21: wordTwo = "Intermediate"; break;
						case 22: wordTwo = "Straights"; break;
						case 23: wordTwo = "Between"; break;
						case 24: wordTwo = "Intermediary"; break;
						case 25: wordTwo = "Tundra"; break;
						case 26: wordTwo = "Farmland"; break;
						case 27: wordTwo = "Forage"; break;
						case 28: wordTwo = "Wilds"; break;
						case 29: wordTwo = "Wilderness"; break;
						case 30: wordTwo = "Thornlands"; break;
						}
					}
					//River
					else if(desiredTerrain == "River"){
						finalWord = 1 + (int) (Math.random() *28);
						switch(finalWord){
						case 1: wordTwo = "River"; break;
						case 2: wordTwo = "Creek"; break;
						case 3: wordTwo = "Brook"; break;
						case 4: wordTwo = "Stream"; break;
						case 5: wordTwo = "Ril"; break;
						case 6: wordTwo = "Rivulet"; break;
						case 7: wordTwo = "Waterfall"; break;
						case 8: wordTwo = "Falls"; break;
						case 9: wordTwo = "Cascade"; break;
						case 10: wordTwo = "Rapids"; break;
						case 11: wordTwo = "Waterway"; break;
						case 12: wordTwo = "Riverbed"; break;
						case 13: wordTwo = "Estuary"; break;
						case 14: wordTwo = "Riverine"; break;
						case 15: wordTwo = "Floes"; break;
						case 16: wordTwo = "Overflow"; break;
						case 17: wordTwo = "Flow"; break;
						case 18: wordTwo = "Watercourse"; break;
						case 19: wordTwo = "Torrent"; break;
						case 20: wordTwo = "Deluge"; break;
						case 21: wordTwo = "Waterspout"; break;
						case 22: wordTwo = "Barrage"; break;
						case 23: wordTwo = "Waters"; break;
						case 24: wordTwo = "Creekbed"; break;
						case 25: wordTwo = "Canal"; break;
						case 26: wordTwo = "Channel"; break;
						case 27: wordTwo = "Route"; break;
						case 28: wordTwo = "Duct"; break;
						}
					}
					//Swamp
					else if(desiredTerrain == "Swamp"){
						finalWord = 1 + (int) (Math.random() *20);
						switch(finalWord){
						case 1: wordTwo = "Marsh"; break;
						case 2: wordTwo = "Swamp"; break;
						case 3: wordTwo = "Bog"; break;
						case 4: wordTwo = "Moors"; break;
						case 5: wordTwo = "Bayou"; break;
						case 6: wordTwo = "Marshlands"; break;
						case 7: wordTwo = "Swamplands"; break;
						case 8: wordTwo = "Wetlands"; break;
						case 9: wordTwo = "Mire"; break;
						case 10: wordTwo = "Sloughs"; break;
						case 11: wordTwo = "Fen"; break;
						case 12: wordTwo = "Floodplain"; break;
						case 13: wordTwo = "Muskeg"; break;
						case 14: wordTwo = "Fenway"; break;
						case 15: wordTwo = "Mudflats"; break;
						case 16: wordTwo = "Lagoon"; break;
						case 17: wordTwo = "Wastes"; break;
						case 18: wordTwo = "Fill"; break;
						case 19: wordTwo = "Rot"; break;
						case 20: wordTwo = "Decay"; break;
						}
					}
					//Underground
					else if(desiredTerrain == "Underground"){
						finalWord = 1 + (int) (Math.random() *51);
						switch(finalWord){
						case 1: wordTwo = "Caves"; break;
						case 2: wordTwo = "Cavern"; break;
						case 3: wordTwo = "Alcove"; break;
						case 4: wordTwo = "Tunnels"; break;
						case 5: wordTwo = "Mines"; break;
						case 6: wordTwo = "Vents"; break;
						case 7: wordTwo = "Cove"; break;
						case 8: wordTwo = "Den"; break;
						case 9: wordTwo = "Pit"; break;
						case 10: wordTwo = "Hole"; break;
						case 11: wordTwo = "Abyss"; break;
						case 12: wordTwo = "Chasm"; break;
						case 13: wordTwo = "Atrium"; break;
						case 14: wordTwo = "Vault"; break;
						case 15: wordTwo = "Burrow"; break;
						case 16: wordTwo = "Underpass"; break;
						case 17: wordTwo = "Passageway"; break;
						case 18: wordTwo = "Corridor"; break;
						case 19: wordTwo = "Underground"; break;
						case 20: wordTwo = "Depth"; break;
						case 21: wordTwo = "Dark"; break;
						case 22: wordTwo = "Deep"; break;
						case 23: wordTwo = "Borehole"; break;
						case 24: wordTwo = "Footbridge"; break;
						case 25: wordTwo = "Backdoor"; break;
						case 26: wordTwo = "Maw"; break;
						case 27: wordTwo = "Trench"; break;
						case 28: wordTwo = "Crater"; break;
						case 29: wordTwo = "Drain"; break;
						case 30: wordTwo = "Void"; break;
						case 31: wordTwo = "Abyss"; break;
						case 32: wordTwo = "Pocket"; break;
						case 33: wordTwo = "Gorge"; break;
						case 34: wordTwo = "Quarry"; break;
						case 35: wordTwo = "Gulf"; break;
						case 36: wordTwo = "Gap"; break;
						case 37: wordTwo = "Divide"; break;
						case 38: wordTwo = "Rift"; break;
						case 39: wordTwo = "Schism"; break;
						case 40: wordTwo = "Oblivion"; break;
						case 41: wordTwo = "Crevasse"; break;
						case 42: wordTwo = "Scar"; break;
						case 43: wordTwo = "Catacombs"; break;
						case 44: wordTwo = "Labyrinth"; break;
						case 45: wordTwo = "Dungeon"; break;
						case 46: wordTwo = "Ruins"; break;
						case 47: wordTwo = "Tombs"; break;
						case 48: wordTwo = "Maze"; break;
						case 49: wordTwo = "Shaft"; break;
						case 50: wordTwo = "Drifts"; break;
						case 51: wordTwo = "Chambers"; break;
						}
					}
					//Urban
					else if(desiredTerrain == "Urban"){
						finalWord = 1 + (int) (Math.random() *85);
						switch(finalWord){
						case 1: wordTwo = "Castle"; break;
						case 2: wordTwo = "Village"; break;
						case 3: wordTwo = "Keep"; break;
						case 4: wordTwo = "Stronghold"; break;
						case 5: wordTwo = "Town"; break;
						case 6: wordTwo = "City"; break;
						case 7: wordTwo = "Township"; break;
						case 8: wordTwo = "Bastion"; break;
						case 9: wordTwo = "Foothold"; break;
						case 10: wordTwo = "Outpost"; break;
						case 11: wordTwo = "Bulwark"; break;
						case 12: wordTwo = "Haven"; break;
						case 13: wordTwo = "Lair"; break;
						case 14: wordTwo = "Base"; break;
						case 15: wordTwo = "Fort"; break;
						case 16: wordTwo = "Bunker"; break;
						case 17: wordTwo = "Enclave"; break;
						case 18: wordTwo = "Garrison"; break;
						case 19: wordTwo = "Encampment"; break;
						case 20: wordTwo = "Citadel"; break;
						case 21: wordTwo = "Fortress"; break;
						case 22: wordTwo = "Fief"; break;
						case 23: wordTwo = "Fortification"; break;
						case 24: wordTwo = "Tower"; break;
						case 25: wordTwo = "Spire"; break;
						case 26: wordTwo = "Palace"; break;
						case 27: wordTwo = "Stockade"; break;
						case 28: wordTwo = "Wall"; break;
						case 29: wordTwo = "Mansion"; break;
						case 30: wordTwo = "Chateau"; break;
						case 31: wordTwo = "Temple"; break;
						case 32: wordTwo = "Cathedral"; break;
						case 33: wordTwo = "Mausoleum"; break;
						case 34: wordTwo = "Guildhall"; break;
						case 35: wordTwo = "Hall"; break;
						case 36: wordTwo = "Sepulcher"; break;
						case 37: wordTwo = "Shrine"; break;
						case 38: wordTwo = "Monastery"; break;
						case 39: wordTwo = "Monument"; break;
						case 40: wordTwo = "Sanctuary"; break;
						case 41: wordTwo = "Pantheon"; break;
						case 42: wordTwo = "Cemetery"; break;
						case 43: wordTwo = "Catacombs"; break;
						case 44: wordTwo = "Labyrinth"; break;
						case 45: wordTwo = "Dungeon"; break;
						case 46: wordTwo = "Ruins"; break;
						case 47: wordTwo = "Tombs"; break;
						case 48: wordTwo = "Maze"; break;
						case 49: wordTwo = "Crypt"; break;
						case 50: wordTwo = "Graveyard"; break;
						case 51: wordTwo = "Memorial"; break;
						case 52: wordTwo = "Mortuary"; break;
						case 53: wordTwo = "Manor"; break;
						case 54: wordTwo = "Watchtower"; break;
						case 55: wordTwo = "Palisade"; break;
						case 56: wordTwo = "Rampart"; break;
						case 57: wordTwo = "Barricade"; break;
						case 58: wordTwo = "Hamlet"; break;
						case 59: wordTwo = "Settlement"; break;
						case 60: wordTwo = "Cloister"; break;
						case 61: wordTwo = "Abbey"; break;
						case 62: wordTwo = "Priory"; break;
						case 63: wordTwo = "Harbor"; break;
						case 64: wordTwo = "Port"; break;
						case 65: wordTwo = "Wharf"; break;
						case 66: wordTwo = "Dock"; break;
						case 67: wordTwo = "Quay"; break;
						case 68: wordTwo = "Seaport"; break;
						case 69: wordTwo = "Pier"; break;
						case 70: wordTwo = "Fountain"; break;
						case 71: wordTwo = "Beacon"; break;
						case 72: wordTwo = "Road"; break;
						case 73: wordTwo = "Roadway"; break;
						case 74: wordTwo = "Path"; break;
						case 75: wordTwo = "Trail"; break;
						case 76: wordTwo = "Lane"; break;
						case 77: wordTwo = "Footpath"; break;
						case 78: wordTwo = "Pathway"; break;
						case 79: wordTwo = "Gateway"; break;
						case 80: wordTwo = "Sanctum"; break;
						case 81: wordTwo = "Anchorage"; break;
						case 82: wordTwo = "Kingdom"; break;
						case 83: wordTwo = "Empire"; break;
						case 84: wordTwo = "Realm"; break;
						case 85: wordTwo = "Monarchy"; break;
						}
					}
					
					if(locationOne == "error")
						locationOne = wordOne + " " + wordTwo;
					//else if(outputTwo == "error")
					//	outputTwo = wordOne + " " + wordTwo;
					//else if(outputThr == "error")
					//	outputThr = wordOne + " " + wordTwo;
					//else if(outputFou == "error")
					//	outputFou = wordOne + " " + wordTwo;
					//else if(outputFiv == "error")
					//	outputFiv = wordOne + " " + wordTwo;
					//else if(outputSix == "error")
					//	outputSix = wordOne + " " + wordTwo;
					//else if(outputSev == "error")
					//	outputSev = wordOne + " " + wordTwo;
					//else if(outputEig == "error")
					//	outputEig = wordOne + " " + wordTwo;
					//else if(outputNin == "error")
					//	outputNin = wordOne + " " + wordTwo;
					//else
					//	outputTen = wordOne + " " + wordTwo;
				}
				//Combined words go here
				if(wordAmount == 2){
					//Mostly Adjectives
					starterWord2 = 1 + (int) (Math.random() * 96);
						switch(starterWord2){
						case 1: word1 = "Frost"; break;
						case 2: word1 = "Glow"; break;
						case 3: word1 = "Scorch"; break;
						case 4: word1 = "Storm"; break;
						case 5: word1 = "Shatter"; break;
						case 6: word1 = "Splinter"; break;
						case 7: word1= "Flood"; break;
						case 8: word1 = "Abandon"; break;
						case 9: word1 = "Death"; break;
						case 10: word1 = "Titan"; break;
						case 11: word1 = "Dawn"; break;
						case 12: word1 = "Dusk"; break;
						case 13: word1 = "Curse"; break;
						case 14: word1 = "Harrow"; break;
						case 15: word1 = "Haunt"; break;
						case 16: word1 = "Drown"; break;
						case 17: word1 = "Blight"; break;
						case 18: word1 = "Cripple"; break;
						case 19: word1 = "Whisper"; break;
						case 20: word1 = "Thunder"; break;
						case 21: word1 = "Shimmer"; break;
						case 22: word1 = "Shadow"; break;
						case 23: word1 = "Mirror"; break;
						case 24: word1 = "Dream"; break;
						case 25: word1 = "Char"; break;
						case 26: word1 = "Break"; break;
						case 27: word1 = "Bleak"; break;
						case 28: word1 = "Mystic"; break;
						case 29: word1 = "Hero"; break;
						case 30: word1 = "Scald"; break;
						case 31: word1 = "Scarab"; break;
						case 32: word1 = "Snake"; break;
						case 33: word1 = "Crystal"; break;
						case 34: word1 = "Amber"; break;
						case 35: word1 = "Ruby"; break;
						case 36: word1 = "Sapphire"; break;
						case 37: word1 = "Diamond"; break;
						case 38: word1 = "Amethyst"; break;
						case 39: word1 = "Ghost"; break;
						case 40: word1 = "Wraith"; break;
						case 41: word1 = "Shade"; break;
						case 42: word1 = "Phantom"; break;
						case 43: word1 = "Sky"; break;
						case 44: word1 = "Raven"; break;
						case 45: word1 = "Tempest"; break;
						case 46: word1 = "Barrier"; break;
						case 47: word1 = "Bramble"; break;
						case 48: word1 = "Fox"; break;
						case 49: word1 = "Flow"; break;
						case 50: word1 = "Wolf"; break;
						case 51: word1 = "Chill"; break;
						case 52: word1 = "Spark"; break;
						case 53: word1 = "Kindle"; break;
						case 54: word1 = "Bright"; break;
						case 55: word1 = "Candle"; break;
						case 56: word1 = "Wild"; break;
						case 57: word1 = "Ever"; break;
						case 58: word1 = "Blister"; break;
						case 59: word1 = "Doom"; break;
						case 60: word1 = "Fate"; break;
						case 61: word1 = "Dread"; break;
						case 62: word1 = "Gloom"; break;
						case 63: word1 = "Foul"; break;
						case 64: word1 = "Vile"; break;
						case 65: word1 = "Beast"; break;
						case 66: word1 = "Dragon"; break;
						case 67: word1 = "Enchant"; break;
						case 68: word1 = "Spell"; break;
						case 69: word1 = "Magic"; break;
						case 70: word1 = "Fall"; break;
						case 71: word1 = "Crumble"; break;
						case 72: word1 = "Topple"; break;
						case 73: word1 = "Tatter"; break;
						case 74: word1 = "Shine"; break;
						case 75: word1 = "Blaze"; break;
						case 76: word1 = "Tarnish"; break;
						case 77: word1 = "Distort"; break;
						case 78: word1 = "Iron"; break;
						case 79: word1 = "Copper"; break;
						case 80: word1 = "Bronze"; break;
						case 81: word1 = "Brass"; break;
						case 82: word1 = "Silver"; break;
						case 83: word1 = "Gold"; break;
						case 84: word1 = "Tin"; break;
						case 85: word1 = "Chaos"; break;
						case 86: word1 = "Swarm"; break;
						case 87: word1 = "Sun"; break;
						case 88: word1 = "Moon"; break;
						case 89: word1 = "Tower"; break;
						case 90: word1 = "Climb"; break;
						case 91: word1 = "Summit"; break;
						case 92: word1 = "Brine"; break;
						case 93: word1 = "Plasma"; break;
						case 94: word1 = "Poison"; break;
						case 95: word1 = "Toxic"; break;
						case 96: word1 = "Hinder"; break;
						}
						//Mostly Nouns
					starterWord3 = 1 + (int) (Math.random() * 121);
						switch(starterWord3){
						case 1: word2 = "stone"; break;
						case 2: word2 = "root"; break;
						case 3: word2 = "wood"; break;
						case 4: word2 = "dew"; break;
						case 5: word2 = "leaf"; break;
						case 6: word2 = "brand"; break;
						case 7: word2 = "shred"; break;
						case 8: word2 = "quartz"; break;
						case 9: word2 = "bud"; break;
						case 10: word2 = "well"; break;
						case 11: word2 = "bark"; break;
						case 12: word2 = "branch"; break;
						case 13: word2 = "brush"; break;
						case 14: word2 = "blade"; break;
						case 15: word2 = "bush"; break;
						case 16: word2 = "ore"; break;
						case 17: word2 = "spear"; break;
						case 18: word2 = "flake"; break;
						case 19: word2 = "core"; break;
						case 20: word2 = "scrap"; break;
						case 21: word2 = "plate"; break;
						case 22: word2 = "glass"; break;
						case 23: word2 = "flint"; break;
						case 24: word2 = "ice"; break;
						case 25: word2 = "grass"; break;
						case 26: word2 = "wall"; break;
						case 27: word2 = "hook"; break;
						case 28: word2 = "wing"; break;
						case 29: word2 = "tail"; break;
						case 30: word2 = "touch"; break;
						case 31: word2 = "star"; break;
						case 32: word2 = "guise"; break;
						case 33: word2 = "cloak"; break;
						case 34: word2 = "veil"; break;
						case 35: word2 = "shroud"; break;
						case 36: word2 = "sound"; break;
						case 37: word2 = "sight"; break;
						case 38: word2 = "step"; break;
						case 39: word2 = "vine"; break;
						case 40: word2 = "foot"; break;
						case 41: word2 = "thorn"; break;
						case 42: word2 = "walk"; break;
						case 43: word2 = "eye"; break;
						case 44: word2 = "fire"; break;
						case 45: word2 = "flame"; break;
						case 46: word2 = "torch"; break;
						case 47: word2 = "wick"; break;
						case 48: word2 = "flare"; break;
						case 49: word2 = "blood"; break;
						case 50: word2 = "skull"; break;
						case 51: word2 = "soot"; break;
						case 52: word2 = "light"; break;
						case 53: word2 = "haze"; break;
						case 54: word2 = "smoke"; break;
						case 55: word2 = "mist"; break;
						case 56: word2 = "dust"; break;
						case 57: word2 = "wisp"; break;
						case 58: word2 = "wind"; break;
						case 59: word2 = "edge"; break;
						case 60: word2 = "weed"; break;
						case 61: word2 = "breath"; break;
						case 62: word2 = "claw"; break;
						case 63: word2 = "fang"; break;
						case 64: word2 = "spike"; break;
						case 65: word2 = "pod"; break;
						case 66: word2 = "stump"; break;
						case 67: word2 = "trunk"; break;
						case 68: word2 = "twig"; break;
						case 69: word2 = "salt"; break;
						case 70: word2 = "drop"; break;
						case 71: word2 = "sink"; break;
						case 72: word2 = "flat"; break;
						case 73: word2 = "low"; break;
						case 74: word2 = "rout"; break;
						case 75: word2 = "soar"; break;
						case 76: word2 = "lace"; break;
						case 77: word2 = "surge"; break;
						case 78: word2 = "rush"; break;
						case 79: word2 = "wave"; break;
						case 80: word2 = "burst"; break;
						case 81: word2 = "peak"; break;
						case 82: word2 = "leap"; break;
						case 83: word2 = "bite"; break;
						case 84: word2 = "sting"; break;
						case 85: word2 = "chomp"; break;
						case 86: word2 = "stab"; break;
						case 87: word2 = "slash"; break;
						case 88: word2 = "swipe"; break;
						case 89: word2 = "strike"; break;
						case 90: word2 = "slit"; break;
						case 91: word2 = "maul"; break;
						case 92: word2 = "cold"; break;
						case 93: word2 = "soul"; break;
						case 94: word2 = "life"; break;
						case 95: word2 = "way"; break;
						case 96: word2 = "cloud"; break;
						case 97: word2 = "tooth"; break;
						case 98: word2 = "tusk"; break;
						case 99: word2 = "lock"; break;
						case 100: word2 = "pick"; break;
						case 101: word2 = "sword"; break;
						case 102: word2 = "shield"; break;
						case 103: word2 = "guard"; break;
						case 104: word2 = "ward"; break;
						case 105: word2 = "zone"; break;
						case 106: word2 = "ground"; break;
						case 107: word2 = "rock"; break;
						case 108: word2 = "gust"; break;
						case 109: word2 = "gale"; break;
						case 110: word2 = "scroll"; break;
						case 111: word2 = "book"; break;
						case 112: word2 = "harm"; break;
						case 113: word2 = "heal"; break;
						case 114: word2 = "bind"; break;
						case 115: word2 = "cage"; break;
						case 116: word2 = "rune"; break;
						case 117: word2 = "sign"; break;
						case 118: word2 = "core"; break;
						case 119: word2 = "heart"; break;
						case 120: word2 = "fear"; break;
						case 121: word2 = "fright"; break;
						
						}
						//Desert
						if(desiredTerrain == "Desert"){
							finalWord = 1 + (int) (Math.random() *20);
							switch(finalWord){
							case 1: wordTwo = "Desert"; break;
							case 2: wordTwo = "Oasis"; break;
							case 3: wordTwo = "Desolation"; break;
							case 4: wordTwo = "Solitude"; break;
							case 5: wordTwo = "Wastes"; break;
							case 6: wordTwo = "Wilds"; break;
							case 7: wordTwo = "Expanse"; break;
							case 8: wordTwo = "Dunes"; break;
							case 9: wordTwo = "Straights"; break;
							case 10: wordTwo = "Gulch"; break;
							case 11: wordTwo = "Sanctuary"; break;
							case 12: wordTwo = "Barren"; break;
							case 13: wordTwo = "Badlands"; break;
							case 14: wordTwo = "Flats"; break;
							case 15: wordTwo = "Wasteland"; break;
							case 16: wordTwo = "Devastation"; break;
							case 17: wordTwo = "Seclusion"; break;
							case 18: wordTwo = "Withdrawal"; break;
							case 19: wordTwo = "Isolation"; break;
							case 20: wordTwo = "Sands"; break;
						}
						}
						//Forest
						else if(desiredTerrain == "Forest"){
							finalWord = 1 + (int) (Math.random() *29);
							switch(finalWord){
							case 1: wordTwo = "Forest"; break;
							case 2: wordTwo = "Backwoods"; break;
							case 3: wordTwo = "Bramble"; break;
							case 4: wordTwo = "Briar"; break;
							case 5: wordTwo = "Chapparel"; break;
							case 6: wordTwo = "Hinterland"; break;
							case 7: wordTwo = "Thicket"; break;
							case 8: wordTwo = "Wilds"; break;
							case 9: wordTwo = "Wilderness"; break;
							case 10: wordTwo = "Timber"; break;
							case 11: wordTwo = "Jungle"; break;
							case 12: wordTwo = "Wood"; break;
							case 13: wordTwo = "Woods"; break;
							case 14: wordTwo = "Woodland"; break;
							case 15: wordTwo = "Timberland"; break;
							case 16: wordTwo = "Grove"; break;
							case 17: wordTwo = "Outback"; break;
							case 18: wordTwo = "Orchard"; break;
							case 19: wordTwo = "Plantation"; break;
							case 20: wordTwo = "Undergrowth"; break;
							case 21: wordTwo = "Maze"; break;
							case 22: wordTwo = "Labyrinth"; break;
							case 23: wordTwo = "Tangle"; break;
							case 24: wordTwo = "Web"; break;
							case 25: wordTwo = "Brushwood"; break;
							case 26: wordTwo = "Bosk"; break;
							case 27: wordTwo = "Alcove"; break;
							case 28: wordTwo = "Arbor"; break;
							case 29: wordTwo = "Nest"; break;
						}
						}
						//Hills
						else if(desiredTerrain == "Hills"){	
							finalWord = 1 + (int) (Math.random() *26);
							switch(finalWord){
							case 1: wordTwo = "Highlands"; break;
							case 2: wordTwo = "Hills"; break;
							case 3: wordTwo = "Hill"; break;
							case 4: wordTwo = "Uplands"; break;
							case 5: wordTwo = "Downs"; break;
							case 6: wordTwo = "Inclines"; break;
							case 7: wordTwo = "Slopes"; break;
							case 8: wordTwo = "Hillside"; break;
							case 9: wordTwo = "Rise"; break;
							case 10: wordTwo = "Headlands"; break;
							case 11: wordTwo = "Slumps"; break;
							case 12: wordTwo = "Foothills"; break;
							case 13: wordTwo = "Mounds"; break;
							case 14: wordTwo = "Heaps"; break;
							case 15: wordTwo = "Swells"; break;
							case 16: wordTwo = "Embankments"; break;
							case 17: wordTwo = "Hillocks"; break;
							case 18: wordTwo = "Lumps"; break;
							case 19: wordTwo = "Cascades"; break;
							case 20: wordTwo = "Dunes"; break;
							case 21: wordTwo = "Valleys"; break;
							case 22: wordTwo = "Crescendos"; break;
							case 23: wordTwo = "Ripples"; break;
							case 24: wordTwo = "Plateaus"; break;
							case 25: wordTwo = "Outskirts"; break;
							case 26: wordTwo = "Steppes"; break;
							}
						}
						//Mountains
						else if(desiredTerrain == "Mountains"){	
							finalWord = 1 + (int) (Math.random() *50);
							switch(finalWord){
							case 1: wordTwo = "Mountains"; break;
							case 2: wordTwo = "Mount"; break;
							case 3: wordTwo = "Cliff"; break;
							case 4: wordTwo = "Peak"; break;
							case 5: wordTwo = "Knoll"; break;
							case 6: wordTwo = "Ridge"; break;
							case 7: wordTwo = "Terrace"; break;
							case 8: wordTwo = "Ridgeline"; break;
							case 9: wordTwo = "Ravine"; break;
							case 10: wordTwo = "Mountaintop"; break;
							case 11: wordTwo = "Clifftop"; break;
							case 12: wordTwo = "Alpines"; break;
							case 13: wordTwo = "Volcano"; break;
							case 14: wordTwo = "Hike"; break;
							case 15: wordTwo = "Climb"; break;
							case 16: wordTwo = "Ledges"; break;
							case 17: wordTwo = "Aretes"; break;
							case 18: wordTwo = "Crest"; break;
							case 19: wordTwo = "Spire"; break;
							case 20: wordTwo = "Bridge"; break;
							case 21: wordTwo = "Snowcap"; break;
							case 22: wordTwo = "Crag"; break;
							case 23: wordTwo = "Butte"; break;
							case 24: wordTwo = "Gorge"; break;
							case 25: wordTwo = "Grotto"; break;
							case 26: wordTwo = "Pike"; break;
							case 27: wordTwo = "Arch"; break;
							case 28: wordTwo = "Range"; break;
							case 29: wordTwo = "Pass"; break;
							case 30: wordTwo = "Domain"; break;
							case 31: wordTwo = "Passage"; break;
							case 32: wordTwo = "Scales"; break;
							case 33: wordTwo = "Towers"; break;
							case 34: wordTwo = "Overlook"; break;
							case 35: wordTwo = "Dominion"; break;
							case 36: wordTwo = "Slopes"; break;
							case 37: wordTwo = "Canyon"; break;
							case 38: wordTwo = "Trailhead"; break;
							case 39: wordTwo = "Gulch"; break;
							case 40: wordTwo = "Drop-off"; break;
							case 41: wordTwo = "Bluffs"; break;
							case 42: wordTwo = "Precipice"; break;
							case 43: wordTwo = "Outcroppings"; break;
							case 44: wordTwo = "Crevasse"; break;
							case 45: wordTwo = "Gully"; break;
							case 46: wordTwo = "Hollows"; break;
							case 47: wordTwo = "Chasm"; break;
							case 48: wordTwo = "Rift"; break;
							case 49: wordTwo = "Divide"; break;
							case 50: wordTwo = "Breaks"; break;
							}
						}
						//Open Water
						else if(desiredTerrain == "Beach/Water"){
							finalWord = 1 + (int) (Math.random() *43);
							switch(finalWord){
							case 1: wordTwo = "Ocean"; break;
							case 2: wordTwo = "Depths"; break;
							case 3: wordTwo = "Deep"; break;
							case 4: wordTwo = "Sea"; break;
							case 5: wordTwo = "Lake"; break;
							case 6: wordTwo = "Pond"; break;
							case 7: wordTwo = "Shoals"; break;
							case 8: wordTwo = "Reef"; break;
							case 9: wordTwo = "Iceberg"; break;
							case 10: wordTwo = "Waters"; break;
							case 11: wordTwo = "Seafloor"; break;
							case 12: wordTwo = "Coast"; break;
							case 13: wordTwo = "Shores"; break;
							case 14: wordTwo = "Seaway"; break;
							case 15: wordTwo = "Expanse"; break;
							case 16: wordTwo = "Brine"; break;
							case 17: wordTwo = "Shallows"; break;
							case 18: wordTwo = "Shelf"; break;
							case 19: wordTwo = "Bank"; break;
							case 20: wordTwo = "Sandbar"; break;
							case 21: wordTwo = "Sandbank"; break;
							case 22: wordTwo = "Floes"; break;
							case 23: wordTwo = "Whitecaps"; break;
							case 24: wordTwo = "Tides"; break;
							case 25: wordTwo = "Currents"; break;
							case 26: wordTwo = "Abyss"; break;
							case 27: wordTwo = "Sink"; break;
							case 28: wordTwo = "Drink"; break;
							case 29: wordTwo = "Blue"; break;
							case 30: wordTwo = "Tradewinds"; break;
							case 31: wordTwo = "Seabed"; break;
							case 32: wordTwo = "Basin"; break;
							case 33: wordTwo = "Resevoir"; break;
							case 34: wordTwo = "Pool"; break;
							case 35: wordTwo = "Shoreline"; break;
							case 36: wordTwo = "Puddle"; break;
							case 37: wordTwo = "Dive"; break;
							case 38: wordTwo = "Bounding Main"; break;
							case 39: wordTwo = "Dark"; break;
							case 40: wordTwo = "Unknown"; break;
							case 41: wordTwo = "Bay"; break;
							case 42: wordTwo = "Inlet"; break;
							case 43: wordTwo = "Fjord"; break;
							}
						}
						//Plains
						else if(desiredTerrain == "Plains"){
							finalWord = 1 + (int) (Math.random() *30);
							switch(finalWord){
							case 1: wordTwo = "Fields"; break;
							case 2: wordTwo = "Flats"; break;
							case 3: wordTwo = "Shrubland"; break;
							case 4: wordTwo = "Flats"; break;
							case 5: wordTwo = "Grassland"; break;
							case 6: wordTwo = "Glades"; break;
							case 7: wordTwo = "Clearing"; break;
							case 8: wordTwo = "Meadow"; break;
							case 9: wordTwo = "Pasture"; break;
							case 10: wordTwo = "Prairie"; break;
							case 11: wordTwo = "Hayfield"; break;
							case 12: wordTwo = "Savanna"; break;
							case 13: wordTwo = "Plains"; break;
							case 14: wordTwo = "Grazelands"; break;
							case 15: wordTwo = "Meadowland"; break;
							case 16: wordTwo = "Battlefield"; break;
							case 17: wordTwo = "Rangelands"; break;
							case 18: wordTwo = "Trek"; break;
							case 19: wordTwo = "Path"; break;
							case 20: wordTwo = "Midway"; break;
							case 21: wordTwo = "Intermediate"; break;
							case 22: wordTwo = "Straights"; break;
							case 23: wordTwo = "Between"; break;
							case 24: wordTwo = "Intermediary"; break;
							case 25: wordTwo = "Tundra"; break;
							case 26: wordTwo = "Farmland"; break;
							case 27: wordTwo = "Forage"; break;
							case 28: wordTwo = "Wilds"; break;
							case 29: wordTwo = "Wilderness"; break;
							case 30: wordTwo = "Thornlands"; break;
							}
						}
						//River
						else if(desiredTerrain == "River"){
							finalWord = 1 + (int) (Math.random() *28);
							switch(finalWord){
							case 1: wordTwo = "River"; break;
							case 2: wordTwo = "Creek"; break;
							case 3: wordTwo = "Brook"; break;
							case 4: wordTwo = "Stream"; break;
							case 5: wordTwo = "Ril"; break;
							case 6: wordTwo = "Rivulet"; break;
							case 7: wordTwo = "Waterfall"; break;
							case 8: wordTwo = "Falls"; break;
							case 9: wordTwo = "Cascade"; break;
							case 10: wordTwo = "Rapids"; break;
							case 11: wordTwo = "Waterway"; break;
							case 12: wordTwo = "Riverbed"; break;
							case 13: wordTwo = "Estuary"; break;
							case 14: wordTwo = "Riverine"; break;
							case 15: wordTwo = "Floes"; break;
							case 16: wordTwo = "Overflow"; break;
							case 17: wordTwo = "Flow"; break;
							case 18: wordTwo = "Watercourse"; break;
							case 19: wordTwo = "Torrent"; break;
							case 20: wordTwo = "Deluge"; break;
							case 21: wordTwo = "Waterspout"; break;
							case 22: wordTwo = "Barrage"; break;
							case 23: wordTwo = "Waters"; break;
							case 24: wordTwo = "Creekbed"; break;
							case 25: wordTwo = "Canal"; break;
							case 26: wordTwo = "Channel"; break;
							case 27: wordTwo = "Route"; break;
							case 28: wordTwo = "Duct"; break;
							}
						}
						//Swamp
						else if(desiredTerrain == "Swamp"){
							finalWord = 1 + (int) (Math.random() *20);
							switch(finalWord){
							case 1: wordTwo = "Marsh"; break;
							case 2: wordTwo = "Swamp"; break;
							case 3: wordTwo = "Bog"; break;
							case 4: wordTwo = "Moors"; break;
							case 5: wordTwo = "Bayou"; break;
							case 6: wordTwo = "Marshlands"; break;
							case 7: wordTwo = "Swamplands"; break;
							case 8: wordTwo = "Wetlands"; break;
							case 9: wordTwo = "Mire"; break;
							case 10: wordTwo = "Sloughs"; break;
							case 11: wordTwo = "Fen"; break;
							case 12: wordTwo = "Floodplain"; break;
							case 13: wordTwo = "Muskeg"; break;
							case 14: wordTwo = "Fenway"; break;
							case 15: wordTwo = "Mudflats"; break;
							case 16: wordTwo = "Lagoon"; break;
							case 17: wordTwo = "Wastes"; break;
							case 18: wordTwo = "Fill"; break;
							case 19: wordTwo = "Rot"; break;
							case 20: wordTwo = "Decay"; break;
							}
						}
						//Underground
						else if(desiredTerrain == "Underground"){
							finalWord = 1 + (int) (Math.random() *51);
							switch(finalWord){
							case 1: wordTwo = "Caves"; break;
							case 2: wordTwo = "Cavern"; break;
							case 3: wordTwo = "Alcove"; break;
							case 4: wordTwo = "Tunnels"; break;
							case 5: wordTwo = "Mines"; break;
							case 6: wordTwo = "Vents"; break;
							case 7: wordTwo = "Cove"; break;
							case 8: wordTwo = "Den"; break;
							case 9: wordTwo = "Pit"; break;
							case 10: wordTwo = "Hole"; break;
							case 11: wordTwo = "Abyss"; break;
							case 12: wordTwo = "Chasm"; break;
							case 13: wordTwo = "Atrium"; break;
							case 14: wordTwo = "Vault"; break;
							case 15: wordTwo = "Burrow"; break;
							case 16: wordTwo = "Underpass"; break;
							case 17: wordTwo = "Passageway"; break;
							case 18: wordTwo = "Corridor"; break;
							case 19: wordTwo = "Underground"; break;
							case 20: wordTwo = "Depth"; break;
							case 21: wordTwo = "Dark"; break;
							case 22: wordTwo = "Deep"; break;
							case 23: wordTwo = "Borehole"; break;
							case 24: wordTwo = "Footbridge"; break;
							case 25: wordTwo = "Backdoor"; break;
							case 26: wordTwo = "Maw"; break;
							case 27: wordTwo = "Trench"; break;
							case 28: wordTwo = "Crater"; break;
							case 29: wordTwo = "Drain"; break;
							case 30: wordTwo = "Void"; break;
							case 31: wordTwo = "Abyss"; break;
							case 32: wordTwo = "Pocket"; break;
							case 33: wordTwo = "Gorge"; break;
							case 34: wordTwo = "Quarry"; break;
							case 35: wordTwo = "Gulf"; break;
							case 36: wordTwo = "Gap"; break;
							case 37: wordTwo = "Divide"; break;
							case 38: wordTwo = "Rift"; break;
							case 39: wordTwo = "Schism"; break;
							case 40: wordTwo = "Oblivion"; break;
							case 41: wordTwo = "Crevasse"; break;
							case 42: wordTwo = "Scar"; break;
							case 43: wordTwo = "Catacombs"; break;
							case 44: wordTwo = "Labyrinth"; break;
							case 45: wordTwo = "Dungeon"; break;
							case 46: wordTwo = "Ruins"; break;
							case 47: wordTwo = "Tombs"; break;
							case 48: wordTwo = "Maze"; break;
							case 49: wordTwo = "Shaft"; break;
							case 50: wordTwo = "Drifts"; break;
							case 51: wordTwo = "Chambers"; break;
							}
						}
						//Urban
						else if(desiredTerrain == "Urban"){
							finalWord = 1 + (int) (Math.random() *85);
							switch(finalWord){
							case 1: wordTwo = "Castle"; break;
							case 2: wordTwo = "Village"; break;
							case 3: wordTwo = "Keep"; break;
							case 4: wordTwo = "Stronghold"; break;
							case 5: wordTwo = "Town"; break;
							case 6: wordTwo = "City"; break;
							case 7: wordTwo = "Township"; break;
							case 8: wordTwo = "Bastion"; break;
							case 9: wordTwo = "Foothold"; break;
							case 10: wordTwo = "Outpost"; break;
							case 11: wordTwo = "Bulwark"; break;
							case 12: wordTwo = "Haven"; break;
							case 13: wordTwo = "Lair"; break;
							case 14: wordTwo = "Base"; break;
							case 15: wordTwo = "Fort"; break;
							case 16: wordTwo = "Bunker"; break;
							case 17: wordTwo = "Enclave"; break;
							case 18: wordTwo = "Garrison"; break;
							case 19: wordTwo = "Encampment"; break;
							case 20: wordTwo = "Citadel"; break;
							case 21: wordTwo = "Fortress"; break;
							case 22: wordTwo = "Fief"; break;
							case 23: wordTwo = "Fortification"; break;
							case 24: wordTwo = "Tower"; break;
							case 25: wordTwo = "Spire"; break;
							case 26: wordTwo = "Palace"; break;
							case 27: wordTwo = "Stockade"; break;
							case 28: wordTwo = "Wall"; break;
							case 29: wordTwo = "Mansion"; break;
							case 30: wordTwo = "Chateau"; break;
							case 31: wordTwo = "Temple"; break;
							case 32: wordTwo = "Cathedral"; break;
							case 33: wordTwo = "Mausoleum"; break;
							case 34: wordTwo = "Guildhall"; break;
							case 35: wordTwo = "Hall"; break;
							case 36: wordTwo = "Sepulcher"; break;
							case 37: wordTwo = "Shrine"; break;
							case 38: wordTwo = "Monastery"; break;
							case 39: wordTwo = "Monument"; break;
							case 40: wordTwo = "Sanctuary"; break;
							case 41: wordTwo = "Pantheon"; break;
							case 42: wordTwo = "Cemetery"; break;
							case 43: wordTwo = "Catacombs"; break;
							case 44: wordTwo = "Labyrinth"; break;
							case 45: wordTwo = "Dungeon"; break;
							case 46: wordTwo = "Ruins"; break;
							case 47: wordTwo = "Tombs"; break;
							case 48: wordTwo = "Maze"; break;
							case 49: wordTwo = "Crypt"; break;
							case 50: wordTwo = "Graveyard"; break;
							case 51: wordTwo = "Memorial"; break;
							case 52: wordTwo = "Mortuary"; break;
							case 53: wordTwo = "Manor"; break;
							case 54: wordTwo = "Watchtower"; break;
							case 55: wordTwo = "Palisade"; break;
							case 56: wordTwo = "Rampart"; break;
							case 57: wordTwo = "Barricade"; break;
							case 58: wordTwo = "Hamlet"; break;
							case 59: wordTwo = "Settlement"; break;
							case 60: wordTwo = "Cloister"; break;
							case 61: wordTwo = "Abbey"; break;
							case 62: wordTwo = "Priory"; break;
							case 63: wordTwo = "Harbor"; break;
							case 64: wordTwo = "Port"; break;
							case 65: wordTwo = "Wharf"; break;
							case 66: wordTwo = "Dock"; break;
							case 67: wordTwo = "Quay"; break;
							case 68: wordTwo = "Seaport"; break;
							case 69: wordTwo = "Pier"; break;
							case 70: wordTwo = "Fountain"; break;
							case 71: wordTwo = "Beacon"; break;
							case 72: wordTwo = "Road"; break;
							case 73: wordTwo = "Roadway"; break;
							case 74: wordTwo = "Path"; break;
							case 75: wordTwo = "Trail"; break;
							case 76: wordTwo = "Lane"; break;
							case 77: wordTwo = "Footpath"; break;
							case 78: wordTwo = "Pathway"; break;
							case 79: wordTwo = "Gateway"; break;
							case 80: wordTwo = "Sanctum"; break;
							case 81: wordTwo = "Anchorage"; break;
							case 82: wordTwo = "Kingdom"; break;
							case 83: wordTwo = "Empire"; break;
							case 84: wordTwo = "Realm"; break;
							case 85: wordTwo = "Monarchy"; break;
							}
						}
						
						if(locationOne == "error")
							locationOne = word1 + word2 + " " + wordTwo;
					//	else if(outputTwo == "error")
					//		outputTwo = word1 + word2 + " " + wordTwo;
					//	else if(outputThr == "error")
					//		outputThr = word1 + word2 + " " + wordTwo;
					//	else if(outputFou == "error")
					//		outputFou = word1 + word2 + " " + wordTwo;
					//	else if(outputFiv == "error")
					//		outputFiv = word1 + word2 + " " + wordTwo;
					//	else if(outputSix == "error")
					//		outputSix = word1 + word2 + " " + wordTwo;
					//	else if(outputSev == "error")
					//		outputSev = word1 + word2 + " " + wordTwo;
					//	else if(outputEig == "error")
					//		outputEig = word1 + word2 + " " + wordTwo;
					//	else if(outputNin == "error")
					//		outputNin = word1 + word2 + " " + wordTwo;
					//	else
					//		outputTen = word1 + word2 + " " + wordTwo;
				
					}
				//}
			//Results being printed
			//System.out.println(outputOne);// outputOne = "error";
			//System.out.println("2." + outputTwo);
			//System.out.println("3." + outputThr);
			//System.out.println("4." + outputFou);
			//System.out.println("5." + outputFiv);
			//System.out.println("6." + outputSix);
			//System.out.println("7." + outputSev);
			//System.out.println("8." + outputEig);
			//System.out.println("9." + outputNin);
			//System.out.println("10." + outputTen);
			//System.out.println("");
			//System.out.println("Press a for 10 new names, b to repick terrain, c to repick word amount.");
			//System.out.println("Type the number to get all the info on that location.");
			//System.out.println("a.Names b.Terrain c.Amount d.Exit");
			//String userInp2 = userInput2.nextLine();
			
			//}
			
			//if(userInp2.equals("a") || userInp2.equals("b") || userInp2.equals("c") || userInp2.equals("d")){
			//switch(userInp2){
			//case "a":
			//outputOne = "error";
			//outputTwo = "error";
			//outputThr = "error";
			//outputFou = "error";
			//outputFiv = "error";
			//outputSix = "error";
			//outputSev = "error";
			//outputEig = "error";
			//outputNin = "error";
			//outputTen = "error";
			//newTerrain = false;
			//break;
			//case "b":
			//outputOne = "error";
			//outputTwo = "error";
			//outputThr = "error";
			//outputFou = "error";
			//outputFiv = "error";
			//outputSix = "error";
			//outputSev = "error";
			//outputEig = "error";
			//outputNin = "error";
			//outputTen = "error";
			//newTerrain = true;
			//random = false;
			//break;
			//case "c":newSelection = true; singleName = false; dualName = false; newTerrain = true; 
			//outputOne = "error";
			//outputTwo = "error";
			//outputThr = "error";
			//outputFou = "error";
			//outputFiv = "error";
			//outputSix = "error";
			//outputSev = "error";
			//outputEig = "error";
			//outputNin = "error";
			//outputTen = "error";
			//break;
			//case "d":finish = true; newTerrain = false;userInput.close();
			//userInput2.close(); break;
			//}
			//}
			//else{
			//outputOne = "error";
			//outputTwo = "error";
			//outputThr = "error";
			//outputFou = "error";
			//outputFiv = "error";
			//outputSix = "error";
			//outputSev = "error";
			//outputEig = "error";
			//outputNin = "error";
			//outputTen = "error";
			//newTerrain = true;
			//random = false;
			//}
			

			//}

	//}
	//else
	//	System.out.println(userInp + " is not a valid input.");
		//TimeUnit.MILLISECONDS.sleep(1400);
		
	}
}
