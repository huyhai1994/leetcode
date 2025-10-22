package merge_two_array;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArray = new int[m + n];
        int i = 0, a = 0, b = 0;
        while (a < m && b < n) {
            if (nums1[a] <= nums2[b]) {
                tempArray[i] = nums1[a];
                i++;
                a++;
            } else {
                tempArray[i] = nums2[b];
                i++;
                b++;
            }
        }
        while (a < m) tempArray[i++] = nums1[a++];
        while (b < n) tempArray[i++] = nums2[b++];
        System.arraycopy(tempArray, 0, nums1, 0, tempArray.length);

    }
}
