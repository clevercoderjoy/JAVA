class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int index = 0;
        while(index < intervals.length){
            if(intervals[index][0] < newInterval[0]){
                res.add(intervals[index]);
                index++;
            }
            else{
                break;
            }
        }
        
        if(res.size() == 0 || (newInterval[0] > res.get(res.size() - 1)[1])){
            res.add(newInterval);
        }
        else{
            int[] lastInterval = res.get(res.size() - 1);
            lastInterval[1] = Math.max(lastInterval[1], newInterval[1]);
        }
        while(index < intervals.length){
            int[] lastInterval = res.get(res.size() - 1);
            if(lastInterval[1] >= intervals[index][0]){
                lastInterval[1] = Math.max(lastInterval[1], intervals[index][1]);
            }
            else{
                res.add(intervals[index]);
            }
            index++;
        }
        return res.toArray(new int[res.size()][]);
    }
}