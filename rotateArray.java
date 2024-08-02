import java.util.*;

class rotateArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr= new int[n];

        for(int i=0; i <n ; i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        int[] arr2 = new int[n];
        int j=1;
        while(k > 0)
        {
            
            arr2[0]=arr[n-1];
            for(int i=0;i<n-1;i++){
                arr2[j]= arr[i];
                j++;
                //if(j== n)
                //    break;
            }

            for(int l=0;l<n;l++)
                arr[l]=arr2[l];

            k--; 
            j=1;
           
        }
        for(int l=0;l<n;l++)
                System.out.print(arr[l]+" ");

        System.out.println();
    }
}