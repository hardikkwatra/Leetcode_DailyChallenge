public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        System.gc();
      return Integer.bitCount(n);
    }
}