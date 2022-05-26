package ro.ase.cts.lab02;

import java.util.ArrayList;

class Shop {
    private String Name;
    private String image;
    private ArrayList<Product> products;

    Shop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = img;
        this.Name = name;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getImage() {
        return image;
    }

    public void setImg(String img) {
        this.image = img;
    }
}
