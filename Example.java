import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        System.out.println("pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int inputtednum = scanner.nextInt();
        if(inputtednum < 5)
        {
            System.out.println("enjoy your day!");
        }
        else
        {
            System.out.println("you are very happy today!");
        }

    }

}
