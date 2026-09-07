package enumeration_homework;

public enum Currency {
    USD("$", "United States"),
    EUR("€", "Eurozone"),
    JPY("¥", "Japan");

    private final String symbol;
    private final String country;

    // Constructor
    Currency(String symbol, String country) {
        this.symbol = symbol;
        this.country = country;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return name() + " - " + country;
    }

    public static void main(String[] args) {
        for (Currency c : Currency.values()) {
            System.out.println(c);
            System.out.println("Symbol: " + c.getSymbol() );
            System.out.println();
        }
    }
}