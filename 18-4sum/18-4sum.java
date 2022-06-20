class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
           Arrays.sort(nums);
       List<List<Integer>> list = new ArrayList();
       long target1 = target;

    for(int j=0;j<=nums.length-4;j++)
    {
        if(j> 0 && nums[j]==nums[j-1]) continue; //skip duplicates
        for(int i=j+1;i<=nums.length-3;i++)
        {
             if(i> j+1 && nums[i]==nums[i-1]) continue;  //skip duplicates
          int first = i+1;
          int last = nums.length-1;
          while(first<last)
          {
              long firstTarget =   nums[first] + nums[last];  //Important to take as long to avoid overflow
              long secondTarget =  nums[i] + nums[j];
             if( firstTarget + secondTarget< (long)target1)  first++;
             else if(firstTarget + secondTarget> (long)target1)  last--;
              else
              {
                   List<Integer> newList = new ArrayList();
                  newList.add(nums[j]);
                  newList.add(nums[i]);
                  newList.add(nums[first]);
                  newList.add(nums[last]);
                  list.add(new ArrayList<>(newList));
                  while (first <last && nums[first] == nums[first+1]) first++; //very important
                    while (first < last && nums[last] == nums[last-1]) last--; //lines of code to skip duplicates
                  first++;
                  last--;
            }
          }
        }
    }
        return list;
    }
}