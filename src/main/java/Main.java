public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Bob");
    Player player2 = new Player("John");
    SnapGame snapGame = new SnapGame("Snap Game", player1, player2);
    snapGame.shuffleDeck();
    snapGame.playSnapGame();
  }
}
