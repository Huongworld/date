import java.util.Scanner;

public class Statement {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("User enter an input:");
        int b = a.nextInt();
        if (b > 10) {
            System.out.println( b + " is greater than 10.");
        }
        else if (b< 10)
        {
            System.out.println( b + " is less than 10.");
        }
        else if (b == 10)
        {
            System.out.println( b + " is equal to 10");
        }
            System.out.println("Application finished.");

    }
    //Edit the application to prompt an integer user input, and state if the number entered is greater than 10, less than 10, or is equal to 10.
}
