class Solution {
    public int countOdds(int low, int high) {
        int countUpToHigh = (high + 1) / 2;
        int countBeforeLow = low / 2;
        return countUpToHigh - countBeforeLow;
    }
}
