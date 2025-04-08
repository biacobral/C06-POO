public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    void adicionaDoceDeLeite() {
        System.out.println("Adicionando doce de leite...");
    }

    @Override
    void addCarrinhoDeCompras(){
        System.out.println("Adicionando Brownie de Doce de Leite no carrinho...");
    }

}
