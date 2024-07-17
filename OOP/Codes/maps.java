package OOP;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class maps {

    public static void main(String a [])
    {
        //map does not implement collection api 
        //map is an interface
        //key value pair

        Map<String,Integer> mp=new HashMap<String,Integer>();

        mp.put("Manahil ", 1);
        mp.put("Jawed ", 2);

        for(String m:mp.keySet())
        {
            System.out.println("Value are : " + mp.get(m));
        }

        //hashtable is synchronized

        Map<String,Integer> mpp=new Hashtable<String,Integer>();

        mpp.put("Manahil ", 1);
        mpp.put("Jawed ", 2);

        for(String m:mpp.keySet())
        {
            System.out.println("Value are : " + mpp.get(m));
        }
    }
    
}
