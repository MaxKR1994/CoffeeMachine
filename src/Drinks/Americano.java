package Drinks;

public class Americano extends Drinks {
    private static final double price = 1.2;

    public static double price(){
        return price;
    }

    public Americano(){
        System.out.println("Your ordered a AMERICANO ");
        System.out.println("AMERICANO Fun Fact: ");
        System.out.println("The story goes that during World War II, American soldiers stationed in Italy weren’t too fond of the robust Italian espresso found in the coffee shops. So, to transform it into something similar to the American-style drip coffee they drank back home, they would pour hot water into the espresso to dilute it.");
    }
}
