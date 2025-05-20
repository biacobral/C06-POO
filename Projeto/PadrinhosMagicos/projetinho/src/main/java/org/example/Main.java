package org.example;

import br.inatel.Model.Crianca;
import br.inatel.Model.Padrinhos;
import br.inatel.Model.Varinha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada_nomeJogador = new Scanner(System.in); // nome do usuário
        Scanner entrada_jogadorSexo = new Scanner(System.in); // sexo do usuário

        String nomeJogador = entrada_nomeJogador.nextLine(); // Scanner -> String
        String sexoJogador = entrada_jogadorSexo.nextLine(); // Scanner -> String

        Crianca jogador = new Crianca(1, nomeJogador, 12, sexoJogador,
                                     true, "Rua dos Desejos, nº72"); // criando jogador

        Padrinhos nossoPadrinho = new Padrinhos(1, "Grimbolino, o Estagiário da Magia", "Padrinho", 1, 1);
        Padrinhos nossaMadrinha = new Padrinhos(2, "Celestina Cintilante, a Matriarca da Magia", "Madrinha", 2, 1);

        Varinha varinha1 = new Varinha(1, "Azul", "Funcionando");
        Varinha varinha2 = new Varinha(2, "Roxo", "Funcionando");
        
    }
}