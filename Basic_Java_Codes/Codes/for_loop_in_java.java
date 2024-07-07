public class for_loop_in_java {

    public static void main(String[] args) {
        int i = 1;

        // Outer loop for rows
       for(i=0;i<5;i++)
       {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
       }
    
}
}
