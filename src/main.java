public class main {
    public static void main(String [] args) {

        int account = 100;
        int payment = 2100;
        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 10;
        }

        int balanse = account + payment + bonus;
        System.out.println("Ваш баланс:" + balanse + "Ваш бонус -" + bonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
