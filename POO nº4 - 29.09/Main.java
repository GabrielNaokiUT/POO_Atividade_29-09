public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("Coca-Cola lata 350ml", 250, 5.50);
        produto.mostrarinfo();
        Produto product = new Produto("Coca-Cola lata 350ml", 1, 5.50);
        product.mostrarinfo();
    }
}
