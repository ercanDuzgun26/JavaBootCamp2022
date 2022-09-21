public class Main {
    public static void main(String[] args) {
        double[] doubleList = {1.2, 3.2, 5.4, 7.5};
        double total = 0;
        double max = doubleList[0];

        for (double number : doubleList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük Sayi = " + max);


    }
}
