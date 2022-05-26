package ro.ase.cts.lab02;


class InventoryP
{
    private Product prod;
    private int nr;

    public InventoryP(Product prod, int nr)
    {
        this.prod = new Product(prod);
        this.nr = nr;
    }
    public Product getProd() {
        return prod;
    }

    public void setProd(Product p) {
        this.prod = p;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}


