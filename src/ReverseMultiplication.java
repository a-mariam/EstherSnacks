import java.sql.SQLOutput;

public class ReverseMultiplication {
    public static void main(String[] args) {
         System.out.println("Reversed Multiplication");
        for (int number = 1; number <= 12; number++) {
            for (int count = 12; count >= 1; count--) {
                int multiplication  = count * number;
                System.out.printf("%d\t" , multiplication  );
            }
            System.out.println(" \t");
        }
    }
}
