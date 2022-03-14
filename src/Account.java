public class Account {
    private String name;
    private String surname;
    private int ID;
    private int balance;
    private int cash;


    public Account(String name, String surname, int ID, int balance) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int cash) {
        this.balance = balance-cash;


    }

    if (cash > balance)
    }


    public void deposit (int payment) {
        this.balance = balance+payment;

    }

}
