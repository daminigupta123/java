public class repeatstring {
  
    public static void main(String[] args) {
        String str="damini";
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

