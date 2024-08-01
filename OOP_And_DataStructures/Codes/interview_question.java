package OOP;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

class Person{
    String id;
    String name;
}
public class interview_question {

    public static void main(String[] a)
    {
        Person p=new Person();
        p.id="1";
        p.name="Manahil";


        Person p1=new Person();
        p1.id="2";
        p1.name="anahil";

        Person p2=new Person();
        p2.id="3";
        p2.name="ahil";

        List<Object> ls=new ArrayList<Object>();
        ls.add(p);

        ls.add(p1);

        ls.add(p2);

        List<String> ll=new ArrayList<String>();

        for(Object br:ls)
        {
            Person pp=(Person)br;
            String name=pp.name;
            if(pp.name.charAt(0)=='A' || pp.name.charAt(0)=='a')
            {
                ll.add(pp.name);
            }
        }
        for(String tt:ll)
        {
        System.out.println(tt);
        }


    }
    
}
