import java.sql.SQLOutput;
import java.util.Scanner;
public class SUMOFUSERINPUT {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int sum =0;
        for(int count =1; count <= 10;){
            System.out.println("Enter a number");
            int number = user.nextInt();
            sum = sum + number;
            count++;
        }

        System.out.println("sum = " + sum);
    }
}
