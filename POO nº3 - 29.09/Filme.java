public class Filme{
    String titulo;
    String diretor;
    int duracao;

    public Filme(String titulo, String diretor, int duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }
    public void mostrarinfo(){
        System.out.println("Filme: " + titulo + ", diretor: " + diretor + ", duração: " + duracao + " min.");
        System.out.println(" ");
    }
}
