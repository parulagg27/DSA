package dsa.tests.maxInvestment;

import java.util.List;

public class MaxInvestment {

    /**
     * @Time_complexity O(n * m * 3)
     * @Space_complexity O(n)
     */
    public static int maxValue(int investmentsCount, List<List<Integer>> contributions) {
        int maxInvestment = 0;
        int[] assets = new int[investmentsCount];

        for (List<Integer> contribution: contributions) {
            int start = contribution.get(0);
            int end = contribution.get(1);
            int contributionAmount = contribution.get(2);
            for (int i = start - 1; i < end; i++) {
                assets[i] += contributionAmount;
                if (assets[i] > maxInvestment) maxInvestment = assets[i];
            }
        }

        return maxInvestment;
    }

    /**
     * @Time_complexity O(m + n)
     * @Space_complexity O(n)
     * Explanation: Can eliminate updating each element in asset. Rather do 2 operations per query,
     * to track cumulative sum. And subtract values if they don't continue after a certain index, to take delta forward for new values
     */
    public static int maxValueByEliminationAndCumulativeSum(int n, List<List<Integer>> queries) {
        int[] assets = new int[n];

        for (List<Integer> contribution: queries) {
            int start = contribution.get(0);
            int end = contribution.get(1);
            int contributionAmount = contribution.get(2);
            assets[start - 1] += contributionAmount;
            if (end < n) assets[end] -= contributionAmount;
        }

        int totalSum = 0;
        int maxInvestment = Integer.MIN_VALUE;
        for (int asset: assets) {
            totalSum += asset;
            if (totalSum > maxInvestment) maxInvestment = totalSum;
        }
        return maxInvestment;
    }
}
