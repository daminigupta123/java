 interface client {
    void print();
    void show();
}
class Dev implements client {
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
