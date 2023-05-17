package May13WeekendSnacks;

public class CollectNumberReturnArray {
    public static int [] collectIntReturnArray(int number){
        String string = "";
        int converted = 0;
        int reminder = 0;
        int [] arrays = new int [string.length()];
        while (number != 0){
            reminder = number % 10;
            string += reminder;
            number = number / 10;
        }
        int[] array = {1,3,4,5};

       return array;
    }
}
