class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome,String raca, double peso){
        super(nome, peso);
        this.raca = raca;
    }
    public void mostarinfo(){
        System.out.println("Nome: " + nome + ", raça: " + raca + ", peso: " + peso + " kg.");
    }
    
}
