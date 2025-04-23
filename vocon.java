public class vocon {
    public static void main(String[] args) {
        String str="harshita";
       int  count=0;
       int con=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
        count++;       }
        else
        con++;
        
        System.out.println(count);
        System.out.println(con);
    }

}
