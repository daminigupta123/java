 interface client1 {
    void print();
    void show();
}
 interface client2{
void print(); 
  
}
class Dev implements client1,client2  {
    public void print(){
        System.out.println("hii");
    }
    public void show(){
        System.out.println("damini");
    }
}
public class innrr {
    public static void main(String[] args) {
        Dev obj =new Dev();
        obj.show();
        obj.print();
    
    } 
}
