import java.util.Scanner;  // Import the Scanner class

public class UserInput {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Insert your name: ");

        String myName = userInput.nextLine();

        System.out.println("How are you, " + myName + "?");

        userInput.close();  // It's good practice to close the Scanner when you're done using it
    }
}

