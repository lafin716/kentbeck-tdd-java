package money;

public interface Expression {

    Expression plus(Expression addend);

    Expression times(int multiplier);

    Expression reduce(Bank bank, String to);
}
