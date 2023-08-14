public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance = 100;
        int payment = 1100;

        int bonusPaymentThreshold = 1000;
        int bonusDelim = 100;
        int totalBonuses = 0;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (payment > bonusPaymentThreshold) {
            totalBonuses = payment / bonusDelim;
        }
        balance += payment + totalBonuses;
        System.out.println(balance);
        System.out.println(totalBonuses);
    }
}