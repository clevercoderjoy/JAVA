class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bigMap = new HashMap<>();
        for(String str : strs){
            HashMap<Character, Integer> fMap = new HashMap<>();
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                fMap.put(ch, fMap.getOrDefault(ch, 0) + 1);
            }
            if(bigMap.containsKey(fMap) == false){
                ArrayList<String> lst = new ArrayList<>();
                lst.add(str);
                bigMap.put(fMap, lst);
            }
            else{
                ArrayList<String> lst = bigMap.get(fMap);
                lst.add(str);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(ArrayList<String> val : bigMap.values()){
            res.add(val);
        }
        return res;
    }
}