package com.radialsoftworks.www;
public class battleSimulator {

	public static int gobNumbers = 1 + (int)(Math.random()*3);
	public static void main(String[] args) {  
		int allyInit = 1 + (int)(Math.random()*20); 
		int gobInit = 1 + (int)(Math.random()*20);
		//int gobNumbers = 1 + (int)(Math.random()*3);
		int gobTypepick1 = 1 + (int)(Math.random()*3);
		int gobTypepick2 = 1 + (int)(Math.random()*3);
		int gobTypepick3 = 1 + (int)(Math.random()*3);
	    int alliesHealth = 30;  
		int alliesInitiative = allyInit; 
		boolean alliesGoesFirst = false; 
		boolean allies = true; 
		int enemyInitiative = gobInit; 
		boolean gob1Alive = false;
		boolean gob2Alive = false;
		boolean gob3Alive = false;
		boolean enemyGoesFirst = false; 
		boolean enemies = true; 
		boolean alliesWin = false;
		String gob1 = "Test";
		String gob2 = "Test2";
		String gob3 = "Test3";
		int gob1Attack = 0;
		int gob2Attack = 0;
		int gob3Attack = 0;
		int gob1Health = 0;
		int gob2Health = 0;
		int gob3Health = 0;
		boolean turn = true; 
		int firstTurn = 0;{
	    
			
			//Setting the goblins to be alive
			if(gobNumbers == 1 || gobNumbers == 2 || gobNumbers == 3)
			{
				gob1Alive = true;
				if(gobNumbers == 2 || gobNumbers == 3)
				{
					gob2Alive = true;
					if(gobNumbers == 3)
					{
						gob3Alive = true;
					}
				}
			}
			//Setting the goblins that are alive to their class
			if(gobNumbers == 1 || gobNumbers == 2 || gobNumbers == 3)
			{				
				switch(gobTypepick1)
				{
				case 1: gob1 = "Goblin Archer"; break;
				case 2: gob1 = "Goblin Warrior"; break;
				case 3: gob1 = "Goblin Thief"; break;
				}
				if(gobNumbers == 2 || gobNumbers == 3)
				{
					switch(gobTypepick2)
					{
					case 1: gob2 = "Goblin Archer"; break;
					case 2: gob2 = "Goblin Warrior"; break;
					case 3: gob2 = "Goblin Thief"; break;
					}
					if(gobNumbers == 3)
					{
						switch(gobTypepick3)
						{
						case 1: gob3 = "Goblin Archer"; break;
						case 2: gob3 = "Goblin Warrior"; break;
						case 3: gob3 = "Goblin Thief"; break;
						}
					}
				}
			}
			//Setting Goblins stats dependent on class
			if(gob1 == "Goblin Archer")
				{
					gob1Attack = 1 + (int)(Math.random()*5);
					gob1Health = 10;
				}
			else if(gob1 == "Goblin Warrior")
				{
					gob1Attack = 1 + (int)(Math.random()*7);
					gob1Health = 12;
				}
			else if(gob1 == "Goblin Thief")
				{
					gob1Attack = 1 + (int)(Math.random()*6);
					gob1Health = 8;
				}
			
			if(gob2 == "Goblin Archer")
			{
				gob2Attack = 1 + (int)(Math.random()*5);
				gob2Health = 10;
				if(gob1 == "Goblin Archer")
					gob2 = "Goblin Archer 2";
			}
		else if(gob2 == "Goblin Warrior")
			{
				gob2Attack = 1 + (int)(Math.random()*7);
				gob2Health = 12;
				if(gob1 == "Goblin Warrior")
					gob2 = "Goblin Warrior 2";
			}
		else if(gob2 == "Goblin Thief")
			{
				gob2Attack = 1 + (int)(Math.random()*6);
				gob2Health = 8;
				if(gob1 == "Goblin Thief")
					gob2 = "Goblin Thief 2";
			}
			
			if(gob3 == "Goblin Archer")
			{
				gob3Attack = 1 + (int)(Math.random()*5);
				gob3Health = 10;
				if(gob1 == "Goblin Archer" && gob2 == "Goblin Archer 2")
					gob3 = "Goblin Archer 3";
				else if(gob1 == "Goblin Archer" || gob2 == "Goblin Archer")
					gob3 = "Goblin Archer 2";
			}
		else if(gob3 == "Goblin Warrior")
			{
				gob3Attack = 1 + (int)(Math.random()*7);
				gob3Health = 12;
				if(gob1 == "Goblin Warrior" && gob2 == "Goblin Warrior 2")
					gob3 = "Goblin Warrior 3";
				else if(gob1 == "Goblin Warrior" || gob2 == "Goblin Warrior")
					gob3 = "Goblin Warrior 2";
			}
		else if(gob3 == "Goblin Thief")
			{
				gob3Attack = 1 + (int)(Math.random()*6);
				gob3Health = 8;
				if(gob1 == "Goblin Thief" && gob2 == "Goblin Thief 2")
					gob3 = "Goblin Thief 3";
				else if(gob1 == "Goblin Thief" || gob2 == "Goblin Thief")
					gob3 = "Goblin Thief 2";
			}
			//This is for Debug use!
			//System.out.println(gob1);
			//System.out.println(gob2);
			//System.out.println(gob3);
			//System.out.println(gob1Alive);
			//System.out.println(gob2Alive);
			//System.out.println(gob3Alive);
			//System.out.println(gobNumbers);
			
				
			
		//start of the turn sequence 
		while (turn = true) { 
			//Damage calculators
			int allyAttack = 1 + (int)(Math.random()*5); 
		 if(gob1 == "Goblin Archer")
			gob1Attack = 1 + (int)(Math.random()*5);
	else if(gob1 == "Goblin Warrior")
			gob1Attack = 1 + (int)(Math.random()*7);
	else if(gob1 == "Goblin Thief")
			gob1Attack = 1 + (int)(Math.random()*6);
		 if(gob2 == "Goblin Archer" || gob2 == "Goblin Archer 2")
			gob2Attack = 1 + (int)(Math.random()*5);
	else if(gob2 == "Goblin Warrior" || gob2 ==  "Goblin Warrior 2")
			gob2Attack = 1 + (int)(Math.random()*7);
	else if(gob2 == "Goblin Thief" || gob2 ==  "Goblin Thief 2")
			gob2Attack = 1 + (int)(Math.random()*6);
		 if(gob3 == "Goblin Archer" || gob3 ==  "Goblin Archer 2" || gob3 ==  "Goblin Archer 3")
			gob3Attack = 1 + (int)(Math.random()*5);
	else if(gob3 == "Goblin Warrior" || gob3 ==  "Goblin Warrior 2" || gob3 ==  "Goblin Warrior 3")
			gob3Attack = 1 + (int)(Math.random()*7);
	else if(gob3 == "Goblin Thief" || gob3 ==  "Goblin Thief 2" || gob3 ==  "Goblin Thief 3")
			gob3Attack = 1 + (int)(Math.random()*6);
			
			// Did someone die?
			if (allies == false) { 
				System.out.println("The allies died!");
				turn = false; 
				break; 
			} else if (gob1Alive == false && gob2Alive == false && gob3Alive == false) {
				if(gobNumbers == 1)
				{
			    System.out.println("The battle has ended!");
				}
				else if(gobNumbers >= 2){
					System.out.println("All Goblins have been slain!");
				} 
				turn = false; 
				alliesWin = true;
				System.out.println("");
				System.out.println("[LOOT]");
				weaponGenerator.getWeapon();
				lootSystem.getLoot();
				break; 
			}  	
		 	//This decides who goes first
		 	if (firstTurn < 1) { 
				if (alliesInitiative >= enemyInitiative) {  
				alliesGoesFirst = true;
					System.out.println("Allies go first"); 
					firstTurn = firstTurn + 1; 
			} else { 
				enemyGoesFirst = true; 
				if(gobNumbers == 1){
					System.out.println("Goblin goes first"); 
				}
				else if(gobNumbers >= 2){
					System.out.println("Goblins go first"); 
				}
				firstTurn = firstTurn + 1; 
				} 
			} 
			//Start of turn enemy goes first
			if (enemyGoesFirst == true) {
				if(gob1Alive == true && allies == true){
				alliesHealth = alliesHealth - gob1Attack; 
				System.out.println("The "+ gob1+ " attacks for " + gob1Attack + " damage."+
					" The allies have "	+ alliesHealth + " health remaining");
				if (alliesHealth <= 0) { 
					allies = false;}}
				if(gobNumbers >= 2 && gob2Alive == true && allies == true)
				{
					alliesHealth = alliesHealth - gob2Attack; 
					System.out.println("The "+ gob2+ " attacks for " + gob2Attack + " damage."+
						" The allies have "	+ alliesHealth + " health remaining");
					if (alliesHealth <= 0) { 
						allies = false;}
				}
				if(gobNumbers == 3 && gob3Alive == true && allies == true)
				{
					alliesHealth = alliesHealth - gob3Attack; 
					System.out.println("The "+ gob3+ " attacks for " + gob3Attack + " damage."+
						" The allies have "	+ alliesHealth + " health remaining");
					if (alliesHealth <= 0) { 
						allies = false;}
				}
				if(gob1Alive == true && allies == true)
				{
					gob1Health = gob1Health - allyAttack ;
				System.out.println(gob1 + " got hit for " + allyAttack + " damage and has " 
						+ gob1Health + " health remaining");
			    if (gob1Health <= 0) { 
				    gob1Alive = false;
				    if(gobNumbers == 1){
				    System.out.println(gob1 + " was slain!");
				    }
				    
				    if(gobNumbers == 2 || gobNumbers == 3){
				    System.out.println(gob1 + " was slain and the allies get a free attack!");}
			    }
			    }
				if(gobNumbers == 2 && gob2Alive == true && allies == true|| gobNumbers == 3 && 
						gob2Alive == true && allies == true)
				{
					if(gob1Alive == false){
					gob2Health = gob2Health - allyAttack ;
				System.out.println(gob2 + " got hit for " + allyAttack + " damage and has " 
						+ gob2Health + " health remaining");
			    if (gob2Health <= 0) { 
				    gob2Alive = false;
				    if(gobNumbers == 2){
				    System.out.println(gob2 + " was slain!");
				    }
				    
				    else{
				    System.out.println(gob2 + " was slain and the allies get a free attack!");}}
					}
			    }
				if(gobNumbers == 3  && gob2Alive == false && gob3Alive == true && allies == true)
				{
					if(gob1Alive == false){
					gob3Health = gob3Health - allyAttack ;
				System.out.println(gob3 + " got hit for " + allyAttack + " damage and has " 
						+ gob3Health + " health remaining");
			    if (gob3Health <= 0) { 
				    gob3Alive = false;
				    if(gobNumbers <= 3)
				    System.out.println(gob3 + " was slain!");
				    }
					}
			    }
				 }
			 	//Start of turn allies go first
				 if (alliesGoesFirst == true) {
					 if(gob1Alive == true && allies == true)
						{
							gob1Health = gob1Health - allyAttack ;
						System.out.println(gob1 + " got hit for " + allyAttack + " damage and has " 
								+ gob1Health + " health remaining");
					    if (gob1Health <= 0) { 
						    gob1Alive = false;
						    if(gobNumbers == 1){
						    System.out.println(gob1 + " was slain!");
						    
						    }
						    else if(gobNumbers == 2 || gobNumbers == 3){
						    System.out.println(gob1 + " was slain and the allies get a free attack!");}
					    	}
					    }
						if(gobNumbers == 2 && gob2Alive == true && allies == true || gobNumbers == 3 
								&& gob2Alive == true && allies == true)
						{
							if(gob1Alive == false){
							gob2Health = gob2Health - allyAttack ;
						System.out.println(gob2 + " got hit for " + allyAttack + " damage and has " 
								+ gob2Health + " health remaining");
					    if (gob2Health <= 0) { 
						    gob2Alive = false;
						    if(gobNumbers <= 2){
						    System.out.println(gob2 + " was slain!");
						    
						    }
						    else if(gobNumbers == 3 && allies == true)
						    System.out.println(gob2 + " was slain and the allies get a free attack!");}
							}
					    }
						if(gobNumbers == 3 && gob3Alive == true && allies == true)
						{
							if(gob2Alive == false){
							gob3Health = gob3Health - allyAttack ;
						System.out.println(gob3 + " got hit for " + allyAttack + " damage and has " 
								+ gob3Health + " health remaining");
					    if (gob3Health <= 0) { 
						    gob3Alive = false;
						    if(gobNumbers == 3)
						    System.out.println(gob3 + " was slain!");
						    }
							}
					    }
						
						if(gob1Alive == true){
						alliesHealth = alliesHealth - gob1Attack; 
						System.out.println("The "+ gob1+ " attacks for " + gob1Attack + " damage."+
							" The allies have "	+ alliesHealth + " health remaining");
						if (alliesHealth <= 0) { 
							allies = false;}}
						if(gobNumbers >= 2 && gob2Alive == true && allies == true)
						{
							alliesHealth = alliesHealth - gob2Attack; 
							System.out.println("The "+ gob2+ " attacks for " + gob2Attack + " damage."+
								" The allies have "	+ alliesHealth + " health remaining");
							if (alliesHealth <= 0) { 
								allies = false;}
						}
						if(gobNumbers == 3 && gob3Alive == true && allies == true)
						{
							alliesHealth = alliesHealth - gob3Attack; 
							System.out.println("The "+ gob3+ " attacks for " + gob3Attack + " damage."+
								" The allies have "	+ alliesHealth + " health remaining");
							if (alliesHealth <= 0) { 
								allies = false;}
						}

					}
				}
		} 
	}
}


