public class OnlineShop {

                                                                

    private static OnlineShop instance;
    private String info = "info";

    private OnlineShop(){



    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static OnlineShop getInstance(){

        if(OnlineShop.instance != null){

            return OnlineShop.instance;
        }
        else{

            OnlineShop.instance = new OnlineShop();

            return OnlineShop.instance;
        }

    }














}
