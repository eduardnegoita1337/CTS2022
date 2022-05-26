package ro.ase.cts.lab02;


import java.util.ArrayList;

class Order
{
    private ArrayList<Product> productList;
    private String addr;

    public Order()
    {
        this.productList = new ArrayList<Product>();
    }
    public void AddProduct(Product p)
    {
        
        productList.add(p);
    }

    public void RemoveProduct(Product p)
    {
        productList.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
