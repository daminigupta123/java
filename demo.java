 interface A {
void display();  
}
 interface b {
    void display();
    
}
class demoA implements  A, b{

public void display()
{
    System.out.println("it is demo class");
}

}
public class demo {
    public static void main(String[] args) {
        demoA obj=new demoA();
        obj.display();
    } 
    
}
