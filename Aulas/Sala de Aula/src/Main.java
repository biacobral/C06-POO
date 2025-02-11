import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o números de alunos: ");
        int n = entrada.nextInt(); // número de alunos

        switch (n){
            case 10: // não há break no case 10 poisé igual ao case 20
                case 20: // case 10 e 20 são os mesmos
                    System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
            break;
            default:
                System.out.println("Não há sala disponível");
        }

        entrada.close();
    }
}