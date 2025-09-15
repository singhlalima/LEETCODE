class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n <= 2) return 0;

        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        int trappedWater = 0;

        
        int maxi = height[0];
        maxLeft[0] = maxi;
        for (int i = 1; i < n; i++) {
            maxi = Math.max(maxi, height[i]);
            maxLeft[i] = maxi;
        }

        
        maxi = height[n - 1]; 
        maxRight[n - 1] = maxi;
        for (int i = n - 2; i >= 0; i--) {
            maxi = Math.max(maxi, height[i]);
            maxRight[i] = maxi;
        }

    
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}
