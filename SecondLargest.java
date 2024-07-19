package Task4Friday;

public class SecondLargest {
     public static void print2largest(int arr[], int n) {
        
        int max = 0;
        int secMax = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>secMax && arr[i]!=max){
                secMax = arr[i];
            }
        }
        
        System.out.println("Second largest element is "+secMax);
    }
    public static void main(String[] args) {
        int [] arr={12,35,1,10,34,1};
        int n=arr.length;
        print2largest(arr,n);
    }
}
