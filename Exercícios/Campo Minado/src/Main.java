import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        boolean campoMinado[][] = new boolean[2][2];

        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        campoMinado[x][y] = true;

        int respostaX;
        int respostaY;
        int cont = 0; // ?

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite uma posição do campo (x, y): ");
            respostaX = sc.nextInt();
            respostaY = sc.nextInt();
            if (!campoMinado[respostaX][respostaY]) {
                System.out.println("Sem bomba!");
                cont++;
            }
            if (campoMinado[respostaX][respostaY]) {
                System.out.println("CABUUUM!");
                cont=0;
            }

        }while(cont<4); // while(respostaX != x && respostaY != y)?

        System.out.println("Jogo encerrado!");
        sc.close();

    }

}