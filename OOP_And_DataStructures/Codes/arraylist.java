package OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arraylist {


    public static void main(String[] a)
    {
        //collection api-INterfaces and Classes
        //Collection-List,Queue,Set
        //Collections-Classes

        Collection<Integer> cr=new ArrayList<Integer>();

        cr.add(8);
        cr.add(88);


        for(int n:cr)
        {

            System.out.println(n);
        }

        List<Integer> crr=new ArrayList<Integer>();

        crr.add(8);
        crr.add(88);


        System.out.println("Value is:"+crr.get(0));

        
    }
    
}
