package others.medium;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

class IndexesSubarraySumTest {

    @org.junit.jupiter.api.Test
    void subarraySum() {
        assertArrayEquals(new int[]{2,4}, IndexesSubarraySum.subarraySum(new int[]{1, 2, 3, 7, 5}, 12).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{6,6}, IndexesSubarraySum.subarraySum(new int[]{19,23,15,6,6,2,28,2}, 2).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(new int[]{8,8}, IndexesSubarraySum.subarraySum(new int[]{16,13,24,32,21,48,4,9}, 9).stream().mapToInt(i -> i).toArray());
    }
}