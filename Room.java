import java.util.*;
public class Room {
	
	
	private static int playerChoice = -1;
	private static boolean hasWon = false;
	private static boolean hasKey = false;
	private static boolean vaseBroken = false;
	private static boolean bedroomDrawerOpen = false;
	private static boolean beenSlimed = false;
	private static boolean basementLightOn = false;
	private static int playerHealth = 2;
	private static boolean hasKnife = false;
	
	public static int getHealth() {
		return playerHealth;
	}
	
	public static boolean getLight() {
		return basementLightOn;
	}
	
	public static boolean getKnife() {
		return hasKnife;
	}
	public boolean getWon(){
		return hasWon;
	}
	
	public static boolean getKey(){
		return hasKey;
	}
	
	public static boolean getVase(){
		return vaseBroken;
	}
	
	public boolean getDrawer(){
		return bedroomDrawerOpen;
	}
	
	public static boolean getSlimed(){
		return beenSlimed;
	}
	public static boolean lifeFull() {
		if (playerHealth == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static String getNextLine() {
		Scanner snarkyman = new Scanner(System.in);
		return snarkyman.nextLine().toLowerCase();
	}
	
	public static int getNextInt() {
		Scanner snarkyman = new Scanner(System.in);
		return snarkyman.nextInt();
	}
	
	
public static void gameBegin() {
	
	
	System.out.println("just a forewarning, if you are stupid enough to enter anything other than a number you will have to restart the entire program -an Idiot");
	System.out.println("Welcome user!");
	System.out.println("Time for chaos >:)");
	System.out.println("What is your name user?");
	String name =getNextLine();
	System.out.println( name + "? what a horible name, im just going to call you Steven,");
	System.out.println("try to be more creative next time,");
	name = ("Steven");
	System.out.println("Lets begin shall we?");
	System.out.println("Im too lazy to to give a proper intro, so bla bla something about a weird creepy house,");
	System.out.println("and lets see.....");
	System.out.println("Oh look Steven! We are in the living room");
	livingRoom();
	
}

public static void livingRoom() {
	System.out.println("Ok Steven, the living room is old and victorian looking, not that you would know what victorian looks like,");
	System.out.println("anyway, type 1 to go to the kitchen");
	System.out.println("2 to go to the bedroom");
	System.out.println("3 to go to the bathroom");
	System.out.println("4 to go to the basement");
	System.out.println("or press 5 to choose violence and break this random vase on the wall, that would be pretty rude tho");
	playerChoice = getNextInt();
	
	if(playerChoice == 1) {
		Kitchen();
	} else if(playerChoice == 2) {
		Bedroom();
	} else if(playerChoice == 3) {
		Bathroom();
	} else if(playerChoice == 4) {
		Basement();
	} else if(playerChoice == 5) {
		if(getVase() == true) {
			System.out.println("dude, you already smashed it, what else do you want to do with it?");
			livingRoom();
		} else {
		vaseBroken = true;
		hasKey = true;
		System.out.println("you grab the vase gently caressing it as you pull it off of the shelf");
		System.out.println("AND SMASH IT ON THE GROUND IN A VIOLENT FURY");
		System.out.println("you find inside astrange key with a winky face, as long as some form of ashes “who hides a key in their ashes?” you wonder to yourself, shrugging it off you grab the key and stuff it in your pocket.");
		livingRoom();
		}
	} else {
		System.out.println("What did you just say? lets take it back to the top");
		playerChoice = -1;
		livingRoom();
	}
	
}
public static void Kitchen() {
	System.out.println("alright lets see what we got here,");
	System.out.println("inside you find a ratty kitchen in dissaray, there is a rusty fridge that might have some edible food in it, take a look I dare you");
	System.out.println("1 to go to the living room");
	System.out.println("2 to go to the bedroom");
	System.out.println("3 to go to the bathroom");
	System.out.println("4 to go to the basement");
	System.out.println("5 to make yourself a snack");
playerChoice = getNextInt();
	
	if(playerChoice == 1) {
		livingRoom();
	} else if(playerChoice == 2) {
		Bedroom();
	} else if(playerChoice == 3) {
		Bathroom();
	} else if(playerChoice == 4) {
		Basement();
	} else if(playerChoice == 5) {
		if (lifeFull() == true) {
			System.out.println("you somehow managed to scrape together a decent tasting meal, congrats");
			Kitchen();
		} else {
			System.out.println("it doesnt taste amazing but fills you anyway +1 health");
			playerHealth =2;
			Kitchen();
		}
	} else {
		System.out.println("What did you just say? lets take it back to the top");
		playerChoice = -1;
		Kitchen();
	}
}
public static void Bedroom() {
	System.out.println("the bedroom looks like it has been inhabited by a vampire, with red drapes and darkened windows, the sun barely shines through enough for you to see a nightstand with a locked drawer");
	System.out.println("1 to go to the living room");
	System.out.println("2 to go to the kitchen");
	System.out.println("3 to go to the bathroom");
	System.out.println("4 to go to the basement");
	System.out.println("5 to open the drawer");
	playerChoice = getNextInt();
	if(playerChoice == 1) {
		livingRoom();
	} else if(playerChoice == 2) {
		Kitchen();
	} else if(playerChoice == 3) {
		Bathroom();
	} else if(playerChoice == 4) {
		Basement();
	} else if(playerChoice == 5) {
		if(getKey() == true) {
			System.out.println("The face on your previously acquired key winks at you as you remove it from your pocket. “use me!” It squeaks, kinda weird, but you stuff the key into the keyhole, cranking it to the side as it screams in pain, you find a cool knife in the drawer, but wonder if it was worth interacting with the key to get it");
		hasKnife = true;
		Bedroom();
		} else {
			System.out.println("I told you that the drawer was locked, get a key stupid");
			Bedroom();
		}
	} else {
		System.out.println("What did you just say? lets take it back to the top");
		playerChoice = -1;
		Bedroom();
	}
}
public static void Bathroom() {
	System.out.println("welcome to the crusty old bathroom, you gonna use it? should I give you some privacy?");
	System.out.println("1 to go to the living room");
	System.out.println("2 to go to the Kitchen");
	System.out.println("3 to go to the Bedroom");
	System.out.println("4 to go to the Basement");
	System.out.println("5 to wash up");
	playerChoice = getNextInt();
	if(playerChoice == 1) {
		livingRoom();
	} else if(playerChoice == 2) {
		Kitchen();
	} else if(playerChoice == 3) {
		Bedroom();
	} else if(playerChoice == 4) {
		Basement();
	} else if(playerChoice == 5) {
		if(getSlimed() == true) {
			System.out.println("You run around frantically turning on every faucet in the room and doing everything you can to remove the dreadful slime as it oozes around on your skin. After about an hour of scrubbing and a decent amount of raw skin, the slime has seemingly been washed down the drain");
		beenSlimed = false;
			Bathroom();
		} else {
			System.out.println("You gently wash your hands and face, enjoying the warmth of the water");
			Bathroom();
		}
	} else {
		System.out.println("What did you just say? lets take it back to the top");
		playerChoice = -1;
		Bathroom();
	}
}
public static void Basement() {
	if (basementLightOn == false) {
	System.out.println("welcome to the basement, its quite dark");
	} else {
		System.out.println("the lights are on in the basement, what will you do?");
	}
	System.out.println("1 to go to the living room");
	System.out.println("2 to go to the Kitchen");
	System.out.println("3 to go to the Bedroom");
	System.out.println("4 to go to the Bathroom");
	System.out.println("5 to find a light");
	System.out.println("6 to press on");
	playerChoice = getNextInt();
	if(playerChoice == 1) {
		livingRoom();
	} else if(playerChoice == 2) {
		Kitchen();
	} else if(playerChoice == 3) {
		Bedroom();
	} else if(playerChoice == 4) {
		Basement();
	} else if(playerChoice == 5) {
		if(getKnife() == true) {
			System.out.println("while stumbling around in the dark for a few minutes a rat jumps out at you, lucky you got this funky knife that stabs the rat and you turn the lights on");
			basementLightOn = true;
			Basement();
		} else {
			System.out.println("while stumbling around in the dark for a few minutes a rat jumps out at you, since you have nothing to fight back with you take one damage");
			playerHealth -= 1;
			if(playerHealth == 0) {
				System.out.println("you died, try again");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				 playerChoice = -1;
				 hasWon = false;
				 hasKey = false;
				 vaseBroken = false;
				 bedroomDrawerOpen = false;
				 beenSlimed = false;
				 basementLightOn = false;
				 playerHealth = 2;
				 hasKnife = false;
				gameBegin();
			} else {
				Basement();
			}
		}
	} else if(playerChoice == 6){
		if(basementLightOn == true) {
			System.out.println("to be continued....");
			System.out.println("play again? 1 for yes 2 for no");
			playerChoice = getNextInt();
			if(playerChoice == 1) {
				playerChoice = -1;
				 hasWon = false;
				 hasKey = false;
				 vaseBroken = false;
				 bedroomDrawerOpen = false;
				 beenSlimed = false;
				 basementLightOn = false;
				 playerHealth = 2;
				 hasKnife = false;
				 System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
				gameBegin();
			} else {
				return;
			}
		} else {
			System.out.print("there is no light on, try again");
			Basement();
		}
		
	} else {
		System.out.println("What did you just say? lets take it back to the top");
		playerChoice = -1;
		Bathroom();
	}
}
}
