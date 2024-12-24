public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        int target = 5;

        System.out.println(search(arr, target));
    }


    public static int search(int[] nums, int target) {

        int pivot = Ans(nums);

        int First = Solution(nums, target, 0, pivot);
        if (First != -1) {
            return First;
        }

        return Solution(nums, target, pivot + 1, nums.length - 1);

    }

    static int Ans(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        if (start == end) {
            return start;
        }

        return -1;
    }


    static int Solution(int[] array, int tar, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == tar) {
                return mid;

            } else if (array[mid] > tar) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

}

