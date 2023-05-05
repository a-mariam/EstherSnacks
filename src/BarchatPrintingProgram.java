import java.util.Scanner;

public class BarchatPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;

        for (int inputs = 1; inputs < 6; ) {
            System.out.println("Enter a number between 1 and 30: ");
            int collect = input.nextInt();

            if (collect > 0 && collect < 31) {

                if (inputs == 1) {firstNumber = collect;}
                if (inputs == 2){secondNumber = collect;}
                if (inputs == 3){thirdNumber = collect;}
                if (inputs == 4){fourthNumber = collect;}
                if (inputs == 5){fifthNumber = collect;}

                inputs++;
            }
        }
        for(int inputz = 1; inputz <= firstNumber;){
            System.out.print("*");
            inputz++;
        }
        System.out.println("");
        for(int inputz = 1; inputz <= secondNumber;){
            System.out.print("*");
            inputz++;
        }
        System.out.println();
        for(int inputz = 1; inputz <= thirdNumber;){
            System.out.print("*");
            inputz++;
        }
        System.out.println();
        for(int inputz = 1; inputz <= fourthNumber;){
            System.out.print("*");
            inputz++;
        }
        System.out.println();
        for(int inputz = 1; inputz <= fifthNumber;){
            System.out.print("*");
            inputz++;
        }
    }
}