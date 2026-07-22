class Solution {
    public boolean isPerfectSquare(int num) {
            long g = num;

        while (g * g > num) {
            g = (g + num / g) / 2;
        }

        return g * g == num;
        
    }
}