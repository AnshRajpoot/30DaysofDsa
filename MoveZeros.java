package Task4Friday;

public class MoveZeros {

    public static void zeros(int [] a){
        for(int i=0;i<a.length+1;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]==0){
                    a[i]=a[j];
                    a[j]=0;
                    
                }
            }
            
        }
        for(int i=0;i<a.length;i++)
           System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int [] arr = {1,2,0,4,3,0,5,0};
        zeros(arr);

    }

}