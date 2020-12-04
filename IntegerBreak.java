
public class IntegerBreak {
    public int integerBreak(int n) {
        int[] ib = new int[n+1];
        if(n == 2) return 1;
        ib[2] = 1;
        ib[3] = 2; 
        
        for(int i = 4; i <= n; i++){
        
            for(int j = 2; j <= i/2; j++){ 
                ib[i] = Math.max(ib[i], Math.max(j * ib[i-j], j * (i-j)));
            }
        }
        
        return ib[n];
    } 
}
/*
Identify the problem:A number must be broken down into atleast two integers and then those integers must be mazimized, finding the maximum possible output.
Define goal:Break number into all possible combinations of numbers that sum up to given number.  Then multiply these sets of numbers and find largest number from results.
Explore solutions: Use a number counter to count up to given number, all the while taking eaching number and finding their multiples to then find max number via recursively calling Math.max
Anticipating outcomes and acting: account for base cases, and attempt to implement what we know in our base cases to speed up the process of multpilcation and elimination. (For instance, any number multiplied by one is itself, which will most definitely not be the max possible number, so we skip 1)
Look and Learn: By establishing base cases, I was able to cut corners in multiple levels of depth (does that make sense?) and came out with hopefully an efficient solution.
*/