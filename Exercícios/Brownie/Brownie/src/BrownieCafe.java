public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    void adicionaCafe(){
        System.out.println("Adicionando cafe...");
    }

    @Override
    void addCarrinhoDeCompras(){
        System.out.println("Adicionando Brownie de Café no carrinho...");
    }
}
