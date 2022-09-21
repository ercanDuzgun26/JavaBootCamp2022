import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok sıcak";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " +mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(". Bunaltıcı bir hava"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("a"));
        char[] karekterler = new char[5];
        mesaj.getChars(0,5,karekterler,0);
        System.out.println(karekterler);

        System.out.println(mesaj.indexOf("ava"));
        System.out.println(mesaj.lastIndexOf("B"));
        */

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); // 2'den 5'e kadar 5. indexi almaz.

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim()); // basında ve sonunda boşlukları almaz.




    }
}
