package Masina;

public class BuilderAutoturismClasic implements BuilderMasina{
    private Masina auto;

    public BuilderAutoturismClasic(){
        auto = new AutoturismClasic();
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

    public void buildAditivi(){

    }

    @Override
    public Masina getMasina() {
        return auto;
    }
}
