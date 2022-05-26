public class Main {

    public static void main(String[] args){

        OnlineShop o1 = OnlineShop.getInstance();
        OnlineShop o2 = OnlineShop.getInstance();
        o1.setInfo("info2");
        System.out.println(o2.getInfo());
        System.out.println(o1.getInfo());
	}
}


























    }


}
