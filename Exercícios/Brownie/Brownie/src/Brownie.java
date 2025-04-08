public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    void addCarrinhoDeCompras(){

        System.out.println("Adicionando no carrinho de compras...");

    }

    void calculaValorTotalCompra(){

        System.out.println("Total de compras: " + preco);

    }

    void mostraInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);

    }
}
