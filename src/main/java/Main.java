import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    CardGame cardGame = new CardGame("Snap");

    cardGame.sortDeckInNumberOrder();

    ArrayList<Card> sortedbyValueDeck = cardGame.getDeck();
    for (Card card : sortedbyValueDeck) {
      System.out.println(card);
    }
    System.out.println("ByValue ^^ --------------");


    cardGame.shuffleDeck();
    ArrayList<Card> shuffledDeck = cardGame.getDeck();
    for (Card card : shuffledDeck) {
      System.out.println(card);
    }
    System.out.println("Shuffled ^^ --------------");

    cardGame.sortDeckIntoSuits();

    ArrayList<Card> sortedBySuitDeck = cardGame.getDeck();
    for (Card card : sortedBySuitDeck) {
      System.out.println(card);
    }
    System.out.println("BySuit ^^ --------------");

  }
}
