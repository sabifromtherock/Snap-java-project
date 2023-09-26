public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    SnapGame snapGame = new SnapGame("Snap Game", player1, player2);

    while (true) {
      int choice = Display.showMenuAndGetChoice();

      switch (choice) {
        case 1:
          Display.displayRules();
          break;
        case 2:
          String player1Name = Display.getPlayerName("Enter Player 1 name: ");
          String player2Name = Display.getPlayerName("Enter Player 2 name: ");
          player1.setName(player1Name);
          player2.setName(player2Name);
          snapGame.shuffleDeck();
          snapGame.playSnapGame();
          break;
        default:
          System.out.println("Invalid choice. Please select a valid option.");
          break;
      }
    }
  }
}
