package ePortfolio;
import java.util.Scanner;
/**
 * Main class. contains main method
 */
public class Main {
	/**
	 * Main. calls for a menu, goes until "quit" or "q" is entered. Initializes portfolio instance, and scanner instance. 
	 * Possible commands for the menu are displayed in the form of "command (short form of the command als accepted)": 
	 * "buy (b)", "sell (s)", "update (u)", "getGain (g) (gg)", "search (sr)", "printAll (print) (p)", "quit (q)"
	 * @param argv
	 */
	public static void main(String argv[]) {
		if (argv.length > 1){
			System.out.println("Filename not provided.");
			return;
		}
		Portfolio portfolio = new Portfolio();
		portfolio.readFile(argv[0]);

		Scanner keyboard = new Scanner(System.in);
		String command = new String();
		while (!command.strip().equalsIgnoreCase("quit") && !command.strip().equalsIgnoreCase("q")) {
			System.out.print("Enter the command (available commands are buy, sell, update, getGain, search, printAll, quit): ");
			command = keyboard.nextLine();

			switch(command.toLowerCase().strip()){
				case "b":
				case "buy":
					portfolio.buy(keyboard);
					break;
				case "s":
				case "sell":
					portfolio.sell(keyboard);
					break;

				case "u":
				case "upd":
				case "update":
					portfolio.update(keyboard);
					break;
				case "g":
				case "gg":
				case "getgain":
					portfolio.getGain();
					break;
				case "sr":
				case "search":
					portfolio.search(keyboard);
					break;
				case "p":
				case "print":
				case "printall":
					portfolio.printAll();
					break;
				case "q":
				case "quit":
					break;
				default:
					System.out.println("Invalid command, try again.");
					break;
			}
		}
		System.out.println("Saving to " + argv[0] + ".");
		portfolio.saveFile(argv[0]);
		System.out.println("Exiting...");
		keyboard.close();
	}
}
