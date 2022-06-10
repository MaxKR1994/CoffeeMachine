package Drinks;

public class Tea extends Drinks {
    private static final double price = 0.9;

    public static double price(){
        return price;
    }

    public Tea(){
        System.out.println("Your ordered a TEA ");
        System.out.println("TEA Fun Facts:");
        System.out.println("It takes around 2,000 tiny leaves to make just one pound of finished tea.");
    }

}
