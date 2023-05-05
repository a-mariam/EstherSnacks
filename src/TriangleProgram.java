public class TriangleProgram {
    public static void main(String[] args) {

        for (int number = 0; number <= 10; number++) {
            for (int count = 1; count <= number; count++) {
                System.out.print(" * ");
            }

            System.out.println("");
        }
            for (int numbers = 0; numbers <= 10; numbers++) {
                for (int count = 10; count >= numbers; count--) {


                    System.out.print("*");
                }
                System.out.println("");
            }

        // for (int numbere = 1; numbere <= 10; numbere++) {
        //    for (int count = 1; count <= 10; count++) {
        //  for(int counter = 10; counter >= count; counter--){
        //      System.out.print("*");
        // }

        // System.out.print(" ");
        // }
        ///  System.out.println("");
    }

}
