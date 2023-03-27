import java.util.Arrays;
//给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
//
//        算法的时间复杂度应该为 O(log (m+n)) 。
public class Problem4 {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] arr = new int[length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i <nums2.length ; i++) {
            arr[nums1.length+i]= nums2[i];
        }
        Arrays.sort(arr);
        if (length%2==0) {
            return (arr[length/2-1]+arr[length/2])/2.0;
        }
        return arr[length/2];
    }
}
