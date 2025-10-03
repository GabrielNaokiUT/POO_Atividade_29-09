public class Animal{
    String nome;
    double peso;

    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    public void mostarinfo(){
        System.out.println("Nome: " + nome + ", peso: " + peso + " kg.");
        System.out.println();
    }
}
