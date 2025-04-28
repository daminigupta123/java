public class repeatstring {
      public static void main(String[] args) {
        String str="damini";
        char[] ch =str.toCharArray(); 
        //String  str =new String("hello");
       // String str1=new String("hello");
       // System.out.println(str==str1);
       /* String newstr="";
        for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(newstr.indexOf(c)==-1){
            newstr=newstr+c;
        }h
        }*/
        for(int j=0;j<ch.length;j++)
for(int k=j+1;k<ch.length;k++)
{
    if(ch[j]==ch[k])
    {
        System.out.println(ch[j]);
        return ;
    }
}
    
   // System.out.println(newstr+"  ");
    }
}
