public enum Color {
  RED("\u001B[31m"),
  BLACK("\u001B[30m"),
  RESET("\033[0m"),
  GREEN("\033[1;32m"),
  PLAYER1("\033[0;34m"),
  PLAYER2("\033[0;33m");

  private final String code;

  Color(String code) {
    this.code = code;
  }

  public String getColor() {
    return code;
  }
}
