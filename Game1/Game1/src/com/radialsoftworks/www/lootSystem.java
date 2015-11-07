package com.radialsoftworks.www;
public class lootSystem {
	static void getLoot() {
	int lootAmount = 0;
	int lootAmount2 = 0;
	int lootAmount3 = 0;
	int lootPicker = 1 + (int) (Math.random() * 3);
	int lootPicker2 = 1 + (int) (Math.random() * 3);
	int lootPicker3 = 1 + (int) (Math.random() * 3);
	String lootPicked = "";
	String lootPicked2 = "";
	String lootPicked3 = "";
		
	switch (lootPicker) {
	case 1: lootPicked = "Goblin Toe"; break;
	case 2: lootPicked = "Goblin Finger"; break;
	case 3: lootPicked = "Goblin Trinket"; break;
	}
	switch (lootPicker2) {
	case 1: lootPicked2 = "Goblin Toe"; break;
	case 2: lootPicked2 = "Goblin Finger"; break;
	case 3: lootPicked2 = "Goblin Trinket"; break;
	}
	switch (lootPicker3) {
	case 1: lootPicked3 = "Goblin Toe"; break;
	case 2: lootPicked3 = "Goblin Finger"; break;
	case 3: lootPicked3 = "Goblin Trinket"; break;
	}
	if (battleSimulator.gobNumbers == 1){
	lootAmount = 1 + (int) (Math.random() * 3);
	}
	if (battleSimulator.gobNumbers == 2){
	lootAmount = 1 + (int) (Math.random() * 3);
	lootAmount2 = 1 + (int) (Math.random() * 3);
	}
	if (battleSimulator.gobNumbers == 3){
	lootAmount = 1 + (int) (Math.random() * 3);
	lootAmount2 = 1 + (int) (Math.random() * 3);
	lootAmount3 = 1  + (int) (Math.random() * 3);
	}

	int gobToes = 0;
	int gobTrinkets = 0;
	int gobFingers = 0;
			
	if(lootPicked == "Goblin Toe") {
		gobToes = gobToes + lootAmount;
	}
	else if (lootPicked == "Goblin Finger") {
		gobFingers = gobFingers + lootAmount;
	}
	else if (lootPicked == "Goblin Trinket") {
		gobTrinkets = gobTrinkets + lootAmount;
	}
	if(lootPicked2 == "Goblin Toe") {
		gobToes = gobToes + lootAmount2;
	}
	else if (lootPicked2 == "Goblin Finger") {
		gobFingers = gobFingers + lootAmount2;
	}
	else if (lootPicked2 == "Goblin Trinket") {
		gobTrinkets = gobTrinkets + lootAmount2;
	}
	if(lootPicked3 == "Goblin Toe") {
		gobToes = gobToes + lootAmount3;
	}
	else if (lootPicked3 == "Goblin Finger") {
		gobFingers = gobFingers + lootAmount3;
	}
	else if (lootPicked3 == "Goblin Trinket") {
		gobTrinkets = gobTrinkets + lootAmount3;
	}
	if (gobToes == 1) {
		System.out.println(gobToes + " Goblin Toe");
	}
	if (gobFingers == 1) {
		System.out.println(gobFingers + " Goblin Finger");
	}
	if (gobTrinkets == 1) {
		System.out.println(gobTrinkets + " Goblin Trinket");
	}
	if (gobToes > 1) {
		System.out.println(gobToes + " Goblin Toes");
	}
	if (gobFingers > 1) {
		System.out.println(gobFingers + " Goblin Fingers");
	}
	if (gobTrinkets > 1) {
		System.out.println(gobTrinkets + " Goblin Trinkets");
	}
	 //System.out.println(lootPicked);
	 //System.out.println(lootPicked2);
	 //System.out.println(lootPicked3);
	 //System.out.println(lootAmount);
	 //System.out.println(lootAmount2);
	 //System.out.println(lootAmount3);
	}
}