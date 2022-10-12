public class Main {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.deposit(20000));

        while (true) {
            try {
                System.out.println(bankAccount.withDraw(6000));
            }catch (LimitException e){
                System.out.println(e.getMessage());
                int newAmount = (int) Math.round(e.getRemainingAmount());
                try {
                    System.out.println(bankAccount.withDraw(newAmount));
                }catch (LimitException ex){
                    System.out.println(ex.getMessage());
                }
                break;
            }
        }
    }
}