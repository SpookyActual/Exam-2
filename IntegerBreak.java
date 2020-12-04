
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
