import java.util.Scanner;

public class Concat
{
    public static void main(String[] args)
    {
        double studentGPA = 5.64;
        String FirstName = "chandana";
        String LastName = "majety";
        System.out.println(FirstName + " " + LastName + " has GPA of " + studentGPA);
        System.out.println("what do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(FirstName + " " + LastName + " now the GPA has updated to " + studentGPA);
    }
}
