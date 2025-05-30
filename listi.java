
import java.util.ArrayList;

import java.util.ListIterator;
public class listi {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("damini");
        list.add("harshita");
        list.add("vanshika");
        list.add("astha");
        System.out.println(list);;
        ListIterator<String>it=list.listIterator();
        while(it.hasNext()){
            String data=it.next();
            if(data.startsWith("A")){
                it.remove();
            } else {
                System.out.println(data);
            }}
            while(it.hasPrevious()){
                String predata=it.previous();
                System.out.println(predata);
            
            }
        }
            
        

    }


