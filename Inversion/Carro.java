package Inversion;

public class Carro {
    private LigarCarro ligarCarro;

    public Carro(LigarCarro ligarCarro) {
        this.ligarCarro = ligarCarro;
    }
    public void start(){
        ligarCarro.start();
    }
}
