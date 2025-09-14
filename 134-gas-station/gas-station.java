class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int idx[] = new int[n];
        int total = 0;   // overall balance of gas
        int tank = 0;    // current tank balance
        int j = 0;
        int count = 0;
        int start = 0;   // candidate start index

        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            if (tank < 0) {
                // cannot start from `start`, move start to i+1
                start = i + 1;
                tank = 0;
            }
        }

        if (total >= 0) {
            idx[j] = start; // store the valid start index
            count++;
            return idx[0];
        } else {
            return -1;
        }
    }
}
