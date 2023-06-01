package in.ineuron.in;

public class SingleNumber {
	
	    public static int findSingleNumber(int[] nums) {
	        int result = 0;
	        for (int num : nums) {
	            // XOR operation cancels out the duplicates
	            result ^= num;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 2, 1};
	        int singleNumber = findSingleNumber(nums);
	        System.out.println("The single number is: " + singleNumber);
	    }
	}



