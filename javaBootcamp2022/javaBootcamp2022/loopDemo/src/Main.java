public class Main {

    public static void main(String[] args) {
        //Döngüler
        // 1) For Döngüsü
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("i'nin degeri : " + i);
        }
        System.out.println("For Döngüsü bitti");

        // 2) While Döngüsü

        int i = 1;
        while (i <= 11) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü bitti...");

        // 3) Do-While
        // While'dan farkı while'da şart sağlanmazsa çalışmaz.
        // Do-While'da şart sağlanmasa bile en az 1 kere çalışır.
        int j=100;
        do{
            // Log'lama icin kullanımı uygundur. Döngünün calıstığına dair, test edildiğine dair loglama
            System.out.println("Loglandı...");
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü bitti");
    }
}
