package classWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product= new Product();

        product.getId();
        product.setId(2307);
        product.setId(123);
        product.setName("TOSHİBA");
        System.out.println("product.getKod() = " + product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.ekle(product);
    }


}
