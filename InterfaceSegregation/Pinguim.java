package InterfaceSegregation;

public class Pinguim implements Aves {

    @Override
    public void setLocalizacao(float longitude, float latitude) {
        System.out.println(" O pinguim fica na longitude: " + longitude + " e latitude: " + latitude);
    }

    @Override
    public void atividade() {
        System.out.println("O pinguim está andando no gelo");

    }
}
