public class repeatstring {
  
    public static void main(String[] args) {
        String str2="damini";
        String  str =new String("hello");
        String str1=new String("hello");
        System.out.println(str==str1);
        String newstr="";
        for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(newstr.indexOf(c)==-1){
            newstr=newstr+c;
        }
    

    }
    System.out.println(newstr+"  ");
    }
}

