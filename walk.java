interface walkable {
 void walk();
 void  run();
  
}
interface ruunable {
   void  walk();
     void run();  
}
class showmethod implements walkable,ruunable{
    public void walk()
    {
        System.out.println("walk interface A");
    }
    public void run ()
    {
        System.out.println("run interface b");
    }
}
public class walk {
    public static void main(String[] args) {
       showmethod obj =new showmethod();
       obj.run();
       obj.walk(); 
    }
    
}
