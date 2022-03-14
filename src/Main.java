public class Main {
    public static void main(String[] args){

        Account user1 = new Account("Jan", "Kowalski", 1234, 777);
        Account user2 = new Account("Grazyna", "Nowak", 9876, 4444);

        System.out.println(user1.getBalance());
        user1.withdrawal(78);
        System.out.println(user1.getBalance());

        System.out.println(user2.getBalance());
        user2.deposit(456);
        System.out.println(user2.getBalance());




    }
}
