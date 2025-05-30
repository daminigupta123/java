
import java.util.ArrayList;
import java.util.Iterator;
public class listi {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("damini");
        list.add("harshita");
        list.add("vanshika");
        list.add("astha");
        System.out.println(list);;
        Iterator<String>it=list.iterator();
        while(it.hasNext()){
            String data=it.next();
            if(data.startsWith("damini")){
                it.remove();
            } else {
                System.out.println(data);
            }
            }
        }
            
        

    }

