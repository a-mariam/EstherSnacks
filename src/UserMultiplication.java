import java.util.Scanner;
public class UserMultiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive Number");
        int number = input.nextInt();

        int multiplication = 0;
        for(int count = 1;count <= 12;count ++){
            multiplication = count * number;


               System.out.println(multiplication);

        }



    }
}
