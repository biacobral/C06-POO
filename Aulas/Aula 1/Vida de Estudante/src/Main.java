import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota da NPA: ");
        int NPA = entrada.nextInt();

        if(NPA>=60){
            System.out.println("Aprovado!");
        }
        else if(NPA<30){
            System.out.println("Reprovado!");
            // o que eu faço pra parar??????????
        }
        else{
            System.out.println("NP3!");

            System.out.println("Informe a nota da NP3: ");
            int NP3 = entrada.nextInt();

            int total = (NPA + NP3)/2;

            if(total>=50){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
        entrada.close();
    }
}