public class Produto{
    String nome;
    int quant;
    double preco;

    public Produto(String nome, int quant, double preco){
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quant = 1;
    }
    public void mostrarinfo(){
        System.out.println("Produto: " + nome + ", quantidade: " + quant + ", preço: R$ " + preco);
        System.out.println();
    }
} 
