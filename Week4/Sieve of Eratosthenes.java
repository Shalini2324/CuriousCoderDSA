class Solution {
    public int[] sieve(int n) {
        // code here
        
        int[] a = new int[n + 1];   

        for (int i = 2; i * i <= n; i++) {
            if (a[i] == 0) {           
                for (int j = i * 2; j <= n; j += i) {
                    a[j] = 1;          
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (a[i] == 0) count++;
        }

        int[] primes = new int[count];
        int index = 0;

        for (int i = 2; i <= n; i++) {
            if (a[i] == 0) {
                primes[index++] = i;
            }
        }
        return primes;
    }
}

    
