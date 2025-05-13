public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000.0, 500.0);

        Cliente c1 = new Cliente("Pernalonga", 123456);
        Cliente c2 = new Cliente("Patolino",   654321);
        Cliente c3 = null;

        conta.adicionarCliente(c1);
        conta.adicionarCliente(c2);
        conta.adicionarCliente(c3);

        conta.mostrarInfo();

        System.out.println("Programa executado até o final.");
    }
}
