package Adverbs;
import java.util.*;

public class mainClass {
	
	public static void main(String[] args) throws InterruptedException{
		Scanner userInput = new Scanner(System.in);
		String userInp ="";
		boolean finish = false;
		String charName1 = "error";
		String charName2 = "error";
		String charName3 = "error";
		String raceName1 = "error";
		String raceName2 = "error";
		String raceName3 = "error";
		String locationName1 = "error";
		String locationName2 = "error";
		String locationName3 = "error";
		
		while(finish == false){
		 System.out.println("");
			System.out.println("1.Location names.");
			System.out.println("2.People Names.");
			System.out.println("3.Get History.");
			userInp = userInput.nextLine();
		if(userInp.equals("1") || userInp.equals("2") || userInp.equals("3")|| userInp.equals("4"))
		{
			switch(userInp){
			case "1": mainClassAdverbs.getLocation(); break;
			case "2": nameGen.getName(); break;
			case "3": historyGen.getHistory(); break;
			case "4": finish = true; break;
			}
		}
		if(locationName1 == "error"){
			locationName1 = mainClassAdverbs.locationOne;
			mainClassAdverbs.locationOne = "error";
			}
		else if(locationName2 == "error"){
			locationName2 = mainClassAdverbs.locationOne;
			mainClassAdverbs.locationOne = "error";
			}
		else if(locationName3 == "error"){
			locationName3 = mainClassAdverbs.locationOne;
			mainClassAdverbs.locationOne = "error";
		}
		
		if(charName1 == "error"){
			charName1 = nameGen.charOne;
			nameGen.charOne = "error";
			}
		else if(charName2 == "error"){
			charName2 = nameGen.charOne;
			nameGen.charOne = "error";
			}
		else if(charName3 == "error"){
			charName3 = nameGen.charOne;
			nameGen.charOne = "error";
		}
		
		if(raceName1 == "error"){
			raceName1 = nameGen.raceOne;
			nameGen.raceOne = "error";
			}
		else if(raceName2 == "error"){
			raceName2 = nameGen.raceOne;
			nameGen.raceOne = "error";
			}
		else if(raceName3 == "error"){
			raceName3 = nameGen.raceOne;
			nameGen.raceOne = "error";
		}
		
		//if(locationName3 != "error"){
			//System.out.println(locationName1);
			//System.out.println(locationName2);
			//System.out.println(locationName3);
		//}
		
		if(charName3 != "error"){
			System.out.println(charName1 + raceName1 + " is speaking with " + charName2 + raceName2 + " in the " + locationName1);
			System.out.println(charName2 + " and " + charName3 + raceName3 + " plan to leave the " + locationName1 + " and head to the " + locationName2);
			System.out.println("After "+ charName3 + " and "  + charName1 + " settled their differences, they decided to go to " + locationName3 + " instead. ");
			//System.out.println(charName2 + raceName2);
			//System.out.println(charName3 + raceName3);
			charName1 = "error";
			charName2 = "error";
			charName3 = "error";
			raceName1 = "error";
			raceName2 = "error";
			raceName3 = "error";
			locationName1 = "error";
			locationName2 = "error";
			locationName3 = "error";
		}
	}
}
}
