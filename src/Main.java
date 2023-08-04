public class Main {
    public static void main(String[] args) {
        System.out.println("Один из сотовых операторов решил сделать своим клиентам приятный бонус:" +
                " если клиент пополняет счёт более чем на 1000 рублей," +
                " то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.");
        int balansAmount = 100;
        int depositAmount = 1850;
        boolean theConditionsAreMet = depositAmount > 1000;

        int bonusAmount;
        if (theConditionsAreMet) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }
            int account = balansAmount + depositAmount + bonusAmount;

            System.out.println("Итоговая сумма на счете: " + account + "₽");
            System.out.println("Бонус за пополнение: " + bonusAmount + "₽");

    }
}
