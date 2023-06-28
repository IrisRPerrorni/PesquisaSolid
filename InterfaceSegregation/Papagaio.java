package InterfaceSegregation;

public class Papagaio implements AvesQueVoam {

    @Override
    public void setLocalizacao(float longitude, float latitude) {
        System.out.println("O papagaio está localizado na longitude: " + longitude + " e latitude: " + latitude);
    }

    @Override
    public void atividade() {
        System.out.println("O papagaio está voando");

    }

    @Override
    public void setAltitude(float altitude) {
        System.out.println("O papagaio consegue voar até altura: " + altitude);

    }
}
