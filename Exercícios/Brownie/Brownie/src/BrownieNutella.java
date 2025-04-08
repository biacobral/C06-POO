public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    void adicionaNutella(){
        System.out.println("Adicionando Nutella...");
    }

    @Override
    void addCarrinhoDeCompras(){
        System.out.println("Adicionando Brownie de Nutella no carrinho...");
    }

}
