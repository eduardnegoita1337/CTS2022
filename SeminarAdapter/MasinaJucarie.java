package adapter;

public class MasinaJucarie implements JucarieMobila{


    @Override
    public void seDeplaseaza(int viteza) {
        System.out.print(viteza + "km/h");

    }

    @Override
    public void emiteSunete( String melodie) {
        System.out.print(melodie + "melodie");

    }
}
