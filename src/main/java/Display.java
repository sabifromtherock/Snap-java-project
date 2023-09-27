import java.util.Scanner;

public class Display {
  private static final Scanner scanner = new Scanner(System.in);

  public static int showMenuAndGetChoice() {
    System.out.println("Welcome to Snap!\n");
    System.out.println("Options:");
    System.out.println("1 - Rules");
    System.out.println("2 - Start game\n");

    int choice = -1;
    while (choice < 1 || choice > 2) {
      System.out.print("Enter your choice (1 or 2): \n");
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        scanner.nextLine();
      } else {
        System.out.println("Invalid input. Please enter number: \n1 - to read the rules\n or \n2 - to start the game.\n");
        scanner.nextLine();
      }
    }
    return choice;
  }

  public static void displayRules() {
    System.out.println("Snap Rules:");
    System.out.println(
            "1. Press Enter to take your turn.\n2. A new card is dealt each turn.\n3. Win by typing 'snap' within 2 seconds\n   when two cards in a row have the same symbol.\n   Otherwise, you lose.\n");
  }

  public static String getPlayerName(String prompt) {
    String playerName = "";
    while (playerName.isEmpty()) {
      System.out.print(prompt);
      playerName = scanner.nextLine();

      if (playerName.isEmpty()) {
        System.out.println("Please enter a non-empty name.");
      }
    }
    return playerName;
  }

}
