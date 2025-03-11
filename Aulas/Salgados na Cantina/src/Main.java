public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();

        cantina.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        s1.nome = "Coxinha";
        s2.nome = "Cigarrete";
        s3.nome = "Pastel";

        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);

        System.out.println("A " + cantina.nome + " tem: ");
        cantina.mostraInfo();




    }
}