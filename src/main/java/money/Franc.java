package money;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
