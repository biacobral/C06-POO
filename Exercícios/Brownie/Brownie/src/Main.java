// Exercicio 1

public class Main {
    public static void main(String[] args) {

    BrownieNutella bn = new BrownieNutella("marrom bombom", 15, "nutella");
    BrownieDoceDeLeite bd = new BrownieDoceDeLeite("docinho de coco", 10, "doce de leite");
    BrownieCafe bc = new BrownieCafe("cafezin", 12, "cafe");

    bn.adicionaNutella();
    bn.addCarrinhoDeCompras();
    bn.mostraInfo();
    bn.calculaValorTotalCompra();

    bd.adicionaDoceDeLeite();
    bd.addCarrinhoDeCompras();
    bd.mostraInfo();
    bd.calculaValorTotalCompra();

    bc.adicionaCafe();
    bc.addCarrinhoDeCompras();
    bc.mostraInfo();
    bc.calculaValorTotalCompra();

    }
}