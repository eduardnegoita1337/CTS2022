package pattern.strategy;

public class Algoritm implements ModCriptare {

    @Override
    public void cripteza(String numeAlgoritm) {
        System.out.println(numeAlgoritm + " a fost folosit pentru a cripta acest mesaj ");
    }

}