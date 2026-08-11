class Solution {
    int floorSqrt(int n) {
        // int root = 0;
        // if(n == 1)
        // {
        //     return 1;
        // }
        
        // for(int i = 1; i < n; i++)
        // {
        //     if(i * i > n)
        //     { 
        //         break;
        //     }
        //     root = i;
        // }
        
        // return root;
        
        int low = 1;
        int high = n;
        
        int root = 0;
        
        if(n == 1)
        {
            return 1;
        }
        
        for(int i = 1; i < n; i++)
        {
            int mid = (low + high) / 2;
            
            if(mid * mid == n)
            {
                root = mid;
            }
            else if(mid * mid > n)
            {
                high = mid - 1;
            }
            else if(mid * mid < n)
            {
                low = mid + 1;
                root = mid;
            }
        }
        
        return root;
    }
}