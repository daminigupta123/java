public class strreverse {
  public static void main(String[] args) {
    
    String str="aaaabbbcc";
    StringBuilder newstr=new StringBuilder();
        int count=1;
    for(int i=1;i<str.length();i++)
    {
        if(str.charAt(i)==str.charAt(i-1)){
            count++;
        }
        else 
        newstr.append(str.charAt(i-1)).append(count);
        count=1;
    }
    for(int j=1;j<str.length();j++){
    System.out.println(newstr);
    }
  }  

}
