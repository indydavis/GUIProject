import java.util.*;
/** Indiana Davis
  * Game
  * TCSS 142B - Autumn 2013
  * Homework 5
  */
/** This program plays a game with the user.
  * @author Indiana Davis
  * @version November 11, 2013
  */
public class Game{
	/** Main method, takes input from user and converts it to Roman numerals.
	  * @param args is not used, ignored.
	  * @return results based on selection.
	  */
    public static void main(String[] args){
    	Scanner choice = new Scanner(System.in);
		String cpu = "";
    	rules();
    	String select = choice.next();
    	select = test(select);
    	end(cpu, select);
    }
    public static void rules(){
    	System.out.println("This program allows you to play games of Rock, Paper, Scissors, Lizard, Spock against the computer.");
    	System.out.println("The rules are: ");
    	System.out.println("Rock beats Scissors and Lizard,");
    	System.out.println("Paper beats Rock and Spock,");
    	System.out.println("Scissors beats Paper and Lizard,");
    	System.out.println("Lizard beats Paper and Spock,");
    	System.out.println("and Spock beats Rock and Scissors.");
    	System.out.print("Please select your option; Rock, Paper, Scissors, Lizard, Spock, or Quit: ");
    }
    public static String computer(String cpu){
    	Random number = new Random();
		int pick = number.nextInt(5) + 1;
		if(pick == 1){
			cpu = "Rock";
		}else if(pick == 2){
			cpu = "Paper";
		}else if(pick == 3){
			cpu = "Scissors";
		}else if(pick == 4){
			cpu = "Lizard";
		}else if(pick == 5){
			cpu = "Spock";
		}
		return cpu;
    }
    public static String test(String select){
    	Scanner choice = new Scanner(System.in);
    	while(!select.equalsIgnoreCase("quit") && !select.equalsIgnoreCase("paper") && !select.equalsIgnoreCase("scissors") 
    			&& !select.equalsIgnoreCase("rock") && !select.equalsIgnoreCase("lizard") && !select.equalsIgnoreCase("spock")){
    		System.out.println("I'm sorry, I didn't understand your request.");
    		System.out.print("Please select an option: Rock, Paper, Scissors, Lizard, or Spock: ");
    		select = choice.next();
    	}
    	return select;
    }
    public static void end(String cpu, String select){
    	Scanner choice = new Scanner(System.in);
    	int tie = 0;
    	int win = 0;
    	int lose = 0;
    	int total = 0;
    	while(!select.equalsIgnoreCase("quit")){
    		cpu = computer(cpu);
    		if(cpu.equalsIgnoreCase(select)){
    			System.out.println("The computer chose: " + cpu + "; Tie!");
    			tie++;
    			total++;
    		}else if(cpu == "Rock" && select.equalsIgnoreCase("paper")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Rock" && select.equalsIgnoreCase("spock")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Lizard" && select.equalsIgnoreCase("rock")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Lizard" && select.equalsIgnoreCase("scissors")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Scissors" && select.equalsIgnoreCase("spock")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Scissors" && select.equalsIgnoreCase("rock")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Spock" && select.equalsIgnoreCase("paper")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Spock" && select.equalsIgnoreCase("lizard")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Paper" && select.equalsIgnoreCase("scissors")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else if(cpu == "Paper" && select.equalsIgnoreCase("lizard")){
    			System.out.print("The computer chose: " + cpu + "; You Won!");
    			win++;
    			total++;
    		}else{
    			System.out.print("The computer chose: " + cpu + "; You Lose!");
    			lose++;
    			total++;
    		}
    		select = choice.next();
    		test(select);
    	}
    	System.out.println(win + " wins, " + lose + " losses, " + tie + " ties, out of " + total + " total games.");
   	}
}