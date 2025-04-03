import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int promo1=0, promo2=0, promo3=0;
        Scanner entrada = new Scanner(System.in);

        // Memórias USB
        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        memoriaUSB1.setNome("Pen Drive");
        memoriaUSB1.setCapacidade(16);

        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        memoriaUSB2.setNome("Pen Drive");
        memoriaUSB2.setCapacidade(32);

        MemoriaUSB memoriaUSB3 = new MemoriaUSB();
        memoriaUSB3.setNome("HD Externo");
        memoriaUSB3.setCapacidade(1);

        Computador[] computadores = new Computador[3];
        // Promoção 1
        HardwareBasico hardwareProcessador1 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico hardwareRAM1 = new HardwareBasico("Memória RAM", 8); // Gb
        HardwareBasico hardwareHD1 = new HardwareBasico("Memória HD", 500); // Gb
        SistemaOperacional sistema1 = new SistemaOperacional("Linux Ubuntu", 32);
        Computador computador1 = new Computador("Apple", 2082, hardwareProcessador1, hardwareRAM1, hardwareHD1, sistema1);
        computadores[0] = computador1;

        // Promoção 2
        HardwareBasico hardwareProcessador2 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico hardwareRAM2 = new HardwareBasico("Memória RAM", 16); //Gb
        HardwareBasico hardwareHD2 = new HardwareBasico("Memória HD", 1); //Tb
        SistemaOperacional sistema2 = new SistemaOperacional("Windows 8", 64);
        Computador computador2 = new Computador("Samsung", 3316, hardwareProcessador2, hardwareRAM2, hardwareHD2, sistema2);
        computador2.addMemoriaUSB(memoriaUSB2);
        computadores[1] = computador2;

        // Promoção 3
        HardwareBasico hardwareProcessador3 = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico hardwareRAM3 = new HardwareBasico("Memória RAM", 32);//Gb
        HardwareBasico hardwareHD3 = new HardwareBasico("Memória HD", 2);//Tb
        SistemaOperacional sistema3 = new SistemaOperacional("Windows 10", 64);
        Computador computador3 = new Computador("Dell", 7760, hardwareProcessador3, hardwareRAM3, hardwareHD3, sistema3);
        computador3.addMemoriaUSB(memoriaUSB3);
        computadores[2] = computador3;



        Promocoes promocoes = new Promocoes();

        int opcao;

        System.out.println("Seja bem-vindo(a) ao PCMania! \nAs promoções disponíveis são:");
        promocoes.mostraPromo1();
        promocoes.mostraPromo2();
        promocoes.mostraPromo3();

        System.out.println("\nVamos fazer seu cadastro agora!");

        System.out.print("Digite seu nome: ");
        String nomeCliente = entrada.nextLine();
        System.out.print("Digite seu CPF: ");
        long CPFCliente = entrada.nextLong();
        Cliente cliente = new Cliente(nomeCliente, CPFCliente);

        System.out.println("Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf());

        System.out.println("Cadastrado com sucesso!");

        entrada.nextLine();

        do {
            System.out.println("\nQual PC de qual promoção deseja comprar?\nCaso não queira comprar nada digite 0.");
            opcao = entrada.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Compra finalizada. \n");
                    break;
                case 1:
                    promo1++;
                    computadores[0].mostraPCConfigs();
                    break;
                case 2:
                    promo2++;
                    computadores[1].mostraPCConfigs();
                    break;
                case 3:
                    promo3++;
                    computadores[2].mostraPCConfigs();
                    break;
                    default:
                        System.out.println("Opção não encontrada!");
                        break;

            }

            if(opcao==1 || opcao==2 || opcao==3)
            {
            System.out.println("Promoção " + opcao + " no carrinho... Boas compras!\n");
            }
        }while (opcao != 0);

        computadores[0].quantidade = promo1;
        computadores[1].quantidade = promo2;
        computadores[2].quantidade = promo3;

        cliente.computadores[0] = computadores[0];
        cliente.computadores[1] = computadores[1];
        cliente.computadores[2] = computadores[2];

        System.out.println("Caro(a) " + nomeCliente + " suas compras ficaram em um total de R$" + cliente.calculaTotalCompra());
        System.out.println("Obrigada pelas compras, volte sempre!");

        entrada.close();
    }
}