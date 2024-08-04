import java.util.*;
class reverseWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s="a good   example";

        System.out.println("s:"+s);
        int n=s.length();
        int i=0;
        String ans="";
        String temp="";
        while(i < n){
                if(s.charAt(i) == ' ')
                {
                    if(ans ==""){
                      //  temp="";
                        ans=temp;
                        
                       
                    }
                    else if(temp=="")
                        ans=temp+ans;
                    else{
                        
                        ans=temp+" "+ans;
                    }
                       
                temp="";
                   
                }
                else
                    temp+=s.charAt(i);
                i++;
                //temp="";
        }
        if(temp !=""){
            if(ans == "")
                ans=temp;
            else
                ans=temp+ " "+ans;
        }

        System.out.println("ans:"+ans);
    }
}