public class Main {

    public static void main(String[] args) {
        int balanse = 100;
        int check = 1100;

        int bonus = 0;
        if (check > 1000) {
            bonus = check / 100;
        }
        int ruble = check + bonus + balanse;
        System.out.println("Итого на счету: " + ruble);
        System.out.println("Бонусы: " + bonus);

    }
}
