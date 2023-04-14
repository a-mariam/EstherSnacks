import java.util.Scanner;
public class FactorialOfNumber {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.println("Please Enter a Number");
        int number = userInput.nextInt();

        int factorial = 0;

        for (int count=1;count <= number;) {
            factorial = number * count;

             number++;
          System.out.println("factorial is " + factorial);
        }


    }
}