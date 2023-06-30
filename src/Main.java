public class Main {
    public static void main(String[] args) {

        int initialAccount = 300;
        int depositAmount = 1200;

        int bonus;
        if (depositAmount > 1000) {
            System.out.println((bonus = depositAmount / 100) + " бонусных рублей");
        } else {
            System.out.println((bonus = 0) + " бонусных рублей");
        }
        int finalAccount = depositAmount + initialAccount;
        System.out.println((finalAccount) + " рублей итоговый счет");
    }
}
