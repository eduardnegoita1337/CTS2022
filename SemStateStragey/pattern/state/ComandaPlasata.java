package pattern.state;

public class ComandaPlasata implements Stare {

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda cu numarul "+comandaMancare.getNrComanda()+" este trecuta in starea ComandaPlasata");
        comandaMancare.setState(this);
    }
}
