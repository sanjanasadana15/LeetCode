import java.util.Scanner;

class plusOne{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
       
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int result=0;
        for(int i=0;i<n;i++)
        {
            result= result*10+a[i];
        }
        result=result+1;
        System.out.println(result);
        int val=result;
        int len=0;
        while(val >0){
            val=val/10;
            len++;
        }
        System.out.println(len);
        int[] b=new int[len];
        for(int i=len-1;i>=0;i--){
            b[i]=result%10;
            result=result/10;
        }
        for(int i=0; i<len; i++){
            System.out.print(b[i]+" ");
        }
        

    }
}