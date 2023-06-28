package Inversion;

public class Main {
    public static void main(String[] args) {
        LigarCarro diesel = new Diesel();
        LigarCarro gasolina = new Gasolina();

        Carro veiculoDiesel = new Carro(diesel);
        veiculoDiesel.start();

        Carro veiculoGasolina = new Carro(gasolina);
        veiculoGasolina.start();
    }
}
