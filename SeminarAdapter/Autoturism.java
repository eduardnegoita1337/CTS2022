package adapter;

public class Autoturism implements Masina {
    @Override
    public void ruleazaCuVitezaMare(int viteza) {
        System.out.print(viteza + "km/h");

    }

    @Override
    public void claxoneaza(String sunet) {
        System.out.print(sunet + "sunet strident");


    }

}
