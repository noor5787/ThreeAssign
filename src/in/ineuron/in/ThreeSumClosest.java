package in.ineuron.in;
import java.util.Arrays;

public class ThreeSumClosest {


	    public static int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums); // Sort the array in ascending order
	        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum to the sum of the first three elements

	        for (int i = 0; i < nums.length - 2; i++) {
	            int left = i + 1;
	            int right = nums.length - 1;

	            while (left < right) {
	                int sum = nums[i] + nums[left] + nums[right];
	                if (sum == target) {
	                    return sum; // If the sum is equal to the target, return the sum
	                }

	                // Update the closest sum if the current sum is closer to the target
	                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
	                    closestSum = sum;
	                }

	                if (sum < target) {
	                    left++; // Increment left pointer if the sum is smaller than the target
	                } else {
	                    right--; // Decrement right pointer if the sum is larger than the target
	                }
	            }
	        }

	        return closestSum;
	    }

	    public static void main(String[] args) {
	        int[] nums = {-1, 2, 1, -4};
	        int target = 1;
	        int result = threeSumClosest(nums, target);
	        System.out.println("Output: " + result);
	    }
	}



