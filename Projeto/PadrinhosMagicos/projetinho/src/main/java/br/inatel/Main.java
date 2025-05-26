package br.inatel;

import br.inatel.Model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada_nomeJogador = new Scanner(System.in); // nome do usuário
        Scanner entrada_jogadorSexo = new Scanner(System.in); // sexo do usuário

        // Definindo nome e sexo do jogador
        System.out.print("Insira seu nome: ");
        String nomeJogador = entrada_nomeJogador.nextLine(); // Scanner -> String
        System.out.print("Insira seu sexo (F, M, NB): ");
        String sexoJogador = entrada_jogadorSexo.nextLine(); // Scanner -> String

        // Criação do Jogador "Criança"
        Crianca jogador = new Crianca(1, nomeJogador, 12, sexoJogador,
                                     true, "Rua dos Desejos, nº72"); // criando jogador
        // Criação dos Padrinhos
        Padrinhos nossoPadrinho = new Padrinhos(1, "Grimbolino, o Estagiário da Magia", "Padrinho", 1, 1);
        Padrinhos nossaMadrinha = new Padrinhos(2, "Celestina Cintilante, a Matriarca da Magia", "Madrinha", 2, 1);

        // Criação das Varinhas
        Varinha varinha1 = new Varinha(1, "Azul", "Funcionando");
        Varinha varinha2 = new Varinha(2, "Roxo", "Funcionando");

        // Criação dos Anti-Fada
        Padrinhos antiPadrinho = new AntiFada(3, "Grimbolona", "Anti-Fada", 3,0);
        Padrinhos antiMadrinha = new AntiFada(4, "Celestina Obscura", "Anti-Fada", 4,0);

        // Criação do General Fada
        GeneralFada general = new GeneralFada(5, "Jorgen Von, o Estranho", "General Fada", 5, 0);

        // Boas-vindas!!
        System.out.println("Olá, " + nomeJogador + "! Parabéns por ganhar seus Padrinhos Mágicos! \n" +
                "Você tem 12 anos e mora em Dimmsdale, no endereço " + jogador.getEnderecoCrianca() + ".\n");
    }
}