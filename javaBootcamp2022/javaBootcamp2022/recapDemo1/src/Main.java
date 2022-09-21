public class Main {

    public static void main(String[] args) {
        int sayi1 = 35;
        int sayi2 = 42;
        int sayi3 = 12;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük Sayi: " + enBuyuk);
    }
}