//LeetCode 1383 – Maximum Performance of a Team (Java).Time: O(n log k)

import java.util.*;

public class Main {

    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int MOD = 1_000_000_007;

        // engineer[i] = {efficiency, speed}
        int[][] eng = new int[n][2];
        for (int i = 0; i < n; i++) {
            eng[i][0] = efficiency[i];
            eng[i][1] = speed[i];
        }

        // sort by efficiency descending
        Arrays.sort(eng, (a, b) -> b[0] - a[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long speedSum = 0;
        long maxPerf = 0;

        for (int[] e : eng) {
            int eff = e[0];
            int spd = e[1];

            minHeap.add(spd);
            speedSum += spd;

            // keep only k speeds
            if (minHeap.size() > k) {
                speedSum -= minHeap.poll();
            }

            maxPerf = Math.max(maxPerf, speedSum * eff);
        }

        return (int) (maxPerf % MOD);
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) {
        int n = 6;
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] efficiency = {5, 4, 3, 9, 7, 2};
        int k = 2;

        int result = maxPerformance(n, speed, efficiency, k);
        System.out.println("Maximum Performance = " + result);
    }
}
