package money;

public class Sum implements Expression {

    Expression augend;
    Expression addend;

    Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }

    @Override
    public Expression reduce(Bank bank, String to) {
        return augend.reduce(bank, to).plus(addend.reduce(bank, to));
    }
}
