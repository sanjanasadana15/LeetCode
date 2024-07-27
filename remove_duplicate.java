import java.util.Scanner;   

class remove_duplicate{
    public static void main(String[] args){
        int[] a={0,0,1,1,1,2,2,3,3,4};
        int n=a.length;

        int unique =1;
        

        for(int i=1;i<n; i++){
            if(a[i] != a[i-1]){
                a[unique]=a[i];
                unique++;
            }

        }
        for(int j=0; j<unique; j++)
            System.out.print(a[j]+" ");
        System.out.println();

        
            

        System.out.println();
    }
}