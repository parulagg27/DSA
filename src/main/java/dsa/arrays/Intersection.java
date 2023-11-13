package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection {

    /**
     * @Time_complexity O(n + m). O(n) to convert nums into set, O(m) to convert nums2 to set &
     * contains/in operations are O(1) in the average case
     * @Space_complexity O(n + m) since creating new set to iterate over values. In worst case, if all values are different,
     * time complexity will be O(n + m): n = size of nums1, m = size of nums2
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return null;
        var uniqueNums1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        var uniqueNums2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        if (uniqueNums2.equals(uniqueNums1)) return uniqueNums2.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> common = new ArrayList<>();

        for (int number: uniqueNums1){
            if (uniqueNums2.contains(number)) common.add(number);
        }
        return common.stream().mapToInt(Integer::intValue).toArray();
    }
}
