public class sumarray {
  public static void main(String[] args) {
    int[] arr1={1,2,3,4,5};
    int[] arr2={1,2,3,4,5};
    boolean isEqual=java.util.Arrays.equals(arr1, arr2);
    if(isEqual){
     System.out.println( "arrays are equal");

    }
    else
    {System.out.println("array not equal");
}
    /* int[] sum=new int[arr1.length];
    for(int i=0;i<arr1.length;i++)
    {sum[i]=arr1[i]+arr2[i];*/
    
  /* int sum1=0;
    int sum2=0;
    for(int i=0;i<arr1.length;i++)
    {
     sum1+=arr1[i];
    }
    for(int j=0;j<arr2.length;j++)
    {
        sum2+=arr2[j];
    }
    int sum=sum1+sum2;
    System.out.println(sum);*/
   /* System.out.println("sum is array" +(sum[i]));
    }*/

  }  
}
