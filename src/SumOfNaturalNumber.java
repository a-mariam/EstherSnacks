import java.util.Scanner;
public class SumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  number");
        int userInput = input.nextInt();

        int sum = 0;
        int count = 1;

        while (count <= userInput){
            sum += userInput % 10;
            userInput= userInput / 10;
        }
        System.out.println("sum = " + sum);

    }
}
