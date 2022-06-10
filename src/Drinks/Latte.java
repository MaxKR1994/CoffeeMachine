package Drinks;

public class Latte extends Drinks {
    private static final double price = 1.5;

    public static double price(){
        return price;
    }

    public Latte(){
        System.out.println("Your ordered a LATTE ");
        System.out.println("LATTE Fun Facts:");
        System.out.println("The term as used in English is a shortened form of the Italian caffè e latte, caffelatte or caffellatte, which means “milk coffee.”");
    }


}
