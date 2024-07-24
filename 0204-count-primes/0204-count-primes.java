class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2
        
        boolean[] isPrime = new boolean[n]; // Create a boolean array to mark primes
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Initialize all numbers as potential primes
        }
        
        // Mark multiples of primes as non-prime
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.countPrimes(10)); // Output: 4
    }
}
