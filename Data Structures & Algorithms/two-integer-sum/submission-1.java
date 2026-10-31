class Solution {
    public int[] twoSum(int[] arr, int target) {
        if(arr.length < 2) return new int []{};

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;

        while(i < arr.length) {
            int val = target - arr[i];
            if(map.containsKey(val)) {
                int comp = map.get(val);
                return new int []{comp, i};
            } map.put(arr[i], i);
            i++;
        }
        return new int []{};
    }
}
