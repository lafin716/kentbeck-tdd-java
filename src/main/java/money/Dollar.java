package money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    public Dollar times(int multiplier) {
        amount *= multiplier;
        return new Dollar(amount);
    }
}
