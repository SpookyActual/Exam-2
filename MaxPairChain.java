
import java.util.Arrays;


public class MaxPairChain {
       public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (pairOne,pairTwo) -> {
            if(pairOne[1] < pairTwo[1])return -1;
            if(pairOne[1] > pairTwo[1])return 1;
            return 0;
        });
        int[] arr = new int[pairs.length];
        Arrays.fill(arr,1);
        for(int i = 1; i < pairs.length; ++i){
            for(int j = 0; j < i; ++j){
                if(isGreater(pairs[i],pairs[j])){
                    arr[i] = Math.max(arr[i],1 + arr[j]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            max = Math.max(i,max);
        }
        return max;
    }
       
    public boolean isGreater(int[] pairOne,int[] pairTwo){
        return pairOne[0] > pairTwo[1];
    }
}

/*Duke 7 steps
*Working some small instances by hand, even in a large number of pairs, only 2 pairs are being compared at a time. And they only have to pass 2 comparative tests. 
*The first number of the pair must be smaller than the second number, and the 2nd number of the first pair must be smaller than the first number of the second pair.
*So [1,2][3,4] works, and so does [1,2][99,100]. 
*Knowing this, this is our first step, to compare pairs. Then, we need to keep track of how many "chains" we can make out of the pairs given. 
*Each pair in the chain must be able to pass the comparative test, not just with a single pair in the chain, but it is not necessary that each pair must have a smaller AND a larger pair.
*These requirements establish a pattern of creating numerical order with the pairs, tho not every number and pair needs to be accounted for.
*In effect, we only need one method to determine if each pair of pairs makes a chain, and then add them to a chain.
*Again, working more small instances and tracing shows that cases such as [1,2][44,55][88,100] work, even though they may not appear "clean" or "right."
*Translating, testing, and debugging the code is the more lengthy part but working from the previously established info makes the process a lot more approachable.
*/
