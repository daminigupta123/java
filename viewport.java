import java.util.HashMap;

public class viewport {

    public static void main(String[] args) {
        String str ="my name is damini gupta and i am student of baderia global institute of enginnering college  ";
        char[] ch=str.toCharArray();
        HashMap<String ,Integer> map=new HashMap<>();
        String[] newstr=str.split(" ");
       
       for(String i:newstr){
        map.put(i,  map.getOrDefault(i,0)+1);
       }
       System.out.println(map);
   
      
             
    }
}
