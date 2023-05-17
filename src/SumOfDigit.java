import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit");
        int ints = input.nextInt();
        System.out.println(sumOfFourDigit(ints));
    }
    public static int sumOfFourDigit(int number){
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;

        int sumOfDigit = 1;
        int collect = 0;
        for(int count = 1; count < 5;count++){
            collect = number % 10;
            if(count == 1){
                fourthNumber = collect;}
            if(count == 2){thirdNumber = collect;}
            if(count == 3){secondNumber = collect;}
            if(count == 4){firstNumber = collect;}

            number =  number / 10;
        }

        sumOfDigit = firstNumber + thirdNumber + secondNumber + fourthNumber;
        return sumOfDigit;
    }
}
