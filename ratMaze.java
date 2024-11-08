
import java.util.*;
class ratMaze{

    public static List<String> Path(int[][] mat){
        List<String> ans = new ArrayList<>();
        int n= mat.length;
        func(mat,ans,n,0,0,"");
        return ans;
    }

    public static void func(int[][] mat, List<String>ans,int n, int i,int j,String s){
        if((i == n-1) && (j == n-1)){
            if(mat[i][j]== 1){
                ans.add(s);
                return;
            }

           
        }
        if(i < 0 || j < 0 || i >= mat.length || j >= mat.length || mat[i][j] ==0) {
            return;
        }
        mat[i][j]=0;
        func(mat,ans,n,i,j+1,s+"R");
        func(mat,ans,n, i-1,j,s+"U");
        func(mat,ans,n,i,j-2,s+"L");
        func(mat, ans, n, i+1, j, s+"D");
        mat[i][j]=1;
    }
    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 1, 1, 0, 0 },
                         { 0, 1, 1, 1 } };
        List<String> ans = new ArrayList<>();
        ans = Path(maze);
        System.out.println(ans);

    }
}