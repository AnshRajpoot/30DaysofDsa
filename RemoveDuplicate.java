package Task4Friday;

import java.util.HashMap;

public class RemoveDuplicate {
    static void remove(int[] arr) 
    {  
        HashMap<Integer, Boolean> mp = new HashMap<>();
 
        for (int i = 0; i < arr.length; ++i)
        {

            if (mp.get(arr[i]) == null)
                System.out.print(arr[i] + " ");
            mp.put(arr[i], true);
        }
    
    }
    public static void main(String[] args) {
        int [] arr = {3,5,3,7,8,5,10};
        remove(arr);
    }
}
