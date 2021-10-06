public class CalculatedMealExample
{
    public static void CalculatedMealPrice(double listedmealprice, double tiprate,double taxrate)
    {
        double tip = tiprate * listedmealprice;
        double tax = taxrate * listedmealprice;
        double price = listedmealprice + tiprate + taxrate;
        System.out.println("your meal price is: " + price);

    }
    public static void main(String[] args)
    {
        CalculatedMealPrice(15,.2,.08);
    }
}
