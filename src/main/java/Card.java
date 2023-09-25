
public class Card {
  private final String suit;
  private final String symbol;
  private final int value;

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
      return Color.RED.getColor() + symbol + " of " + suit + " (Value: " + value + ")" + Color.RESET.getColor();
    } else {
      return Color.BLACK.getColor() + symbol + " of " + suit + " (Value: " + value + ")" + Color.RESET.getColor();
    }
  }

}
