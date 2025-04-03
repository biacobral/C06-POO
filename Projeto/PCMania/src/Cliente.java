public class Cliente {

    private String nome;
    private long cpf;
    public Computador[] computadores = new Computador[3];


    Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {
        float totalCompra = 0;

        for(int i = 0; i < computadores.length; i++) {
            totalCompra += computadores[i].quantidade * computadores[i].preco;
        }

        return totalCompra;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }
}
