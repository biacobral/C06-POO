public class Main {
    public static void main(String[] args) {

        Zumbi z = new Zumbi();
        z.nome = "Shane";
        z.vida = 0;

        System.out.println("Vida inicial de " + z.nome + ": " + z.vida);

        z.transfereVida(z, 100);

    }
}
