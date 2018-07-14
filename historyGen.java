package Adverbs;
import java.util.*;

public class historyGen {
	
	static void getHistory(){
		int randomNumber = 0;
		int randomNumber2 = 0;
		int randomNumber3 = 0;
		int randomNumber4 = 0;
		int randomNumber5 = 0;
		int randomNumber6 = 0;
		boolean runNumber = true;
		Scanner userInput = new Scanner(System.in);
		String userInp ="";
		
		while(runNumber == true){
		randomNumber = 1 + (int) (Math.random() * 5);
		randomNumber2 = 1 + (int) (Math.random() * 100);
		randomNumber3 = 100 + (int) (Math.random() * 100);
		randomNumber4 = 200 + (int) (Math.random() * 100);
		randomNumber5 = 300 + (int) (Math.random() * 100);
		randomNumber6 = 400 + (int) (Math.random() * 100);
		System.out.println("Number of historical events here is " + randomNumber + ".");
		System.out.println("This event took place in year " + randomNumber2 + ".");
		System.out.println("This event took place in year " + randomNumber3 + ".");
		System.out.println("This event took place in year " + randomNumber4 + ".");
		System.out.println("This event took place in year " + randomNumber5 + ".");
		System.out.println("This event took place in year " + randomNumber6 + ".");
		System.out.println("LOCATION is ACTIONED by A RACE PERSON/A GROUP named PERSON'S NAME/THE GROUP NAME.");
		
		//System.out.println(nameOne);
		userInp = userInput.nextLine();
		}
	}
}
