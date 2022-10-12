import java.text.BreakIterator;

public class BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }
    public String deposit(int sum) {
        amount = +sum;
        return "вы пополнили счет на: " + sum;
    }

    public String withDraw(int sum) throws LimitException {
        if (sum >= amount) {
            throw new LimitException("остаток : " +  amount , amount) ;
        }
        amount = amount - sum;
        return "Вы успешно сняли со счета: 6000. осталось: " + amount;

    }

}