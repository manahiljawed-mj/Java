package OOP;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class sets {
    public static void main(String[] a)
    {
        Collection<Integer> st=new HashSet<Integer>();

        //cannot have duplicate values 


        st.add(8);
        st.add(88);
        st.add(77);
        st.add(9);
        st.add(98);
        st.add(7);
        //does not follow sequence and sort values
        for(int num:st){
        System.out.println("values are: "+num);

        }



        Collection<Integer> stt=new TreeSet<Integer>();

        //cannot have duplicate values 


        stt.add(8);
        stt.add(88);
        stt.add(77);
        stt.add(9);
        stt.add(98);
        stt.add(7);
        //does sort values
        for(int num:stt){
        System.out.println("Sorted values are: "+num);

        }


    }
    
}
