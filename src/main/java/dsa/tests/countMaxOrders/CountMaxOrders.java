package dsa.tests.countMaxOrders;

import java.util.Arrays;
import java.util.Comparator;

public class CountMaxOrders {

    /**
     * @Time_complexity O(n) + O(n*log(n))
     * @Space_complexity O(n): for orders array
     */
    public static int countOrders(int[] D, int[] C, int P) {
        int N = D.length;
        int[][] orders = new int[N][2];
        for (int index = 0; index < N; index++) {
            orders[index][0] = D[index];
            orders[index][1] = C[index];
        }
        Arrays.sort(orders, Comparator.comparingInt((int[] distanceA) -> distanceA[0]));
        int maxMonitorsDeliverable = 0;
        int orderCount = 0;
        for (int i = 0; i < N; i++) {
            int monitorCount = orders[i][1];
            if (maxMonitorsDeliverable + monitorCount <= P) {
                maxMonitorsDeliverable += monitorCount;
                orderCount ++;
            } else break;
        }
        return orderCount;
    }
}
