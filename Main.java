
// imports
import java.util.Scanner;
import java.util.ArrayList;

// main class
class Main {

  ArrayList<String> list = new ArrayList<String>();
  static Scanner input = new Scanner(System.in);

  static int easterEggs = 0;
  static boolean flowerTaken = false;
  static boolean techxTaken = false;
  static boolean key = false;
  static boolean taken = true;
  static boolean keanuReevesSeen = false;
  static String flowerName = "";
  static String enterGame = "";
  static double e19_urmom;

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Hello world! \nAre you ready to adventure into the Deep Dark? \nThe commands you will be using thoughout this adventure are as follows: yes, no, interact, inventory, commands, attack, north, east, south, and west");
    System.out.println("If you need to use 'yes', 'no', or if you need to enter a custom word, then you will be prompted.\nOtherwise, you can try any of the other commands. If you need to refer back to the commands then simply type in commands when you are making a decision.");
    System.out.println("Interact will try to interact with anything in the room.\nAttack will attempt to kill the enemy.\nAny of the movement words will move you into the room in that direction.\nInventory will display the items you currently have.");
    System.out.println("Lets begin, shall we? (yes/no)");
    startRoom();

  } // end main method

  /* ----- Room methods ----- */
  public static void startRoom() {
    enterGame = input.nextLine();
    if (enterGame.equals("yes") || enterGame.equals("y")) {
      System.out.println("Wondeful! I hope you enjoy your adventure, traveler.");
    }
    else {
      System.out.println("That's too bad, play now.");
    }
    room1();
  } // end startRoom

  public static void room1(){
    System.out.println("You fall down a hole and miraculously don't die. Nice!! \nAll you can see is a single yellow dandelion. \nWhat do you want to name it? (Type in a response)");
    flowerName = input.nextLine();
    if (flowerName.equals("flowey")) {
      System.out.println("You named your flower " + flowerName + ". Nice one, very based.");
      easterEggs++;
    }
    else if (flowerName.equals("Marcus")) {
      System.out.println("You named your flower " + flowerName + ". ur mom lol gottem.");
      easterEggs++;
    }
    else if (flowerName.equals("Sid")) {
      System.out.println("You named your flower " + flowerName + ". Rumor has it, your mom, this dandelion was called the hard r even though it's originally from India.");
      easterEggs++;
    }
    else if (flowerName.equals("Loukas")) {
      System.out.println("You named your flower " + flowerName + ". It's yellow. hehehehehehe.");
      easterEggs++;
    }
    else if (flowerName.equals("") || flowerName.equals(" ")) {
      System.out.println("You named your flower \" \". Lazy bitch.");
    }
    else {
      System.out.println("You named your flower " + flowerName + ".");
    }
  }

  /* ----- Non room methods ----- */

  

} // end main class