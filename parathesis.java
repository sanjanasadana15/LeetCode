import java.util.*;

class parathesis{
    public static List<String> GenerateParenthesis(int n){
        List<String> ans = new ArrayList<>();
        func(ans,n,0,0,"");
        return ans;
    }
    public static void func(List<String> ans, int N,int open, int close, String s){

        if(open == N && open == close )
            ans.add(s);
        
        if(open < N){
            func(ans,N,open+1,close,s+"(");
        }

        if(open > close){
            func(ans,N,open,close+1,s+")");
        }
    }
    public static void main(String[] args) {
        int n=3;
        List <String> ans= new ArrayList<>();

        ans=GenerateParenthesis(n);
        System.out.println(ans);
    }
}