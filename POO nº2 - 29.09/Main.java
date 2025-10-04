public class Main {

    public static void main(String[] args) {
        Livro titulo = new Livro("Dom Quixote de la Mancha", "Miguel Cervantes", 1246);
        titulo.mostrarinfo();
        Livro livro = new Livro("O senhor dos Anéis");
        livro.mostrartitulo();
    }
}
