package com.radialsoftworks.www;
public class characterGenerator {
	
	public static String weaponMastery = null;
	
	static void getCharacter() {
    int masteryPicker = 1 + (int) (Math.random() * 7);
    	switch (masteryPicker) {
			case 1:
				weaponMastery = "Axe";
				break;
			case 2:
				weaponMastery = "Polearm";
				break;
			case 3:
				weaponMastery = "Dagger";
				break;
			case 4:
				weaponMastery = "Spear";
				break;
			case 5:
				weaponMastery = "Sword";
				break;
			case 6:
				weaponMastery = "Magic";
				break;
			case 7:
				weaponMastery = "Bow";
				break;
    	}
	}
}
