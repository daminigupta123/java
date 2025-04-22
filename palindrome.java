public class palindrome {
   public static void main(String[] args) {
    String str1="racecar";
    for(int i=0;i<str1.length();i++){
   for(int j=str1.length()-1;j>=0;j--)
   {
    if(str1.charAt(i)==str1.charAt(j))
        System.out.println("palindrome");
    else
        System.out.println("not palindrome");
   
}}
System.out.println(str1);
}
}

