import java.util.HashSet;

public class Conta {
    private double saldo;
    private double limite;
    private HashSet<Cliente> clientes;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new HashSet<>();
    }

    public boolean sacar(double quantia) {
        if (quantia <= saldo + limite) {
            this.saldo -= quantia;
            return true;
        }
        return false;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void mostrarInfo() {
        System.out.println("=== Dados da Conta ===");
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("=== Clientes ===");
        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome: " + cliente.getNome() +
                        "\n CPF: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Cliente nulo encontrado.");
            }
        }
    }
}
