package pattern.strategy;

public class MotorCriptare {

    private ModCriptare modCriptare;



    public ModCriptare modCriptare() {
        return modCriptare;
    }
    public void setModCriptare(ModCriptare modCriptare) {
        this.modCriptare = modCriptare;
    }
    public ModCriptare getModCriptare() {
        return modCriptare;
    }

    public MotorCriptare(ModCriptare modCriptare) {
        super();
        this.modCriptare = modCriptare;
    }




}
