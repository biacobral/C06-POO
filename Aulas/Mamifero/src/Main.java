public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Lili", 11);
        Lontra lontra = new Lontra("Maria", 22);
        Boi boi = new Boi("Da Cara Preta", 100);

        cachorro.emitirSom();
        cachorro.mostraInfo();

        lontra.emitirSom();
        lontra.nadar();
        lontra.mostraInfo();

        boi.emitirSom();
        boi.mostraInfo();
    }
}