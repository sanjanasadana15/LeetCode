import java.util.Scanner;
class division{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a == -2147483648)    
            a=-2147483647;
        System.out.println(a/b);

    }
}