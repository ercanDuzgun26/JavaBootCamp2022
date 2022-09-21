public class Main {
    public static void main(String[] args) {

        char karekter = 'E';
        byte sayi = 127; // -128 to 127
        short sayi2 = 32767; // -32768 to 32767
        int sayi3 = 2147483647; // en cok kullanılan -2147483648 to 2147483648
        long sayi4 = 9223372036854775807L; //
        float ondalikliSayi = 4.7F; // double'dan daha kucuk veri tutar
        double ondalikliSayi2 = 20.4; // ondalıklı sayılarda en cok kullanılan
        boolean dogruMu = true;

        System.out.println("datatypes : " + karekter + "  " + sayi + "  " + sayi2 + sayi3 + sayi4 + ondalikliSayi + ondalikliSayi2 + dogruMu);
    }
}