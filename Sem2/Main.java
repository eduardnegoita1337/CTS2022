package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Mouse", 250, "Mouse");
        Product p2 = new Product(2, "Keyboard", 500, "Keyboard");

        Product p3 = new Product(p1);

        
        p3.applyPercentageDiscount(15);
	  System.out.println(p3.price);
    }
}