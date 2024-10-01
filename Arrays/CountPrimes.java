/*
Leetcode Problem
204. Count Primes

Description:
Count the number of prime numbers less than a non-negative number, n.
Tags: Hash Table, Math
Similar Problems: (E) Ugly Number, (M) Ugly Number II, (M) Perfect Squares
*/

/*
Attempt2: https://leetcode.com/problems/count-primes/ explains it well
1. Ignore 1 and n. Don't count 1 and the number itself in.
2. Assume all numbers are prime in a boolean[]. Check off those are certainly not prime, the remaining will be prime.
3. For any n, only need to check up to i * i < n; more than that, 
for example 2 x 6 is same as checking 6x2, but 6x2 is not necessary to check.
4. How to mark things off:
	The first non-prime is always i^2: self * self.
	Then more non-primes:self * self, self * (self + 1), self * (self + 2) ... etc.
	So, mark all of these index of in the boolean[]

 Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
	
*/
class Solution {
    public int countPrimes(int n) {
        if (n <= 1) {
    		return 0;
    	}
    	boolean[] primes = new boolean[n]; // less than n, end prime[n-1]
    	for (int i = 2; i < primes.length; i++) {
    		primes[i] = true;
    	}

    	for (int i = 2; i * i < n; i++) {
			if (!primes[i]) {
				continue;
			}
    		for (int j = i * i; j < n; j += i) {
    			primes[j] = false;
    		}
    	}
    	int count = 0;
    	for (int i = 2; i < primes.length; i++) {
    		count += primes[i] ? 1 : 0;
    	}
    	return count;
    }
}
