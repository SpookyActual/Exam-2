
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


