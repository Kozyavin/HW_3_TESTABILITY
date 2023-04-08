public class Main {
    public static void main(String[] args) {

        CreditPaymentService answer = new CreditPaymentService();
        /*int payment = answer.calculate(1_000_000,9.99,12); //amount,rate,month*/

        System.out.println("При сумме кредита 1_000_000 руб, ставке 9.99% и сроке 12 месяцев\nСумма ежемесячного платежа составит: " + (answer.calculate(1_000_000, 9.99, 12)) + " рублей");
        System.out.println();
        System.out.println("При сумме кредита 1_000_000 руб, ставке 9.99% и сроке 24 месяца\nСумма ежемесячного платежа составит: " + (answer.calculate(1_000_000, 9.99, 24)) + " рублей");
        System.out.println();
        System.out.println("При сумме кредита 1_000_000 руб, ставке 9.99% и сроке 32 месяца\nСумма ежемесячного платежа составит: " + (answer.calculate(1_000_000, 9.99, 36)) + " рублей");

    }
}
