
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
   /*By using array fall, we can examine and store the paths taken recursively while comparing to array A, this is in part of Ideal(Identify the problem,) the problem being that there is a 2d array
    *path, but it is not established what path is the most optimal, which is my goal, iDeal. 
    *In Exploring solutions, idEal, there is not much room besides looking for a recursive solution that efficiently stores information so that when all calculation has been finished, the results can quickly be compared and determined which result is best. 
    *The helper method then recursively calls itself 3 times, each time for each possible next step in the path to take,
    *which is basically left, right, and forward (respecitvely, -1, +1, and col.)
    *in Anticipation of the outcomes and Acting, ideAl, the three 3 calls the helper method recursively makes are stored as their own values so that they may be compared in an effort to determine which path is optimal.
    *Looking and Learning, I realize that by utilizing the fact that the path steps could only be one of 3 choices, I was able to figure out how to store my information and also how to recursively call the method so it may perform it's job.
    */
}
