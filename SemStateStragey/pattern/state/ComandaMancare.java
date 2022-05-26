package pattern.state;

public class ComandaMancare {

    private int nrComanda;
    private Stare state;

    public int getNrComanda() {
        return nrComanda;
    }

    public void setId(int nrComanda) {
        this.nrComanda = nrComanda;
    }


    public ComandaMancare(int nrComanda){
        state=null;
        this.nrComanda=nrComanda;
    }

    public Stare getState() {
        return state;
    }

    public void setState(Stare state) {
        this.state = state;
    }

}
