import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10)+1; // (0 a 9) + 1 = 1 a 10

        System.out.println("Adivinhe o número que estou pensando entre 1 e 10:");

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        while(n!=x){
            System.out.print("Errado! ");
            if(n>x){
                System.out.println("Tente um número menor.");
            }
            else if(n<x){
                System.out.println("Tente um número maior.");
            }
            n = entrada.nextInt();
        }
        System.out.println("Adivinhou!");
        entrada.close();
    }
}