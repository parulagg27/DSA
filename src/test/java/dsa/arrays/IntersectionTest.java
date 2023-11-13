package dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionTest {

    @Test
    void shouldReturnNullIfNoElementsPresentInAnyOfGivenList() {
        var output = Intersection.intersection(new int[0], new int[0]);

        Assertions.assertNull(output);
    }

    @Test
    void shouldReturnCommonElementsIfRepeatingElementsInGivenList() {
        int[] nums1 = new int[]{0, 1, 2, 2, 4, 7, 8, 13, 1};
        int[] nums2 = new int[]{2, 8, 3, 7, 0};

        var output = Intersection.intersection(nums1, nums2);

        Assertions.assertArrayEquals(new int[]{0, 2, 7, 8}, output);
    }

    @Test
    void shouldReturnEmptyListIfNoElementsInCommon() {
        int[] nums1 = new int[]{0,1,2};
        int[] nums2 = new int[]{10,11};

        var output = Intersection.intersection(nums1, nums2);

        Assertions.assertArrayEquals(new int[]{}, output);
    }

    @Test
    void shouldFindIntersectionForLargeInputSizeWithIdenticalValues(){
        int[] nums1 = new int[60000];
        int[] nums2 = new int[60000];
        for (int i = 0; i < 60000; i += 1) {
            nums1[i] = i;
            nums2[i] = i;
        }

        var output = Intersection.intersection(nums1, nums2);

        Assertions.assertArrayEquals(nums1, output);
    }
}