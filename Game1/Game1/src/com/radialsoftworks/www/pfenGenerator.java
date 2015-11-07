package com.radialsoftworks.www;
public class pfenGenerator 
{

	public static String pf15 = "Delicate";
	public static String pf11 = "Worthless";
	public static String pf7 = "Rusty";
	public static String pf0 = "Inexspensive";
	public static String pf20 = "Thundering";//
	public static String prefixPicked = "Inexpensive";
	public static String enchantmentPicked = "None";
	static void getPrefix() {
	
		//Snailfecher's Prefixes
		
		
		//This selects a Prefix between 0 and 21
		//int prefixPicker = 0 + (int) (Math.random() * 21);

		//These are the prefixes (Can Add More)
		//String pf0 = "Inexspensive";
		String pf1 = "Fierce";//
		String pf2 = "Mysterious";//
		String pf3 = "Precise";//
		String pf4 = "Scrawny";//
		String pf5 = "Ancient";//
		String pf6 = "Swift";//
		//String pf7 = "Rusty";//
		String pf8 = "Lightweight";//
		String pf9 = "Filthy";//
		String pf10 = "Victorious";//
		//String pf11 = "Worthless";//
		String pf12 = "Superb";//
		String pf13 = "Astonishing";//
		String pf14 = "Ethereal";//
		//String pf15 = "Delicate";//
		String pf16 = "Durable";//
		String pf17 = "Sturdy";//
		String pf18 = "Average";//
		String pf19 = "Incredible";//
		String pf20 = "Thundering";//
		String pf21 = "Legendary";//
			
		if(weaponGenerator.damage <= 10)
		{ 
			int CrappyPrefixes = 1 + (int) (Math.random() * 4);
			switch(CrappyPrefixes)
			{
			case 1: prefixPicked = pf0; break;
			case 2: prefixPicked = pf7; break;
			case 3: prefixPicked = pf11; break;
			case 4: prefixPicked = pf15; break;
			}
		}
		
			else if(weaponGenerator.damage <= 30)
		{ 
			int CrappyPrefixes = 1 + (int) (Math.random() * 3);
			switch(CrappyPrefixes)
			{
			case 1: prefixPicked = pf4; break;
			case 2: prefixPicked = pf9; break;
			case 3: prefixPicked = pf8; break;
			}
		}
		
			else if(weaponGenerator.damage <= 50)
		{ 
			int CrappyPrefixes = 1 + (int) (Math.random() * 2);
			switch(CrappyPrefixes)
			{
			case 1: prefixPicked = pf16; break;
			case 2: prefixPicked = pf18; break;
			}
		}
		
			else if(weaponGenerator.damage <= 65)
		{ 
			int CrappyPrefixes = 1 + (int) (Math.random() * 4);
			switch(CrappyPrefixes)
			{
			case 1: prefixPicked = pf6; break;
			case 2: prefixPicked = pf1; break;
			case 3: prefixPicked = pf17; break;
			case 4: prefixPicked = pf3; break;
			}
		}
			else if(weaponGenerator.damage <= 80)
		{ 
			int CrappyPrefixes = 1 + (int) (Math.random() * 5);
			switch(CrappyPrefixes)
			{
			case 1: prefixPicked = pf14; break;
			case 2: prefixPicked = pf13; break;
			case 3: prefixPicked = pf12; break;
			case 4: prefixPicked = pf5; break;
			case 5: prefixPicked = pf2; break;
			
			}
		}
			else if(weaponGenerator.damage <= 95)
		{ 
			int CrappyPrefixes = 1 + (int) (Math.random() * 3);
			switch(CrappyPrefixes)
			{
			case 1: prefixPicked = pf19; break;
			case 2: prefixPicked = pf20; break;
			case 3: prefixPicked = pf10; break;

			
			}
		}
			else if(weaponGenerator.damage <= 110)
		{ 

			prefixPicked = pf21;
		}
	}
		static void getEnchantment() {	
		

		 String en0 = "Fire";
		 String en1 = "Ice";
		 String en2 = "Electric";
		 String en3 = "Vampiric Drain";
		 String en4 = "Necrosis";
		 String en5 = "Poison";
		 String en6 = "Earth";
		 String en7 = "Water";
		 String en8 = "Torpor";
		 String en9 = "Self Inflicting Pain";
		 //This selects a Prefix between 0 and 14
		 int enchantmentPicker = 0 + (int) (Math.random() * 100);
		 //This sets the enchants to the prefixes
			if(prefixPicked == pf20)
				enchantmentPicked = en2;
			else if(prefixPicked == pf0 || prefixPicked == pf7 || prefixPicked == pf11
					|| prefixPicked == pf15)
				enchantmentPicked = en9;
			
			else {
		 switch(enchantmentPicker)
		 {
		 case 0: enchantmentPicked = en0; break;
		 case 1: enchantmentPicked = en1; break;
		 //case 2: enchantmentPicked = en2; break;
		 case 3: enchantmentPicked = en3; break;
		 case 4: enchantmentPicked = en4; break;
		 case 5: enchantmentPicked = en5; break;
		 case 6: enchantmentPicked = en6; break;
		 case 7: enchantmentPicked = en7; break;
		 case 8: enchantmentPicked = en8; break;
		 //case 9: enchantmentPicked = en9; break;
		}
		}
		}
}



