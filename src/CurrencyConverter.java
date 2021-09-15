public class CurrencyConverter {

    double[] currencies = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};

    void printCurrencies(){
        System.out.println("rupee: " + currencies[0]);
        System.out.println("dirham: " + currencies[1]);
        System.out.println("real: " + currencies[2]);
        System.out.println("chilean_peso: " + currencies[3]);
        System.out.println("mexican_peso: " + currencies[4]);
        System.out.println("yen: " + currencies[5]);
        System.out.println("$australian: " + currencies[6]);
    }

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }
}
