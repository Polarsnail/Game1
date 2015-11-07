package com.radialsoftworks.www;
public class monsterGenerator 
{
	public static void getMonster()
	{
		int monsterHealth = 0;
		int monsterDamage = 0;
		int monsterInit = 0;
		String monster = null;
		int monsterPicker = 1 + (int)(Math.random()*20);
		
		// 7/20-Rat 7/20-Goblin 3/20-Bear 1/20-Ratbear 1/20-Beargoblin 1/20-Goblinrat
		switch(monsterPicker)
		{
		case 1: monster = "Rat"; break;
		case 2: monster = "Rat"; break;
		case 3: monster = "Rat"; break;
		case 4: monster = "Rat"; break;//35% 
		case 5: monster = "Rat"; break;
		case 6: monster = "Rat"; break;
		case 7: monster = "Rat"; break;
		case 8: monster = "Goblin"; break;
		case 9: monster = "Goblin"; break;
		case 10: monster = "Goblin"; break;
		case 11: monster = "Goblin"; break;//35%
		case 12: monster = "Goblin"; break;
		case 13: monster = "Goblin"; break;
		case 14: monster = "Goblin"; break;
		case 15: monster = "Bear"; break;
		case 16: monster = "Bear"; break;//15%
		case 17: monster = "Bear"; break;
		case 18: monster = "Ratbear"; break;
		case 19: monster = "Beargoblin"; break;//5% each
		case 20: monster = "Goblinrat"; break;
		}
		//Generates Rat's stats
		if(monster == "Rat")
			{
				monsterHealth = 3 + (int)(Math.random()*10);
				monsterDamage = 1 + (int)(Math.random()*6);
				monsterInit = 5 + (int)(Math.random()*10);
				//System.out.println("A Rat emerges from the shadows!");
			}
		//Generates Bear's stats
		if(monster == "Bear")
			{
				monsterHealth = 10 + (int)(Math.random()*20);
				monsterDamage = 3 + (int)(Math.random()*10);
				monsterInit = 10 + (int)(Math.random()*20);
				//System.out.println("A Bear was woken up!");
				
			}
		//Generates Goblin's stats
		if(monster == "Goblin")
			{
				monsterHealth = 5 + (int)(Math.random()*15);
				monsterDamage = 3 + (int)(Math.random()*8);
				monsterInit = 7 + (int)(Math.random()*15);
				//System.out.println("A Goblin trips on a rock towards you!");
			}
		//Generates Ratbear's stats
		if(monster == "Ratbear")
			{
				monsterHealth = 13 + (int)(Math.random()*30);
				monsterDamage = 4 + (int)(Math.random()*16);
				monsterInit = 15 + (int)(Math.random()*30);
				//System.out.println("A Ratbear jumps off a cactus and rips a nearby hobo in half!");
			}
		//Generates Beargoblin's stats
		if(monster == "Beargoblin")
			{
				monsterHealth = 15 + (int)(Math.random()*35);
				monsterDamage = 6 + (int)(Math.random()*18);
				monsterInit = 17 + (int)(Math.random()*35);
				//System.out.println("A Beargoblin towers over you!");
			}
		//Generates Goblinrat's stats
		if(monster == "Goblinrat")
			{
				monsterHealth = 8 + (int)(Math.random()*25);
				monsterDamage = 4 + (int)(Math.random()*14);
				monsterInit = 12 + (int)(Math.random()*25);
				//System.out.println("A Goblinrat popped out of some leaves!");
			}
		//debug info
		//System.out.println(monster +":");
		//System.out.println(monsterHealth + " Health");
		//System.out.println(monsterDamage + " Damage");
		//System.out.println(monsterInit + " Initiative");
		
		

	}
}
