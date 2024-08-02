import java.util.*;
class twoSum{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   

        int sum=sc.nextInt();
        int val=0;
        int []res = new int[2];

        for( int i=0; i<n-1;i++)
        {
                val = arr[i];
            for( int j=i+1;j<n;j++){
                    if((val+ arr[j]) == sum)
                        System.out.println("i="+i+"j="+j);
            }   
        }
    }
}