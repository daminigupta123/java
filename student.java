class info{
    String firstname="DAMINI";
    String lastname="GUPTA";
    void  fullname()
    {
        System.out.println(firstname+ "   "    +lastname);
    }
}


public class student {
    public static void main(String[] args) {
        info obj=new info();
       obj.fullname();
    }
}
