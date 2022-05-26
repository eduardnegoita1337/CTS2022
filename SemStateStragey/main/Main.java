package main;

import pattern.state.ComandaMancare;
import pattern.state.ComandaPlasata;
import pattern.state.PlataEfectuata;


public class Main {

    public static void main(String[] args) {
        ComandaMancare comandaMancare=new ComandaMancare(1000);

        ComandaPlasata comandaPlasata=new ComandaPlasata();
        comandaPlasata.updateState(comandaMancare);

        PlataEfectuata plataEfectuata=new PlataEfectuata();
        comandaPlasata.updateState(comandaMancare);

    }

}