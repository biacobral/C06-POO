public class Main {
    public static void main(String[] args) {
        Piloto piloto = new Piloto();
        Kart kart = new Kart();

        kart.nome = "Verdinha";
        kart.motor.cilindradas = "100";

        kart.piloto = piloto;

        piloto.nome = "Luigi";
        piloto.vilao = false;


        piloto.mostraInfo();
        piloto.soltaSuperPoder();

        kart.pular();
        kart.fazerDrift();
        kart.soltarTurbo();

        kart.motor.mostraInfo();





    }
}