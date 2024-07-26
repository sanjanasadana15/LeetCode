import java.util.Scanner;

class reverse{
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int val=n,dig=0;
        long rev=0;
        while(val!= 0)
        {
            dig=val%10;
            rev=(rev*10)+dig;          
            val/=10;

        }
        System.out.println(rev);
    }
}