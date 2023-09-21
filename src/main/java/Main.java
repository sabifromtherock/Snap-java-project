public class Main {
  public static void main(String[] args) {
    CardGame cardGame = new CardGame("Snap");

    System.out.println("Name of the Card Game: " + cardGame.getName());
    System.out.println("Deck of Cards:");
    for (Card card : cardGame.getDeck()) {
      System.out.println(card);
    }
  }
}
