public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop")  ;
        product.setPrice(4000) ;
        product.setStockAmount(3) ;
        product.setId(12345678) ;
        product.setDescription("Ürün Açıklaması");


        ProductManeger producktManager = new ProductManeger();
        producktManager.Add(product);
        System.out.println(product.getKod());

    }
}