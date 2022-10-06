public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.add(2, 3));
        dortIslem.add(1, 2, 5);
        System.out.println(dortIslem.add(2, 3, 6));
    }
}