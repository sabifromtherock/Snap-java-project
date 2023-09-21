public class Card {
  private String suit;
  private String symbol;
  private int value;
  private static final String ANSI_RESET = "\033[1;37m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_BACKGROUND = "\033[47m";

  public Card(String suit, String symbol, int value) {
    this.suit = suit;
    this.symbol = symbol;
    this.value = value;
  }

  public String getSuit() {
    return suit;
  }

  public String getSymbol() {
    return symbol;
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    if (suit.equals("♥") || suit.equals("♦")) {
    return ANSI_BACKGROUND + ANSI_RED + symbol + " of " + suit + " (Value: " + value + ")" + ANSI_RESET;
    } else {
      return ANSI_BACKGROUND + ANSI_BLACK + symbol + " of " + suit + " (Value: " + value + ")" + ANSI_RESET;
    }
  }

}
