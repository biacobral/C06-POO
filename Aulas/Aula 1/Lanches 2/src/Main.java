import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de lanche1: ");
        int lanche1 = entrada.nextInt();        // entradas
        System.out.println("Digite a quantidade de lanche2: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite a quantidade de lanche3: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        int media = total / 3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Média de lanches: " + media);

        entrada.close();
    }
}