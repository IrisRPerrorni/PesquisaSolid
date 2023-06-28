package InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        AvesQueVoam papagaio = new Papagaio();
        Aves pinguim = new Pinguim();

        // chamando metodo do papagaio
        papagaio.setLocalizacao(1.25f , 1.58f);
        papagaio.setAltitude(25);
        papagaio.atividade();

        // chamando metodo do pinguim
        pinguim.setLocalizacao(1.28f , 1.58f);
        pinguim.atividade();
    }
}
