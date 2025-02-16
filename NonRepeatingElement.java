public class NonRepeatingElement {
    public static int findFirstNonRepeating(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i]; // Found the first non-repeating element
            }
        }
        return -1; // No unique element found
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 4, 3, 53};
        int result = findFirstNonRepeating(nums);
        System.out.println("First Non-Repeating Element: " + result);
    }
}
