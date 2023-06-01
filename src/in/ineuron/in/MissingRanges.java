package in.ineuron.in;
import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	
	

	    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
	        List<List<Integer>> result = new ArrayList<>();
	        
	        // Handle the lower boundary
	        if (nums.length == 0 || nums[0] > lower) {
	            addRange(result, lower, nums[0] - 1);
	        }
	        
	        // Handle the middle ranges
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] > nums[i - 1] + 1) {
	                addRange(result, nums[i - 1] + 1, nums[i] - 1);
	            }
	        }
	        
	        // Handle the upper boundary
	        if (nums.length == 0 || nums[nums.length - 1] < upper) {
	            addRange(result, nums[nums.length - 1] + 1, upper);
	        }
	        
	        return result;
	    }
	    
	    private static void addRange(List<List<Integer>> result, int start, int end) {
	        if (start > end) {
	            return;
	        }
	        
	        List<Integer> range = new ArrayList<>();
	        range.add(start);
	        range.add(end);
	        result.add(range);
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {0, 1, 3, 50, 75};
	        int lower = 0;
	        int upper = 99;
	        
	        List<List<Integer>> missingRanges = findMissingRanges(nums, lower, upper);
	        
	        System.out.println("Missing Ranges:");
	        for (List<Integer> range : missingRanges) {
	            System.out.println(range.get(0) + " - " + range.get(1));
	        }
	    }
	}



