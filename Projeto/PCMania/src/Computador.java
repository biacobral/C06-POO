public class Computador {

    String marca;
    float preco;

    int quantidade;

    MemoriaUSB musb;
    SistemaOperacional sistema;
    HardwareBasico hardware_processador, hardware_RAM, hardware_HD;


    Computador(String marca, float preco, HardwareBasico hardware_processador, HardwareBasico hardware_RAM, HardwareBasico hardware_HD, SistemaOperacional sistema) {
        this.marca = marca;
        this.preco = preco;
        this.hardware_processador = hardware_processador;
        this.hardware_RAM = hardware_RAM;
        this.hardware_HD = hardware_HD;
        this.sistema = sistema;
    }


    void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println(hardware_processador.getNome() + " " + hardware_processador.getCapacidade() + "Mhz");
        System.out.println(hardware_RAM.getNome() + " " + hardware_RAM.getCapacidade() + "Gb");
        if(hardware_HD.getCapacidade()<3) System.out.println(hardware_HD.getNome() + " " + hardware_HD.getCapacidade() + "Tb");
        else System.out.println(hardware_HD.getNome() + " " + hardware_HD.getCapacidade() + "Gb");
    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }

    public float getPreco() {
        return preco;
    }

    public MemoriaUSB getMusb() {
        return musb;
    }

    public SistemaOperacional getSistema() {
        return sistema;
    }

    public HardwareBasico getHardware_processador() {
        return hardware_processador;
    }

    public HardwareBasico getHardware_RAM() {
        return hardware_RAM;
    }

    public HardwareBasico getHardware_HD() {
        return hardware_HD;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setMusb(MemoriaUSB musb) {
        this.musb = musb;
    }

    public void setSistema(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    public void setHardware_processador(HardwareBasico hardware_processador) {
        this.hardware_processador = hardware_processador;
    }

    public void setHardware_RAM(HardwareBasico hardware_RAM) {
        this.hardware_RAM = hardware_RAM;
    }

    public void setHardware_HD(HardwareBasico hardware_HD) {
        this.hardware_HD = hardware_HD;
    }
}
