import java.util.Scanner;

public class FunctionExample
{
    public static void announceDeveloperTeatime()
    {
        System.out.println("waiting for the developer tea time....");
        System.out.println("type a random word and press enter to start the developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's a developer tea time...");
    }
    public static void main(String[] args)
    {
        announceDeveloperTeatime();
        System.out.println("welcome to the job...");
        System.out.println("review the code");
        announceDeveloperTeatime();
        System.out.println("get promoted");
    }
}
