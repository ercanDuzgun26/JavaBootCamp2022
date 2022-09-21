public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Başarılı şekilde geçtiniz");
                break;
            case 'B':
                System.out.println("B notu ile geçtiniz");
                break;
            case 'C':
            case 'D':
                System.out.println("C notu ile geçtiniz");
                System.out.println("D notu ile geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız...");
                break;
            default:
                System.out.println("Geçersiz not girildi...");
        }
    }
}
