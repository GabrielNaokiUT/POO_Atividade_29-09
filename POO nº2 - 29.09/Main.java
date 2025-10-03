public class Main {

    public static void main(String[] args) {
        Livro titulo = new Livro("Dom Quixote de la Mancha", "Miguel Cervantes", 1246);
        titulo.mostrarinfo();
        Livro livro = new Livro("Dom Quixote de la Mancha", null, 0);
        livro.mostrartitulo();
    }
}
