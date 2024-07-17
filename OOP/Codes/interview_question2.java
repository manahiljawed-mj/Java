package OOP;

public class interview_question2 {
     public static void main(String[] a)
     {
    String dd="abc";
        int i=0;
        int j=0;
        try {
        while(dd.charAt(i)!='\0')
        {
            j++;
            i++;
        }
       }
       catch(IndexOutOfBoundsException e)
       {   
        System.out.println("count is: "+j);

       }
    }
    
}
