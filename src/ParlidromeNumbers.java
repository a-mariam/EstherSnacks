import javax.swing.*;

public class ParlidromeNumbers {
    public static void main(String[] args) {
        System.out.println(isParlidrome(1221));
        isParlidrome(1226);
    }

    public static int isParlidrome(int number) {

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;

        int reminder;
        int parlidrome = 0;
        for(int count= 0; count  < 4;count++) {
            reminder = number % 10;

            if (count == 0) {fourthNumber = reminder;}
            if (count == 1){thirdNumber = reminder;}
            if(count == 2){secondNumber = reminder;}
            if(count == 3){firstNumber = reminder;}
            number = number / 10;

            }

        if(fourthNumber == firstNumber && thirdNumber == secondNumber){
            System.out.println("it is a parlidrome: ");
        }else {
            System.out.println("it's not a parlidrome");
        }

        return number;
        }


}

