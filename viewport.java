import java.util.HashMap;

public class viewport {

    public static void main(String[] args) {
        String str ="programing is fun and fun is programing ";
        char[] ch=str.toCharArray();
        HashMap<String ,Integer> map=new HashMap<>();
        String[] newstr=str.split(" ");
       
       for(String i:newstr){
        map.put(i,  map.getOrDefault(i,0)+1);
       }
       System.out.println(map);
   
      
             
    }
}
