package pattern.state;

public class PlataEfectuata implements Stare{
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda cu numarul "+comandaMancare.getNrComanda()+" este trecuta in starea PlataEfectuata");
        comandaMancare.setState(this);
    }
}
