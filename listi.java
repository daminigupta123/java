
import java.util.ArrayList;

import java.util.ListIterator;
public class listi {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Damini");
        list.add("Harshita");
        list.add("Vanshika");
        list.add("Astha");
        list.add("Ram");
        System.out.println(list);;
        ListIterator<String>it=list.listIterator();
        while(it.hasNext()){
            String data=it.next();
            if(data.equals("Damini")){
           // if(data.length()<3){
            System.out.println(data);
            }
        else
        {  System.out.println("hello");}
    
            //while(it.hasPrevious()){
              //  String predata=it.previous();
              //  System.out.println(predata);
                
                
                    }
                }
            }
                
            
        
            
        

    


