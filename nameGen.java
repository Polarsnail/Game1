package Adverbs;
import java.util.*;

public class nameGen {
	public static String charOne = "error";
	public static String raceOne = "error";
	static void getName(){
		Scanner userInput = new Scanner(System.in);
		boolean newSelection = true;
		String userInp ="";
		boolean finish = false;
		boolean dwarvenName = false;
		boolean elvenName = false;
		boolean humanName = false;
		boolean orcishName = false;
		String namePartOne ="Error";
		String namePartTwo ="Error";
		String namePartThree ="Error";
		int randomNumber = 0;
		String outputOne = "error";
		String outputTwo = "error";
		String outputThr = "error";
		String outputFou = "error";
		String outputFiv = "error";
		String outputSix = "error";
		String outputSev = "error";
		String outputEig = "error";
		String outputNin = "error";
		String outputTen = "error";
		

		
		//while(finish == false){
			//if(newSelection == true){
					//System.out.println("");
					//System.out.println("Select a race to generate names for.");
					//System.out.println("1.Dwarven Names");
					//System.out.println("2.Elven Names.");
					//System.out.println("3.Human/Halfling Names.");
					//System.out.println("4.Orcish Names.");
					//userInp = userInput.nextLine();
					//if(userInp.equals("1") || userInp.equals("2") || userInp.equals("3") || userInp.equals("4"))
					
				
				randomNumber = 1 + (int) (Math.random() * 4);
				
						switch(randomNumber){
						case 1: dwarvenName = true; newSelection = false; raceOne = " the Dwarf"; break;
						case 2: elvenName = true; newSelection = false; raceOne = " the Elf"; break;
						case 3: humanName = true; newSelection = false; raceOne = " the Human"; break;
						case 4: orcishName = true; newSelection = false; raceOne = " the Orc"; break;
						}
			//}
					//else
					//{
					//	newSelection = false;
					//}
					
					
					//while(outputTen == "error"){
					if(dwarvenName == true){
						randomNumber = 1 + (int) (Math.random() * 37);
						switch(randomNumber){
						case 1: namePartOne = "Sk"; break;
						case 2: namePartOne = "Dur"; break;
						case 3: namePartOne = "Um"; break;
						case 4: namePartOne = "Th"; break;
						case 5: namePartOne = "Nor"; break;
						case 6: namePartOne = "Dor"; break;
						case 7: namePartOne = "Dh"; break;
						case 8: namePartOne = "Gl"; break;
						case 9: namePartOne = "Riz"; break;
						case 10: namePartOne = "Nes"; break;
						case 11: namePartOne = "Mir"; break;
						case 12: namePartOne = "A"; break;
						case 13: namePartOne = "B"; break;
						case 14: namePartOne = "C"; break;
						case 15: namePartOne = "D"; break;
						case 16: namePartOne = "E"; break;
						case 17: namePartOne = "F"; break;
						case 18: namePartOne = "G"; break;
						case 19: namePartOne = "H"; break;
						case 20: namePartOne = "I"; break;
						case 21: namePartOne = "J"; break;
						case 22: namePartOne = "K"; break;
						case 23: namePartOne = "L"; break;
						case 24: namePartOne = "M"; break;
						case 25: namePartOne = "N"; break;
						case 26: namePartOne = "O"; break;
						case 27: namePartOne = "P"; break;
						case 28: namePartOne = "Q"; break;
						case 29: namePartOne = "R"; break;
						case 30: namePartOne = "S"; break;
						case 31: namePartOne = "T"; break;
						case 32: namePartOne = "U"; break;
						case 33: namePartOne = "V"; break;
						case 34: namePartOne = "W"; break;
						case 35: namePartOne = "X"; break;
						case 36: namePartOne = "Y"; break;
						case 37: namePartOne = "Z"; break;
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartTwo = "om"; break;
						case 2: namePartTwo = "or"; break;
						case 3: namePartTwo = "eh"; break;
						case 4: namePartTwo = "o"; break;
						case 5: namePartTwo = "ar"; break;
						case 6: namePartTwo = "am"; break;
						case 7: namePartTwo = "en"; break;
						case 8: namePartTwo = "in"; break;
						case 9: namePartTwo = "un"; break;
						case 10: namePartTwo = "an"; break;
						case 11: namePartTwo = "i"; break;
						case 12: namePartTwo = "or"; break;
						case 13: namePartTwo = "er"; break;
						case 14: namePartTwo = "ir"; break;
						case 15: namePartTwo = "ur"; break;
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartThree = "din"; break;
						case 2: namePartThree = "bron"; break;
						case 3: namePartThree = "rir"; break;
						case 4: namePartThree = "kic"; break;
						case 5: namePartThree = "mir"; break;
						case 6: namePartThree = "nas"; break;
						case 7: namePartThree = "mas"; break;
						case 8: namePartThree = "ral"; break;
						case 9: namePartThree = "th"; break;
						case 10: namePartThree = "lir"; break;
						case 11: namePartThree = "dal"; break;
						case 12: namePartThree = "lum"; break;
						case 13: namePartThree = "ick"; break;
						case 14: namePartThree = "rag"; break;
						case 15: namePartThree = "dir"; break;
						}
					}
					else if(elvenName == true){
						randomNumber = 1 + (int) (Math.random() * 36);
						switch(randomNumber){
						case 1: namePartOne = "Th"; break;
						case 2: namePartOne = "Dr"; break;
						case 3: namePartOne = "Thr"; break;
						case 4: namePartOne = "Ayl"; break;
						case 5: namePartOne = "Zel"; break;
						case 6: namePartOne = "Lys"; break;
						case 7: namePartOne = "Ry"; break;
						case 8: namePartOne = "Th"; break;
						case 9: namePartOne = "El"; break;
						case 10: namePartOne = "Ty"; break;
						case 11: namePartOne = "A"; break;
						case 12: namePartOne = "B"; break;
						case 13: namePartOne = "C"; break;
						case 14: namePartOne = "D"; break;
						case 15: namePartOne = "E"; break;
						case 16: namePartOne = "F"; break;
						case 17: namePartOne = "G"; break;
						case 18: namePartOne = "H"; break;
						case 19: namePartOne = "I"; break;
						case 20: namePartOne = "J"; break;
						case 21: namePartOne = "K"; break;
						case 22: namePartOne = "L"; break;
						case 23: namePartOne = "M"; break;
						case 24: namePartOne = "N"; break;
						case 25: namePartOne = "O"; break;
						case 26: namePartOne = "P"; break;
						case 27: namePartOne = "Q"; break;
						case 28: namePartOne = "R"; break;
						case 29: namePartOne = "S"; break;
						case 30: namePartOne = "T"; break;
						case 31: namePartOne = "U"; break;
						case 32: namePartOne = "V"; break;
						case 33: namePartOne = "W"; break;
						case 34: namePartOne = "X"; break;
						case 35: namePartOne = "Y"; break;
						case 36: namePartOne = "Z"; break;
						
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartTwo = "an"; break;
						case 2: namePartTwo = "il"; break;
						case 3: namePartTwo = "u"; break;
						case 4: namePartTwo = "d"; break;
						case 5: namePartTwo = "el"; break;
						case 6: namePartTwo = "al"; break;
						case 7: namePartTwo = "ol"; break;
						case 8: namePartTwo = "ul"; break;
						case 9: namePartTwo = "ae"; break;
						case 10: namePartTwo = "ef"; break;
						case 11: namePartTwo = "af"; break;
						case 12: namePartTwo = "if"; break;
						case 13: namePartTwo = "of"; break;
						case 14: namePartTwo = "uf"; break;
						case 15: namePartTwo = "ah"; break;
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartThree = "dal"; break;
						case 2: namePartThree = "nor"; break;
						case 3: namePartThree = "dor"; break;
						case 4: namePartThree = "in"; break;
						case 5: namePartThree = "dar"; break;
						case 6: namePartThree = "del"; break;
						case 7: namePartThree = "nal"; break;
						case 8: namePartThree = "nel"; break;
						case 9: namePartThree = "mer"; break;
						case 10: namePartThree = "mar"; break;
						case 11: namePartThree = "mor"; break;
						case 12: namePartThree = "iah"; break;
						case 13: namePartThree = "dwin"; break;
						case 14: namePartThree = "ar"; break;
						case 15: namePartThree = "al"; break;
						}
					}
					else if(humanName == true){
						randomNumber = 1 + (int) (Math.random() * 36);
						switch(randomNumber){
						case 1: namePartOne = "Tr"; break;
						case 2: namePartOne = "Eg"; break;
						case 3: namePartOne = "Ch"; break;
						case 4: namePartOne = "Ly"; break;
						case 5: namePartOne = "Cr"; break;
						case 6: namePartOne = "Br"; break;
						case 7: namePartOne = "El"; break;
						case 8: namePartOne = "Ry"; break;
						case 9: namePartOne = "Th"; break;
						case 10: namePartOne = "Ti"; break;
						case 11: namePartOne = "A"; break;
						case 12: namePartOne = "B"; break;
						case 13: namePartOne = "C"; break;
						case 14: namePartOne = "D"; break;
						case 15: namePartOne = "E"; break;
						case 16: namePartOne = "F"; break;
						case 17: namePartOne = "G"; break;
						case 18: namePartOne = "H"; break;
						case 19: namePartOne = "I"; break;
						case 20: namePartOne = "J"; break;
						case 21: namePartOne = "K"; break;
						case 22: namePartOne = "L"; break;
						case 23: namePartOne = "M"; break;
						case 24: namePartOne = "N"; break;
						case 25: namePartOne = "O"; break;
						case 26: namePartOne = "P"; break;
						case 27: namePartOne = "Q"; break;
						case 28: namePartOne = "R"; break;
						case 29: namePartOne = "S"; break;
						case 30: namePartOne = "T"; break;
						case 31: namePartOne = "U"; break;
						case 32: namePartOne = "V"; break;
						case 33: namePartOne = "W"; break;
						case 34: namePartOne = "X"; break;
						case 35: namePartOne = "Y"; break;
						case 36: namePartOne = "Z"; break;
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartTwo = "is"; break;
						case 2: namePartTwo = "ev"; break;
						case 3: namePartTwo = "ag"; break;
						case 4: namePartTwo = "ax"; break;
						case 5: namePartTwo = "em"; break;
						case 6: namePartTwo = "en"; break;
						case 7: namePartTwo = "ald"; break;
						case 8: namePartTwo = "oc"; break;
						case 9: namePartTwo = "or"; break;
						case 10: namePartTwo = "ar"; break;
						case 11: namePartTwo = "ac"; break;
						case 12: namePartTwo = "ir"; break;
						case 13: namePartTwo = "ic"; break;
						case 14: namePartTwo = "er"; break;
						case 15: namePartTwo = "ec"; break;
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartThree = "tan"; break;
						case 2: namePartThree = "or"; break;
						case 3: namePartThree = "son"; break;
						case 4: namePartThree = "ard"; break;
						case 5: namePartThree = "ken"; break;
						case 6: namePartThree = "wyn"; break;
						case 7: namePartThree = "rim"; break;
						case 8: namePartThree = "th"; break;
						case 9: namePartThree = "ah"; break;
						case 10: namePartThree = "rth"; break;
						case 11: namePartThree = "eth"; break;
						case 12: namePartThree = "ung"; break;
						case 13: namePartThree = "ald"; break;
						case 14: namePartThree = "ric"; break;
						case 15: namePartThree = "en"; break;
						}
					}
					else if(orcishName == true){
						randomNumber = 1 + (int) (Math.random() * 36);
						switch(randomNumber){
						case 1: namePartOne = "Gr"; break;
						case 2: namePartOne = "Qr"; break;
						case 3: namePartOne = "Wr"; break;
						case 4: namePartOne = "Kr"; break;
						case 5: namePartOne = "Az"; break;
						case 6: namePartOne = "Sl"; break;
						case 7: namePartOne = "Kh"; break;
						case 8: namePartOne = "Ar"; break;
						case 9: namePartOne = "Or"; break;
						case 10: namePartOne = "Ag"; break;
						case 11: namePartOne = "A"; break;
						case 12: namePartOne = "B"; break;
						case 13: namePartOne = "C"; break;
						case 14: namePartOne = "D"; break;
						case 15: namePartOne = "E"; break;
						case 16: namePartOne = "F"; break;
						case 17: namePartOne = "G"; break;
						case 18: namePartOne = "H"; break;
						case 19: namePartOne = "I"; break;
						case 20: namePartOne = "J"; break;
						case 21: namePartOne = "K"; break;
						case 22: namePartOne = "L"; break;
						case 23: namePartOne = "M"; break;
						case 24: namePartOne = "N"; break;
						case 25: namePartOne = "O"; break;
						case 26: namePartOne = "P"; break;
						case 27: namePartOne = "Q"; break;
						case 28: namePartOne = "R"; break;
						case 29: namePartOne = "S"; break;
						case 30: namePartOne = "T"; break;
						case 31: namePartOne = "U"; break;
						case 32: namePartOne = "V"; break;
						case 33: namePartOne = "W"; break;
						case 34: namePartOne = "X"; break;
						case 35: namePartOne = "Y"; break;
						case 36: namePartOne = "Z"; break;
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartTwo = "og"; break;
						case 2: namePartTwo = "ig"; break;
						case 3: namePartTwo = "ug"; break;
						case 4: namePartTwo = "eg"; break;
						case 5: namePartTwo = "ag"; break;
						case 6: namePartTwo = "am"; break;
						case 7: namePartTwo = "em"; break;
						case 8: namePartTwo = "im"; break;
						case 9: namePartTwo = "om"; break;
						case 10: namePartTwo = "um"; break;
						case 11: namePartTwo = "an"; break;
						case 12: namePartTwo = "en"; break;
						case 13: namePartTwo = "in"; break;
						case 14: namePartTwo = "on"; break;
						case 15: namePartTwo = "un"; break;
						}
						
						randomNumber = 1 + (int) (Math.random() * 15);
						switch(randomNumber){
						case 1: namePartThree = "nak"; break;
						case 2: namePartThree = "gut"; break;
						case 3: namePartThree = "gog"; break;
						case 4: namePartThree = "kug"; break;
						case 5: namePartThree = "kog"; break;
						case 6: namePartThree = "gig"; break;
						case 7: namePartThree = "gar"; break;
						case 8: namePartThree = "tug"; break;
						case 9: namePartThree = "tog"; break;
						case 10: namePartThree = "nath"; break;
						case 11: namePartThree = "th"; break;
						case 12: namePartThree = "rg"; break;
						case 13: namePartThree = "og"; break;
						case 14: namePartThree = "uk"; break;
						case 15: namePartThree = "an"; break;
						}
					}
					
					if(charOne == "error")
						charOne = namePartOne + namePartTwo + namePartThree;
					//else if(outputTwo == "error")
					//	outputTwo = namePartOne + namePartTwo + namePartThree;
					//else if(outputThr == "error")
					//	outputThr = namePartOne + namePartTwo + namePartThree;
					//else if(outputFou == "error")
					//	outputFou = namePartOne + namePartTwo + namePartThree;
					//else if(outputFiv == "error")
					//	outputFiv = namePartOne + namePartTwo + namePartThree;
					//else if(outputSix == "error")
					//	outputSix = namePartOne + namePartTwo + namePartThree;
					//else if(outputSev == "error")
					//	outputSev = namePartOne + namePartTwo + namePartThree;
					//else if(outputEig == "error")
					//	outputEig = namePartOne + namePartTwo + namePartThree;
					//else if(outputNin == "error")
					//	outputNin = namePartOne + namePartTwo + namePartThree;
					//else
					//	outputTen = namePartOne + namePartTwo + namePartThree;
					//}
					//System.out.println(outputOne);
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
					//System.out.println("Any key for new names.");
					//userInp = userInput.nextLine();
					
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
					dwarvenName = false;
					elvenName = false;
					humanName = false;
					orcishName = false;
					newSelection = false;
					finish = true;
			//}
		}

	}
