class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] interval : intervals){
            if(interval[0] <= end){
                end = Math.max(interval[1], end);
            }
            else{
                res.add(new int[] {start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        res.add(new int[] {start, end});
        return res.toArray(new int[0][]);
    }
}