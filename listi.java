
import java.util.ArrayList;

import java.util.ListIterator;
public class listi {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("damini");
        list.add("harshita");
        list.add("vanshika");
        list.add("astha");
        list.add("ram");
        System.out.println(list);;
        ListIterator<String>it=list.listIterator();
        while(it.hasNext()){
            String data=it.next();
            if(data.equals("damini")){
           // if(data.length()<3){
            System.out.println(data);
            }
        else
        {  System.out.println("hello");}
    
            //while(it.hasPrevious()){
              //  String predata=it.previous();
              //  System.out.println(predata);
                
                
                    }}}
                
            
        
            
        

    


