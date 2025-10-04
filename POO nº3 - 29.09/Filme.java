public class Filme{
    String titulo;
    String diretor;
    int duracao;

    public Filme(String titulo, String diretor, int duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }
    public Filme(String titulo){
        this.titulo = titulo;
        this.diretor = "Diretor Desconehcido";
        this.duracao = 120;
    }
    public void mostrarinfo(){
        System.out.println("Filme: " + titulo + ", diretor: " + diretor + ", duração: " + duracao + " min.");
        System.out.println(" ");
    }
}
