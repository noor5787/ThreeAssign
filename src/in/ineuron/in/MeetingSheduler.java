package in.ineuron.in;
import java.util.Arrays;
public class MeetingSheduler {
	


	    public static boolean canAttendAllMeetings(int[][] intervals) {
	        // Sort the intervals based on the start time
	        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

	        // Check for any overlapping intervals
	        for (int i = 1; i < intervals.length; i++) {
	            if (intervals[i][0] < intervals[i - 1][1]) {
	                // Overlapping intervals found
	                return false;
	            }
	        }

	        // No overlapping intervals found
	        return true;
	    }

	    public static void main(String[] args) {
	        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
	        boolean canAttend = canAttendAllMeetings(intervals);
	        System.out.println("Can attend all meetings: " + canAttend);
	    }
	}



