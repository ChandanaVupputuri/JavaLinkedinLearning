import java.util.Scanner;

public class MultipleChoice
{
    public static void main (String[] args)
    {
        String question = "capital of india?";
        String ChoiceOne = "Andhra Pradesh";
        String ChoiceTwo = "Tamil Nadu";
        String ChoiceThree = "Delhi";

        String CorrectAnswer = ChoiceThree;

        System.out.println(question);
        System.out.println("choose the following correct answer \n" + ChoiceOne + "," + ChoiceTwo + "," + ChoiceThree);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (CorrectAnswer.equals(input))
        {
            System.out.println("congrats your answer is correct!");
        }
        else
        {
            System.out.println("wrong answer, the correct answer is: " + CorrectAnswer);
        }



    }
}
