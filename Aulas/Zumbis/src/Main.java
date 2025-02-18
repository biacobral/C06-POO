public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        z1.nome = "Shane";
        z1.vida = 100;

        Zumbi z2 = new Zumbi();
        z2.nome = "Sasha";
        z2.vida = 80;

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());


        boolean transferiu = z1.transfereVida(z2, 120);

        if (transferiu) {
            System.out.println("Transferência de vida feita com sucesso!");
            System.out.println(z1.mostraVida());
            System.out.println(z2.mostraVida());
        }
        else {
            System.out.println("Erro de transferência de vida!");
        }

    }
}
