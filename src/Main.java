public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance = 100;
        int payment = 1100;

        int bonus_payment_threshold = 1000;
        int bonus_delim = 100;
        int total_bonuses = 0;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (payment > bonus_payment_threshold) {
            total_bonuses = payment / bonus_delim;
        }
        balance += payment + total_bonuses;
        System.out.println(balance);
        System.out.println(total_bonuses);
    }
}