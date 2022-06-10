package Drinks;

public class Cappuccino extends Drinks{
    private static final double price = 1.4;

    public static double price(){
        return price;
    }

    public Cappuccino(){
        System.out.println("Your ordered a CAPPUCCINO ");
        System.out.println("CAPPUCCINO Fun Fact: ");
        System.out.println("Capuccino was invented in Italy. It was first patented by a man named Luigi Bezzera in 1901. It is a derived from the Italian word “cappuccio,” which means “hood.” November 8th is National Cappuccino Day.");
    }

}
