package Masina;

public class BuilderAutoturismElectric implements BuilderMasina {
    private Masina auto;

    public BuilderAutoturismElectric(){
        auto = new AutoturismElectric();
    }


    @Override
    public void buildSasiu() {

    }

    @Override
    public void buildRoti() {

    }

    @Override
    public void buildMotor() {

    }

    @Override
    public void buildInterior() {

    }

    public void buildIncarcator(){}

    @Override
    public Masina getMasina() {
        return auto;
    }
}
