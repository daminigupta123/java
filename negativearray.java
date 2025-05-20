public class negativearray {
    public static void main(String[] args) {
int[] arr={4,-8,0,5,2,-4};
int index=0;
int i;
int[] newarr=new int[arr.length];
for( i=0;i<arr.length;i++){ 
if(arr[i]<0)
{
    newarr[index++]=arr[i];
}
}       
  
for(int k=0;k<arr.length;k++)
{
    if(arr[k]==0)
    {
        newarr[index++]=arr[k];
    }
}
for(int j=0;j<arr.length;j++)
{
    if(arr[j]>0)
    {
        newarr[index++]=arr[j];
    }
}
  
for(int h=0;h<arr.length;h++)
{
    System.out.println(newarr[h]);
}
}
}  

