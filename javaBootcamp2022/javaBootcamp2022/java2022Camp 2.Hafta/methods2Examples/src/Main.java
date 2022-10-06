public class Main {
    public static void main(String[] args) {
    String message = "Hava bugün çok iyi..";
    String newMessage = message.substring(0,3);
    System.out.println(newMessage);

    String newMessage2 = sehirVer();
        System.out.println(newMessage2);

    int sayi = topla(7,10);
        System.out.println(sayi);

        //Variable Arguments
    int toplam = topla2(1,2,5,8,9,2,12,5,7);
    //Birden fazla sayi tanımlanıyor.
        System.out.println(toplam);



    }

    public static void add(){
        System.out.println("Eklendi..");
    }
    public static void delete(){
        System.out.println("Silindi..");
    }
    public static void update(){
        System.out.println("Güncellendi..");
    }
    public  static int topla(int sayi1 , int sayi2){
        return sayi1 + sayi2;
    }
    public static String sehirVer(){
        return "Eskisehir";
    }

    public static int topla2(int... sayilar){
        // int ... üç nokta kullanınca dizi yerine geçiyor.
        //Birden fazla int girebiliriz.
        int toplam = 0;
        for (int sayi : sayilar){
            toplam += sayi;
        }
        return toplam;


    }
}