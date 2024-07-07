public class do_while_loop_in_java {


    public static void main(String[] args) {
        int i = 1;

        // Outer loop for rows
        do{
            int j = 1;
            // Inner loop for columns
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }while (i <= 5) ;
    }
    
}
