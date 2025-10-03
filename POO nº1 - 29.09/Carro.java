public class Carro{
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarinfo(){    
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
    }
}
