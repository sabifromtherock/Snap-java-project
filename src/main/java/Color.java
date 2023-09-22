public enum Color {
  RED("\u001B[31m"),
  BLACK("\u001B[30m"),
  RESET("\033[1;37m"),
  BACKGROUND("\033[43m");

  private final String code;

  Color(String code) {
    this.code = code;
  }

  public String getColor() {
    return code;
  }
}
