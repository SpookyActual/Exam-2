
import java.util.Arrays;


public class minimumFallingPathSum {
    
    public int minFallingPathSum(int A[][] ){
        
        int n = A.length;
        int fall[][] = new int[n][n];
        
        for (int i []:fall){
            Arrays.fill(i, -1);
        }
        
        int min=Integer.MAX_VALUE;
        
        for (int i=0; i<n;i++)
        {
            int val=helper(A,fall,0,i);
            min=Math.min(min,val);
        }
        return min;
    }
     private static int helper(int A[][], int fall[][], int row, int col)
    {
        int n=A.length;
        if(row==n)
            return 0;
        
        if(col<0||col>=n)
            return Integer.MAX_VALUE-1000;
        
        if(fall[row][col]!=-1)
            return fall[row][col];

        int val1=helper(A,fall,row+1,col);
        int val2=helper(A,fall,row+1,col+1);
        int val3=helper(A,fall,row+1,col-1);
        
        int val=Math.min(val1,Math.min(val2,val3));
        if(val==Integer.MAX_VALUE)
            return val1;
        
        else val+=A[row][col];
        fall[row][col]=val;
        return val;
    }
}
