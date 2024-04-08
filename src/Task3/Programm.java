package Task3;

public class Programm {
    public static void main(String[] args) {

        Person person1 = new Person("FIO #1", "100000012");
        Enitity enitity1 = new Enitity("GeekBrains", "100000013");
        DebitAccount<Enitity> debitAccount1 = new DebitAccount<>(enitity1, 40000000);
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 100);
        Transaction<Account<?>> transaction1 = new Transaction<>(debitAccount1,creditAccount1, 30000);
        transaction1.execute();
    }
}
