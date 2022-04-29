/*
436. Find Right Interval
Medium

You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.
The right interval for an interval i is an interval j such that startj >= endi and startj is minimized.
Return an array of right interval indices for each interval i. If no right interval exists for interval i, then put -1 at index i.

Example 1:
Input: intervals = [[1,2]]
Output: [-1]
Explanation: There is only one interval in the collection, so it outputs -1.

Example 2:
Input: intervals = [[3,4],[2,3],[1,2]]
Output: [-1,0,1]
Explanation: There is no right interval for [3,4].
The right interval for [2,3] is [3,4] since start0 = 3 is the smallest start that is >= end1 = 3.
The right interval for [1,2] is [2,3] since start1 = 2 is the smallest start that is >= end2 = 2.

Example 3:
Input: intervals = [[1,4],[2,3],[3,4]]
Output: [-1,2,-1]
Explanation: There is no right interval for [1,4] and [3,4].
The right interval for [2,3] is [3,4] since start2 = 3 is the smallest start that is >= end1 = 3.

Constraints:

1 <= intervals.length <= 2 * 104
intervals[i].length == 2
-106 <= starti <= endi <= 106
The start point of each interval is unique.

SOL: https://www.youtube.com/watch?v=6NdOMsDMGps
https://leetcode.com/problems/find-right-interval/discuss/631133/Java-O(n-logn)-solution-HashMap-%2B-Sort-%2B-Binary-Search
 */

package LeetCode;
import java.util.*;

public class RightInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of interval matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][2];
        System.out.println("Enter the values for the interval matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The given matrix is: ");
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }
        System.out.println(Arrays.toString(findInterval(n, mat)));
    }

    static int[] findInterval(int n, int[][] mat){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sp = new int[n];
        for (int i = 0; i < n; i++) {
            sp[i] = mat[i][0];
            map.put(sp[i], i);
        }
        Arrays.sort(sp);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            boolean found = false;
            int min = -1, ep = mat[i][1];
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(sp[mid] >= ep){
                    min = sp[mid];
                    found = true;
                    end = mid - 1;
                }
                else
                    start = mid + 1;
            }
            res[i] = found ? map.get(min) : -1;
        }
        return res;
    }
}
