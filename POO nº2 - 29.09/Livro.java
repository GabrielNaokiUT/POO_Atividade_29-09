public class Livro{
    String titulo;
    String autor;
    int pag;

    public Livro(String titulo, String autor, int pag){
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }
    public Livro(String titulo){
        this.titulo = titulo;
        this.autor = null;
        this.pag = 0;
    }
    public void mostrarinfo(){
        System.out.println("Título: " + titulo + ", autor: " + autor + ", quantidade  de páginas: " + pag);
        System.out.println();
    }
    public void mostrartitulo(){
        System.out.println("Título: " + titulo + ", autor: " + autor + ", quantidade  de páginas: " + pag);
    }
}
