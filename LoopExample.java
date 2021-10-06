import java.util.Scanner;

public class LoopExample
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("playing the song");
            System.out.println("would you like to take this song off this repeat, if so, answer yes");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
    System.out.println("playing next song");


    }
}
