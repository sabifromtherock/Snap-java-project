import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SnapGame extends CardGame {
  private final Player player1;
  private final Player player2;
  int currentPlayer = 1;

  public SnapGame(String name, Player player1, Player player2) {
    super(name);
    this.player1 = player1;
    this.player2 = player2;
  }

  public void playSnapGame() {
    String previousCardSymbol = null;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nWelcome to Snap! Press Enter to take your turn.");

    while (true) {
      scanner.nextLine();
      Card currentCard = dealCard();

      if (currentCard == null) {
        System.out.println(Color.RED.getColor() + "The deck is empty. Game over." + Color.RESET.getColor());
        System.exit(0); //force to exit the application
        break;
      }

      if (currentPlayer == 1) {
        System.out.println(Color.PLAYER1.getColor() + player1.getName() + " drew: " + currentCard);
      } else {
        System.out.println(Color.PLAYER2.getColor() + player2.getName() + " drew: " + currentCard);
      }

      if (currentCard.getSymbol().equals(previousCardSymbol)) {
        System.out.println();

        // timer setup
        Timer timer = new Timer();
        TimerTask snapTask = new TimerTask() {
          @Override
          public void run() {
            System.out.println(Color.RED.getColor() + "Time's up! " + Color.GREEN.getColor() + (currentPlayer == 1 ? player2.getName() : player1.getName()) + " wins.");
            timer.cancel();
            System.exit(0); //force to exit the application
          }
        };
        timer.schedule(snapTask, 4000);

        String userInput = scanner.nextLine();
        timer.cancel();

        if ("snap".equalsIgnoreCase(userInput)) {
          System.out.println(Color.GREEN.getColor() + "Snap! " + (currentPlayer == 1 ? player1.getName() : player2.getName()) + " wins!");
        } else {
          System.out.println(Color.RED.getColor() + "You lost! " + Color.GREEN.getColor() + (currentPlayer == 1 ? player2.getName() : player1.getName()) + " wins!");
        }
        System.exit(0); //force to exit the application
        break;
      }

      previousCardSymbol = currentCard.getSymbol();
      currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    scanner.close();
  }
}
