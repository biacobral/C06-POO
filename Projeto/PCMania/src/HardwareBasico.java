public class HardwareBasico{
// Processador, Memória RAM e HD
    private String nome; // Processador
    private float capacidade; // Memórias

    HardwareBasico(String nome, float capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }
}
