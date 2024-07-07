public class Type_Conversion_Type_Casting_In_Java {

    public static void main (String a[])
    {
        //When implicit conversion is done it is known as conversion
        //When explicit conversion is done it is called casting

        int first =8;

        short second =(short)first; //casting

        System.out.println("Value of second is:"+second);

        short third=9;

        int fourth=third;//conversion

        System.out.println("Value of fourth is:"+fourth);

        String fifth="true";

        // boolean sixth=(boolean)fifth;//String to boolean conversion is not possible

        boolean sixth=true;

        // fifth=(String)sixth;//boolean to String conversion is also not possible
    //    int sixth1=(int)sixth;boolean to integer or boolean to integer conversion is also not possible

       int seventh=257;
       byte eight=(byte)seventh;//Modulo operator is used for this conversion


       System.out.println("Value of byte is:"+eight);



    }
    
}
