import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10)+1; // (0 a 9) + 1 = 1 a 10

        System.out.println("Adivinhe o número que estou pensando:");

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        while(n!=x){
            System.out.println("Errado! Tente novamente.");
            n = entrada.nextInt();
        }
        System.out.println("Adivinhou!");
        entrada.close();
    }
}