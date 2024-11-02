/***
 * Find the Maximum and Sum of the array.
 * Then find the mid between the max and sum.
 * Update the left and right accordingly.
 * check the boolean fun with 
 */


class ShipCapacity{
    public static int ShipCapacity(int[] arr, int days){
        int n=arr.length;
        int max=0;
        int sum = 0;
        for(int i=0; i< n ; i++){
            if( arr[i] > max){
                max=arr[i];
            }
            sum = sum+arr[i];
        }

        int l=max, r=sum;
        int result =0;
        while(l <= r){
            int mid =(l+r)/2;
            if(func(mid,arr,n,days) == true){
                result = mid;
                r=mid -1;
            }
            else
                l = mid +1;

        }
        return result;
        
    }
    public static boolean func(int mid,int[] arr, int n,int days){
            int day = 1;
            int capacity =0;
            for(int i=0; i<n; i++){
                    if( (capacity + arr[i]) <= mid){
                        capacity = capacity + arr[i];
                    }
                    else{
                        day++;
                        capacity= arr[i];
                    }
            }

            if( day <= days){
                return true;
            }
            else    
                return false;
    }
    public static void main(String[] args) {
        int[] weight = {3,2,2,4,1,4};
        int days = 3;
        int result = ShipCapacity(weight,days);
        System.err.println("Ship Capacity:"+result);

    }
}