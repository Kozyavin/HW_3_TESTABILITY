public class CreditPaymentService {
    public int calculate(int amount, double rate, int month) {
        int payment = (int) (amount * (rate / 1200) * Math.pow(1 + (rate / 1200), month) / (Math.pow(1 + (rate / 1200), month) - 1));
        return payment;
    }
    //ЕП = С × ПС × (1 + ПС)ⁿ / ((1 + ПС)ⁿ – 1), где
    //ЕП – размер ежемесячного платежа,
    //С – сумма займа,
    //ПС – месячная ставка по займу в долях от единицы, которая вычисляется по формуле: годовая ставка / 12 мес. / 100%,
    //n – срок кредита (в месяцах).
}
