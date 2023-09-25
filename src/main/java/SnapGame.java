import java.util.Scanner;

public class SnapGame extends CardGame {

  public SnapGame(String name) {
    super(name);
  }

  public void playSnapGame() {
    String previousCardSymbol = null;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Snap! Press Enter to take your turn.");

    while (true) {
      scanner.nextLine();
      Card currentCard = dealCard();

      if (currentCard == null) {
        System.out.println(Color.RED.getColor() + "The deck is empty. Game over.");
        break;
      }

      System.out.println("You drew: " + currentCard);

      if (currentCard.getSymbol().equals(previousCardSymbol)) {
        System.out.println(Color.GREEN.getColor() + "Snap! You won!");
        break;
      }

      previousCardSymbol = currentCard.getSymbol();
    }

    scanner.close();
  }
}
