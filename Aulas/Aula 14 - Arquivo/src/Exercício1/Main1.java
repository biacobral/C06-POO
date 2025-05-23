package Exercício1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

       Path arquivo = Paths.get("professores_disciplina.txt");

       try {
           List<String> conteudo = Files.readAllLines(arquivo);
           Map<String, String> professores_disciplinas = new HashMap<>();

           conteudo.forEach((linha) -> {
               String[] linhaQuebrada = linha.split("=");
               professores_disciplinas.put(linhaQuebrada[0], linhaQuebrada[1].strip());
           });
           professores_disciplinas.forEach((professor, disciplina) -> {
               System.out.print("Professor: " + professor + " | ");
               System.out.println("Disciplina: " + disciplina);
           });

       }  catch (IOException e){
           e.printStackTrace();
       }
    }
}