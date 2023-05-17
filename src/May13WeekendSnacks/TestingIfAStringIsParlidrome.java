package May13WeekendSnacks;

public class TestingIfAStringIsParlidrome {
    public static void IsStringParlidrome(String input) {
        String reversed = "";
        int stringLength = input.length();
        for (int count = stringLength - 1; count >= 0; count--) {
            reversed += input.charAt(count);

        }
            System.out.println(reversed);
        System.out.println(input);
        if (reversed.equals(input)){
            System.out.println("It's a parlidrome");
        }else{
            System.out.println("It's not a parlidrome");
        }

    }

    public static void main(String[] args) {
        String test = "mam";
        IsStringParlidrome(test);

    }

}