public class Main {
    public static void main(String[] args) {
        int number1 = 220;
        int number2 =284;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i<number1; i++){
            if (number1 % i == 0)
                sum1 += i;
        }
        for (int i = 1; i<number2; i++){
            if (number2 % i == 0)
                sum2 += i;
        }

        if (sum1 == number2 && sum2 == number1){
            System.out.println("" + number1 + " ve " + number2 + " arkadaş sayılardır.");
        }
        else{
            System.out.println("" + number1 + " ve " + number2 + " arkadaş sayı değillerdir.");

        }
    }
}