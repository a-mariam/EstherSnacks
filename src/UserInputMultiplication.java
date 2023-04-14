import java.util.Scanner;
public class UserInputMultiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Number");
        int userInput = input.nextInt();

        for(int counter = 1;counter <= 12;counter++){
            int multiple = userInput * counter;

            System.out.println(multiple);

        }




    }
}
