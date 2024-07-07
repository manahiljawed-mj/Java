class Type_Promotion_In_Java{
    public static void main(String a[])
    {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int result = b + c + s;  // b, c, and s are promoted to int before the addition

        /*Type promotion in Java refers to the automatic conversion of a smaller data type to a larger data type during an operation. 
        This helps to prevent data loss and ensures compatibility in arithmetic operations.
         Java promotes smaller types to larger types to accommodate the result of an operation involving different data types. */

        System.out.println("Value of result is"+result);

        System.out.println("Type: " + ((Object) result).getName());


    }
}