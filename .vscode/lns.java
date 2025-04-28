public class lns {
    public static int lens(int[] arr,int search) {

for(int i=0;i<arr.length;i++)
{
        if(arr[i]==search){
        return i;

    }
}return -1;
}   
    
    public static void main(String[] args) {
        int arr[]={2,4,5,3,7,6,2};
        
        System.out.println(lens(arr,6));
    }
}
