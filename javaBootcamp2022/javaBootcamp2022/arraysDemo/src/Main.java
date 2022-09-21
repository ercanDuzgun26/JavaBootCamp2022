public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Mehmet";
        String ogrenci2 = "Kemal";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Emre";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Mehmet";
        ogrenciler[1] = "Kemal";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Emre";


        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------------------------------");

        for (String ogrenci : ogrenciler) { // String tipi, ogrenci degisken, ogrenciler icindekini ogrencilere atadı döndüre döndüre...
            System.out.println(ogrenci);
        }
    }
}
